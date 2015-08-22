package com.cyc.library.jenakbclient;

import com.cyc.kb.KBCollection;
import com.cyc.kb.KBPredicate;

/*
 * #%L
 * File: Constants.java
 * Project: KB API Implementation
 * %%
 * Copyright (C) 2013 - 2015 Cycorp, Inc
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */



/**
 * A convenience class for frequently accessed Cyc constants. It should be rare
 * to use this class in application making use of the KB API.
 * 
 * @author Vijay Raj
 * @version $Id: Constants.java 157022 2015-03-11 16:19:37Z nwinant $
 * @since 1.0
 */
public class Constants {

  private static Constants instance;
  
  public final KBCollection OWL_THING_COL = new KBCollectionImpl("http://www.w3.org/2002/07/owl#Thing");
  
  public final KBCollection RIF_VAR_COL = new KBCollectionImpl("http://www.w3.org/2007/rif#var");
  
  public final KBPredicate RIF_VARNAME_PRED = new KBPredicateImpl("http://www.w3.org/2007/rif#varname");
  
  public final KBCollection CYC_CONTEXT_COL = new KBCollectionImpl(Constants.CYC_CUSTOM_VOCAB_NS.concat("Context"));
  
  public static final String CYC_CUSTOM_VOCAB_NS = "http://www.cyc.com/customvocab#";
  
  public static final String CYC_ABOX_NS = "http://www.cyc.com/abox#";
  
  public static final String CYC_TBOX_NS = "http://www.cyc.com/tbox#";
  
  private Constants() {
    
  }

  /**
   * This not part of the public, supported KB API
   * 
   * @return a instance of Constants class which instantiates the following commonly used
   * KB terms.
   * 
   */
  public static Constants getInstance() throws Exception {
    try {
      if (instance == null) {
        instance = new Constants();
      }
      return instance;
    } catch (Exception e) {
      throw new Exception(
          "One of the private final fields in com.cyc.kb.Constants could not be instantiated, can not proceed further.",
          e);
    }
  }

  // Main contexts
  /**
   * @return Collection.get("DataMicrotheory")
   */
  public static KBCollection owlThing() throws Exception {
    return getInstance().OWL_THING_COL;
  }


}
