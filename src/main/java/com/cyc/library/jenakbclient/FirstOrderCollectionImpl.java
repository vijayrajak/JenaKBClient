/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cyc.library.jenakbclient;

import com.cyc.kb.Context;
import com.cyc.kb.FirstOrderCollection;
import com.cyc.kb.KBCollection;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.KBTypeException;
import java.util.Collection;

/**
 *
 * @author vijay
 */
public class FirstOrderCollectionImpl extends KBCollectionImpl implements FirstOrderCollection {

  public FirstOrderCollectionImpl(String uri) {
    super(uri);
  }

  @Override
  public Collection<FirstOrderCollection> getGeneralizations() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<FirstOrderCollection> getGeneralizations(String ctxStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public FirstOrderCollection addGeneralization(String moreGeneralStr, String ctxStr) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public FirstOrderCollection addGeneralization(KBCollection moreGeneral, Context ctx) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
