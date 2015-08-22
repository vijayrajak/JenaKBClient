/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cyc.library.jenakbclient;

import com.cyc.kb.ArgPosition;
import com.cyc.kb.Assertion;
import com.cyc.kb.Context;
import com.cyc.kb.KBObject;
import com.cyc.kb.KBTerm;
import com.cyc.kb.Sentence;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBTypeException;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 *
 * @author vijay
 */
public class SentenceImpl extends KBObjectImpl implements Sentence{

  @Override
  public Assertion assertIn(Context ctx) throws KBApiException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean isAssertible(Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String notAssertibleExplanation(Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Sentence replaceTerms(List<Object> from, List<Object> to) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Sentence quantify(KBObject variable) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Sentence expandSentence() throws KBApiException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBTerm> getListOfTypedVariables() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Set<ArgPosition> getArgPositionsForTerm(Object term) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
