/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cyc.library.jenakbclient;

import com.hp.hpl.jena.query.*;
import com.hp.hpl.jena.query.ResultSet ;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.ontology.*;
import com.hp.hpl.jena.util.FileManager;
import com.hp.hpl.jena.util.LocationMapper;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;

public class JenaUtils
{
  // Models will be read from cache, if cache does not have the model, then we
  // fall back to local files. Once read the information will be held in cache.
  // This will be global cache, and is mutable. Since we do not plan to write
  // to these models, it should be fine.
  // modelFile can be file name or URI
  public static Model readModelFromFile(String modelFile)
  {
    Model aModel = ModelFactory.createDefaultModel();

    System.out.print("Reading from ");

    if (FileManager.get().hasCachedModel(modelFile))
    {
      System.out.print("cache: ");
      aModel = FileManager.get().getFromCache(modelFile);
    }
    else
    {
      System.out.print("file:  ");
      InputStream in = FileManager.get().open( modelFile );
      if (in == null) {
        throw new IllegalArgumentException( "File: " + modelFile + " not found");
      }
      aModel.read(in, ""); 
      
      FileManager.get().addCacheModel(modelFile, aModel);
    }
    System.out.println(modelFile);

    return aModel;
  }

  public static void writeModelToFile(Model aModel, String outFile)
  {
    // String outFile = "ontologies/local/temp/temp.owl";

    try{
      FileOutputStream fout = new FileOutputStream(outFile);
      aModel.write(fout);
    }catch(IOException e){
      System.out.println("Exception caught"+e.getMessage());
    }

  }

  public static OntModel readOntModelFromFile(String ontModelFile)
  {
    OntModel aOntModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);

    InputStream in = FileManager.get().open( ontModelFile );
    if (in == null) {
      throw new IllegalArgumentException( "File: " + ontModelFile + " not found");
    }

    aOntModel.read(in, ""); 

    return aOntModel;
  }
  
  public static HashMap<String, Model> readModelFromDir(String modelDir)
  {
    File folder = new File(modelDir);
    HashMap <String, Model> dirModels = new HashMap<String, Model> ();
    
    for (File aFile : folder.listFiles()) 
    {
      if (aFile.isFile() && aFile.getName().endsWith(".owl")) 
      {
        Model aModel = readModelFromFile(aFile.getName());
        dirModels.put(aFile.getName(), aModel);
      }
    }

    return dirModels;
  }

  public static List<QuerySolution> execQueryGetResList(String aQueryString, Model aModel)
  {
    List<QuerySolution> resList = new ArrayList<QuerySolution> ();
    
    Query query = QueryFactory.create(aQueryString) ;

    QueryExecution qexec = QueryExecutionFactory.create(query, aModel);

    ResultSet rs = qexec.execSelect();

    resList = ResultSetFormatter.toList(rs);
    
    return resList;
  }

}