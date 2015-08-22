/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cyc.library.jenakbclient;

import com.cyc.kb.Context;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.KBTypeException;
import java.util.Collection;

/**
 *
 * @author vijay
 */
public class ContextImpl extends KBIndividualImpl implements Context {

  public ContextImpl(String uri) throws Exception {
    super(uri, Constants.getInstance().CYC_CONTEXT_COL);
    // core = KBObjectImpl.getBaseContextModel().createIndividual(uri, Constants.getInstance().CYC_CONTEXT_COL.getCore());
  }

  @Override
  public Collection<Context> getExtensions() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Context addExtension(String moreSpecificStr) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Context addExtension(Context moreSpecific) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<Context> getInheritsFrom() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Context addInheritsFrom(String moreGeneralStr) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Context addInheritsFrom(Context moreGeneral) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Context getMonad() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
