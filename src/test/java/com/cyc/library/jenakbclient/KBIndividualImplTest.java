/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cyc.library.jenakbclient;

import com.cyc.kb.KBCollection;
import com.cyc.kb.KBIndividual;
import com.cyc.kb.KBPredicate;
import com.cyc.kb.Variable;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.graph.NodeFactory;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.impl.RDFListImpl;
import com.hp.hpl.jena.reasoner.rulesys.Node_RuleVariable;
import com.hp.hpl.jena.tdb.TDBFactory;
import com.hp.hpl.jena.vocabulary.RDF;
import com.hp.hpl.jena.vocabulary.RDFS;
import java.io.FileWriter;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFFormat;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author vijay
 */
public class KBIndividualImplTest {
  
  public KBIndividualImplTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void testSomeMethod() throws Exception {
    KBIndividual i = new KBIndividualImpl("http://example.com/onto#VijayRaj");
    
    
    KBCollection c = new KBCollectionImpl("http://example.com/onto#Person");
    
    ((OntClass)c.getCore()).createIndividual(((Individual)i.getCore()).getURI());
            
    // ((Individual)i.getCore()).addOntClass(((OntClass)c.getCore()));
    FileWriter fw = new FileWriter("/scratch/WORK2/jena/testModels/test.xml");
    // KBObjectImpl.getModel().write(fw, "RDF/XML-ABBREV");
    
    RDFDataMgr.write(fw, KBObjectImpl.getBaseContextModel(), RDFFormat.NQUADS_UTF8);
    
    System.out.println("Cols: " + i.instanceOf());
  }
  
   @Test
  public void testSomeMethod2() throws Exception {
    Dataset ds = TDBFactory.createDataset("/scratch/WORK2/jena/dataset2/");
    
    OntModel model1 = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, ds.getNamedModel("vijaym1"));
    OntModel model2 = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, ds.getNamedModel("vijaym2"));
    OntClass thing = model1.createClass("http://www.w3.org/2002/07/owl#Thing");
    model1.createIndividual("http://example.com/onto1#VijayRaj", thing);
    model2.createIndividual("http://example.;cegilovcom/onto2#VijayRaj", thing);
    Model m = model1.union(model2);
    
    FileWriter fw = new FileWriter("/scratch/WORK2/jena/testModels/mergetestds.xml");
    RDFDataMgr.write(fw, ds, RDFFormat.NQUADS_UTF8);
    
  
  }
  
  @Test
  public void testSomeMethod3() throws Exception {
    KBCollection animal = new KBCollectionImpl(Constants.CYC_TBOX_NS.concat("Animal"));
    KBCollection male = new KBCollectionImpl(Constants.CYC_TBOX_NS.concat("MaleAnimal"));
    KBCollection female = new KBCollectionImpl(Constants.CYC_TBOX_NS.concat("FemaleAnimal"));
    KBCollection person = new KBCollectionImpl(Constants.CYC_TBOX_NS.concat("Person"));
    
    KBCollection malePerson = new KBCollectionImpl(Constants.CYC_TBOX_NS.concat("MalePerson"));
    KBIndividual vijay = new KBIndividualImpl(Constants.CYC_ABOX_NS.concat("VijayRaj"), malePerson);
    KBIndividual ishaan = new KBIndividualImpl(Constants.CYC_ABOX_NS.concat("IshaanRaj"), malePerson);
    
    KBPredicate father = new KBPredicateImpl(Constants.CYC_TBOX_NS.concat("father"));
    
    
//    ((OntProperty)((KBPredicateImpl)father).getCore()).addRange(((KBCollectionImpl)animal).getCore());
//    ((OntProperty)((KBPredicateImpl)father).getCore()).addDomain(((KBCollectionImpl)male).getCore());
    
    father.addArgIsa(1, male, null);
    father.addArgIsa(2, animal, null);
    
//    ((Individual)((KBIndividualImpl)vijay).getCore()).addProperty((OntProperty)((KBPredicateImpl)father).getCore(), ((KBIndividualImpl)ishaan).getCore());
    KBObjectImpl.getBaseContextModel().add(((Individual)((KBIndividualImpl)vijay).getCore()), (OntProperty)((KBPredicateImpl)father).getCore(), ((KBIndividualImpl)ishaan).getCore());    
    
    FileWriter fw = new FileWriter("/scratch/WORK2/jena/testModels/test3.xml");
    RDFDataMgr.write(fw, KBObjectImpl.getDataset(), RDFFormat.NQUADS_UTF8);
    
    System.out.println("Cols: " + ishaan.instanceOf());
  }
  
  @Test
  public void testTurtle() throws Exception {
    Model m = RDFDataMgr.loadModel("/scratch/WORK2/jena/testModels/test.ttl", Lang.TTL);
    FileWriter fw = new FileWriter("/scratch/WORK2/jena/testModels/ttlAsTriple.triple");
    
    RDFDataMgr.write(fw, m, Lang.NTRIPLES);
  }
  
  @Test
  public void testRule() throws Exception {
    Node var = NodeFactory.createAnon();
    
    System.out.println("Node: " + var);
    
    KBCollection varCol = new KBCollectionImpl("http://www.w3.org/2007/rif#var");
    RDFNode varRdf = KBObjectImpl.getBaseContextModel().asRDFNode(var);
    System.out.println("RDF Node: " + varRdf);

    Resource varRes = varRdf.asResource();
    System.out.println("Resource: " + varRes.getLocalName() + ", " + varRes.getNameSpace() + ", " + varRes.getURI());
    // Individual varInd = ((KBCollectionImpl)varCol).getCore().createIndividual();//.createIndividual(varRes.getURI());
    // KBObjectImpl.getBaseContextModel().createIndividual(((KBCollectionImpl)varCol).getCore());
    
    Variable v = new VariableImpl("vijayvar");
    System.out.println("Var Name: " + v.getName());
    FileWriter fw = new FileWriter("/scratch/WORK2/jena/testModels/test4.xml");
    RDFDataMgr.write(fw, KBObjectImpl.getDataset(), RDFFormat.NQUADS);
    
  }
  
  @Test
  public void testStatements() throws Exception {
    String bio_ns = "http://example.com/biology#";
    KBCollection human = new KBCollectionImpl(bio_ns + "human");
    Variable v = new VariableImpl ("person");
    
    KBObjectImpl.getBaseContextModel().createList(new RDFNode[] {((Resource)human.getCore()), ((Resource)v.getCore())});
    FileWriter fw = new FileWriter("/scratch/WORK2/jena/testModels/test5.xml");
    
    
    KBPredicate father = new KBPredicateImpl(Constants.CYC_TBOX_NS.concat("father"));
    
    Statement s;
    s = KBObjectImpl.getBaseContextModel().createStatement(((KBCollectionImpl)Constants.owlThing()).getCore(), (OntProperty)((KBPredicateImpl)father).getCore(), ((VariableImpl)v).getCore());
    KBObjectImpl.getBaseContextModel().add(s);
    
    KBObjectImpl.getBaseContextModel().createReifiedStatement(s);
    
    RDFDataMgr.write(fw, KBObjectImpl.getDataset(), RDFFormat.NQUADS);
  }
}
