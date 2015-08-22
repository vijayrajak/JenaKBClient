/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cyc.library.jenakbclient;

import com.cyc.kb.Context;
import com.cyc.kb.KBCollection;
import com.cyc.kb.KBIndividual;
import com.cyc.kb.KBObject;
import com.cyc.kb.KBTerm;
import java.util.Date;

/**
 *
 * @author vijay
 */
public class KBTermImpl extends KBObjectImpl implements KBTerm {

  @Override
  public boolean provablyNotInstanceOf(KBCollection col, Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean provablyNotInstanceOf(String colStr, String ctxStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBIndividual getCreator() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Date getCreationDate() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
