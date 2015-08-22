/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cyc.library.jenakbclient;

import com.cyc.kb.Context;
import com.cyc.kb.KBCollection;
import com.cyc.kb.Relation;
import com.cyc.kb.Sentence;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.KBTypeException;
import com.cyc.kb.exception.VariableArityException;
import com.hp.hpl.jena.ontology.OntProperty;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author vijay
 */
public class RelationImpl extends KBIndividualImpl implements Relation {

  

  
  @Override
  public List<Collection<KBCollection>> getArgIsaList() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<Collection<KBCollection>> getArgIsaList(Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> getArgIsa(int argPos) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> getArgIsa(int argPos, String ctxStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> getArgIsa(int argPos, Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  @Override
  public Relation addArgIsa(int argPos, String colStr, String ctxStr) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  @Override
  public Relation addArgIsa(int argPos, KBCollection col, Context ctx) throws KBTypeException, CreateException {
    if (argPos == 1) {
      ((OntProperty)this.getCore()).addRange(((KBCollectionImpl)col).getCore());
    } else if (argPos == 2) {
      ((OntProperty)this.getCore()).addDomain(((KBCollectionImpl)col).getCore());
    } else {
      throw new UnsupportedOperationException("argPos > 1 is not supported in this version.");
    }
    return this;
  }

  @Override
  public Sentence addArgIsaSentence(int argPos, KBCollection col) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<Collection<KBCollection>> getArgGenlList() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<Collection<KBCollection>> getArgGenlList(Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> getArgGenl(int argPos) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> getArgGenl(int argPos, String ctxStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> getArgGenl(int argPos, Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Relation addArgGenl(int argPos, String colStr, String ctxStr) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Relation addArgGenl(int argPos, KBCollection col, Context ctx) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<Integer> getInterArgDifferent(Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Relation addInterArgDifferent(Integer argPosM, Integer argPosN, Context ctx) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Integer getArity() throws VariableArityException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Integer getArityMin() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Integer getArityMax() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Relation setArity(int arityValue) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Sentence setAritySentence(int arityValue) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
