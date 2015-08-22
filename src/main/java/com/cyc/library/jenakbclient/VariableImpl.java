/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cyc.library.jenakbclient;

import com.cyc.kb.BinaryPredicate;
import com.cyc.kb.Context;
import com.cyc.kb.Fact;
import com.cyc.kb.KBCollection;
import com.cyc.kb.KBIndividual;
import com.cyc.kb.KBObject;
import com.cyc.kb.KBPredicate;
import com.cyc.kb.Sentence;
import com.cyc.kb.Variable;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.DeleteException;
import com.cyc.kb.exception.InvalidNameException;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBTypeException;
import com.cyc.session.SessionApiException;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.rdf.model.NodeIterator;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vijay
 */
public class VariableImpl extends KBObjectImpl implements Variable {

  public VariableImpl (String varName) throws Exception {
    Individual i = KBObjectImpl.getBaseContextModel().createIndividual(((KBCollectionImpl)Constants.getInstance().RIF_VAR_COL).getCore());
    core = i;
    KBObjectImpl.getBaseContextModel().add(
            ((Individual)((VariableImpl)this).getCore()), 
            (OntProperty)((KBPredicateImpl)Constants.getInstance().RIF_VARNAME_PRED).getCore(), 
            varName);    
    
  }
  
  @Override
  public Individual getCore() {
    return (Individual) core;
  }
  
  @Override
  public String getName() {
    NodeIterator ni;
    try {
      ni = KBObjectImpl.getBaseContextModel().listObjectsOfProperty(
              ((Individual)((VariableImpl)this).getCore()),
              (OntProperty)((KBPredicateImpl)Constants.getInstance().RIF_VARNAME_PRED).getCore());
      if (ni.hasNext()) {
      return ni.next().asLiteral().getString();
    }
    } catch (Exception ex) {
      Logger.getLogger(VariableImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return "";
    
  }

  
}
