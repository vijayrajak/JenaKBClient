/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cyc.library.jenakbclient;

import com.cyc.kb.Context;
import com.cyc.kb.Fact;
import com.cyc.kb.KBCollection;
import com.cyc.kb.KBPredicate;
import com.cyc.kb.Relation;
import com.cyc.kb.Sentence;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBTypeException;
import com.cyc.kb.exception.VariableArityException;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import java.util.Collection;
import java.util.List;

/**
 * By making {@link KBPredicate} a sub-class of {@link KBIndividual} we are allowing
 * the possibility of the reasoner using second order logic to reason over a 
 * class of predicates. 
 * @author vijay
 */
public class KBPredicateImpl extends RelationImpl implements KBPredicate {

  public KBPredicateImpl(String uri) {
    super();
    core = KBObjectImpl.getBaseContextModel().createOntProperty(uri);

  }
  
  
  /**
   * 
   * @return It will always be {@link Property}
   */
  @Override
  public Resource getCore() {
    return (OntProperty) core;
  }


  @Override
  public Collection<KBPredicate> getSpecializations() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBPredicate> getSpecializations(String ctxStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBPredicate> getSpecializations(Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBPredicate addSpecialization(String moreSpecificStr, String ctxStr) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBPredicate addSpecialization(KBPredicate moreSpecific, Context ctx) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBPredicate> getGeneralizations() throws KBApiException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Sentence getGeneralizationSentence(KBPredicate moreGeneral) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Sentence getInverseGeneralizationSentence(KBPredicate moreGeneral) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBPredicate> getGeneralizations(String ctxStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBPredicate> getGeneralizations(Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBPredicate addGeneralization(String moreGeneralStr, String ctxStr) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBPredicate addGeneralization(KBPredicate moreGeneral, Context ctx) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean isGeneralizationOf(KBPredicate moreSpecific, Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<Fact> getExtent() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<Fact> getExtent(Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  
}
