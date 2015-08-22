/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cyc.library.jenakbclient;

import com.cyc.kb.BinaryPredicate;
import com.cyc.kb.Context;
import com.cyc.kb.Fact;
import com.cyc.kb.KBCollection;
import com.cyc.kb.KBIndividual;
import com.cyc.kb.KBObject;
import com.cyc.kb.KBPredicate;
import com.cyc.kb.Sentence;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.DeleteException;
import com.cyc.kb.exception.InvalidNameException;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBTypeException;
import com.cyc.session.SessionApiException;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.tdb.TDBFactory;
import com.hp.hpl.jena.vocabulary.RDFS;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.jena.atlas.lib.DS;

/**
 *
 * @author vijay
 */
public class KBObjectImpl implements KBObject {
  Resource core;
  private static final Dataset ds = TDBFactory.createDataset("/scratch/WORK2/jena/dataset/");

  private static final Map<Context, OntModel> contextModelMap = new HashMap<>();
  private static final OntModel baseContextModel = ModelFactory.createOntologyModel(
          OntModelSpec.OWL_MEM, ds.getNamedModel(Constants.CYC_CUSTOM_VOCAB_NS.concat("BaseKB")));
   
  protected KBObjectImpl () {
  }
  
  @Override
  public Resource getCore() {
    return core;
  }
  
  public static OntModel getBaseContextModel() {
    return baseContextModel;
  }
  
  public static OntModel getContextModel(Context ctx) {
    if (contextModelMap.containsKey(ctx)) {
      return contextModelMap.get(ctx);
    } else {
      OntModel tempModel = ModelFactory.createOntologyModel(
              OntModelSpec.OWL_MEM, ds.getNamedModel(((ContextImpl)ctx).getCore().getURI()));
      contextModelMap.put(ctx, tempModel);
      return tempModel;
    }
  }
  
  public static Dataset getDataset() {
    return ds;
  }

  @Override
  public Collection<Fact> getFacts(KBPredicate p, int thisArgPos, Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public <O> Collection<O> getValues(String predStr, int thisArgPos, int getArgPos, String ctxStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public <O> Collection<O> getValues(KBPredicate pred, int thisArgPos, int getArgPos, Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public <O> Collection<O> getValues(KBPredicate pred, int thisArgPos, int getArgPos, Object matchArg, int matchArgPos, Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Fact addFact(Context ctx, KBPredicate pred, int thisArgPos, Object... otherArgs) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<KBCollection> getQuotedIsa() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void addQuotedIsa(KBCollection col, Context ctx) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Deprecated
  @Override
  public KBObject instantiates(String colStr, String ctxStr) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("String based methods will not be supported.");
  }

  @Override
  public KBObject instantiates(KBCollection col, Context ctx) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBObject instantiates(KBCollection col) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Sentence instantiatesSentence(KBCollection col) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean isInstanceOf(KBCollection col) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Deprecated
  @Override
  public boolean isInstanceOf(String colStr) {
    throw new UnsupportedOperationException("String based methods will not be supported.");
  }

  @Override
  public boolean isInstanceOf(KBCollection col, Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Deprecated
  @Override
  public boolean isInstanceOf(String colStr, String ctxStr) {
    throw new UnsupportedOperationException("String based methods will not be supported.");
  }

  @Override
  public boolean isQuotedInstanceOf(KBCollection col) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean isQuotedInstanceOf(String colStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean isQuotedInstanceOf(KBCollection col, Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean isQuotedInstanceOf(String colStr, String ctxStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean isAsserted(Context ctx, KBPredicate pred, int thisArgPos, Object... otherArgs) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Fact getFact(Context ctx, KBPredicate pred, int thisArgPos, Object... otherArgs) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Sentence getSentence(KBPredicate pred, int thisArgPos, Object... otherArgs) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Fact addArg1(BinaryPredicate binPred, Object arg1, Context ctx) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Fact addArg2(BinaryPredicate binPred, Object arg2, Context ctx) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<String> getComments() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<String> getComments(String ctxStr) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Collection<String> getComments(Context ctx) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Fact addComment(String comment, String ctx) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Fact addComment(String comment, Context ctx) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public <O> O getArgument(int getPos) throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean isAtomic() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean isAssertion() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean isVariable() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Sentence getRestriction() throws KBApiException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<Object> getQuantification() throws KBApiException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void setQuantification() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Integer formulaArity() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String stringApiValue() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void delete() throws DeleteException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean isValid() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBObject rename(String name) throws InvalidNameException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String toNLString() throws SessionApiException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String getId() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean equalsSemantically(Object object) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBIndividual quote() throws KBTypeException, CreateException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KBObject getType() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  @Override
  public String toString() {
    return this.getCore().toString();
  }
}
