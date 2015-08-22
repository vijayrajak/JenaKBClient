/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cyc.library.jenakbclient;

import com.cyc.kb.Assertion;
import com.cyc.kb.Context;
import com.cyc.kb.KBAPIEnums;
import com.cyc.kb.Sentence;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.DeleteException;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBTypeException;
import java.util.Collection;

/**
 *
 * @author vijay
 */
public class AssertionImpl extends KBObjectImpl implements Assertion {

  @Override
  public Sentence getFormula() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Context getContext() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<Assertion> getSupportingAssertions() throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean isDeducedAssertion() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean isGroundAtomicFormula() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean isAssertedAssertion() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBAPIEnums.Direction getDirection() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Assertion changeDirection(KBAPIEnums.Direction d) throws KBTypeException, CreateException, KBApiException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void delete(boolean force) throws DeleteException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
