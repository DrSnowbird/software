package org.nlp2rdf.core.vocab;

import com.hp.hpl.jena.ontology.ObjectProperty;
import com.hp.hpl.jena.ontology.OntModel;

/**
 * This class was automatically generated from http://persistence.uni-leipzig.org/nlp2rdf/ontologies/rlog#
 * @author croeder
 */
public enum RLOGObjectProperties {

    /**
     * logLevel -> TODO add comment
     */
    level;

    String uri;

    RLOGObjectProperties() {
        this.uri = "http://persistence.uni-leipzig.org/nlp2rdf/ontologies/rlog#" + name();
    }

    public String getUri() {
        return uri;
    }

    @Override
    public String toString() {
        return "rlog:" + name();
    }


    public ObjectProperty getObjectProperty(OntModel model) {
        return model.createObjectProperty(getUri());
    }
}
