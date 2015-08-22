package com.cyc.library.jenakbclient;

import com.cyc.kb.Context;
import com.cyc.kb.KBCollection;
import com.cyc.kb.KBIndividual;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.InfModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vijay
 */
public class KBIndividualImpl extends KBTermImpl implements KBIndividual {
  
  protected KBIndividualImpl () {
    
  }
  
  /**
   * 
   * @return It will always be {@link Individual}. The reason we are returning
   * {@link Resource} is because the sub-class of {@link KBIndividualImpl} is {@link KBPredicateImpl}
   * whose RDF core, {@link Property} is not a sub-class of {@link Individual}.
   */
  @Override
  public Resource getCore() {
    return (Individual) core;
  }
  
  public KBIndividualImpl (String uri) throws Exception {
    core = KBObjectImpl.getBaseContextModel().createIndividual(uri, ((KBCollectionImpl)Constants.owlThing()).getCore());
  }
  
  public KBIndividualImpl (String uri, KBCollection col) {
    core = KBObjectImpl.getBaseContextModel().createIndividual(uri, ((KBCollectionImpl)col).getCore());
  }

  @Override
  public Collection<KBCollection> instanceOf() {
    ExtendedIterator<OntClass> classes = ((Individual)core).listOntClasses(true);
    Set<KBCollection> cols = new HashSet<>();
    while (classes.hasNext()) {
      cols.add(new KBCollectionImpl(classes.next()));
    }
    return cols;
  }

  @Override
  public Collection<KBCollection> instanceOf(String ctxStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> instanceOf(Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
