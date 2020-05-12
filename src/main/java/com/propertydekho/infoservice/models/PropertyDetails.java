package com.propertydekho.infoservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PropertyDetails
{


    @JsonProperty("prop_id")
    private String propID;
    @JsonProperty("prop_name")
    private String propName;
    @JsonProperty("prop_price")
    private double propPrice;

    public PropertyDetails() {

    }

    public PropertyDetails(String propID, String propName, double propPrice) {
        this.propID = propID;
        this.propName = propName;
        this.propPrice = propPrice;
    }
}