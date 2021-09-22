package org.openpnp.model;

import org.openpnp.vision.pipeline.CvPipeline;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class Pipeline extends AbstractModelObject implements Identifiable {
    @Attribute()
    private String id;

    @Attribute(required = false)
    private String name;

    @Element()
    private CvPipeline cvPipeline;

    @Override
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CvPipeline getCvPipeline() {
        //TODO: NK check if really initialize, should not be ever null
        return cvPipeline;
    }

    public void setCvPipeline(CvPipeline cvPipeline) {
        this.cvPipeline = cvPipeline;
    }

    //TODO: contructor for creation of a new pipeline
}
