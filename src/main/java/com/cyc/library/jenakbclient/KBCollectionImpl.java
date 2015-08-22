package com.cyc.library.jenakbclient;

import com.cyc.kb.Context;
import com.cyc.kb.KBCollection;
import com.cyc.kb.Sentence;
import com.cyc.kb.Variable;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBTypeException;
import com.hp.hpl.jena.ontology.OntClass;
import java.util.Collection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vijay
 */
public class KBCollectionImpl extends KBTermImpl implements KBCollection {
 
  public KBCollectionImpl (String uri) {
    core = KBObjectImpl.getBaseContextModel().createClass(uri);
  }
  
  public KBCollectionImpl (OntClass ontClass) {
    core = ontClass;
  }
  
  @Override
  public OntClass getCore() {
    // We know that in this API, all KBCollection will have OntClass as its core
    return (OntClass) core;
  }

  @Override
  public Collection<KBCollection> allSpecializations() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> allSpecializations(String ctxStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> allSpecializations(Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> getSpecializations() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> getSpecializations(String ctxStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> getSpecializations(Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBCollection addSpecialization(String moreSpecificStr) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBCollection addSpecialization(String moreSpecificStr, String ctxStr) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBCollection addSpecialization(KBCollection moreSpecific) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBCollection addSpecialization(KBCollection moreSpecific, Context ctx) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> allGeneralizations() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> allGeneralizations(String ctxStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> allGeneralizations(Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<? extends KBCollection> getGeneralizations() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<? extends KBCollection> getGeneralizations(String ctxStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<? extends KBCollection> getGeneralizations(Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBCollection addGeneralization(String moreGeneralStr) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBCollection addGeneralization(String moreGeneralStr, String ctxStr) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBCollection addGeneralization(KBCollection moreGeneral) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBCollection addGeneralization(KBCollection moreGeneral, Context ctx) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Sentence addGeneralizationSentence(KBCollection moreGeneral) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public <O> Collection<? extends O> getInstances() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public <O> Collection<O> getInstances(String ctxStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public <O> Collection<O> getInstances(Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> instancesOf() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> instancesOf(String ctxStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> instancesOf(Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBCollection instantiates(String colStr, String ctxStr) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBCollection instantiates(KBCollection col, Context ctx) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean isGeneralizationOf(KBCollection moreSpecific, Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean isGeneralizationOf(String moreSpecificStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean isGeneralizationOf(KBCollection moreSpecific) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Variable getVariable() throws KBApiException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
