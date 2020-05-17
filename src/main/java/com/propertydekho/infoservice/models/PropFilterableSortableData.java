package com.propertydekho.infoservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PropFilterableSortableData {
    @JsonProperty("prop_id")
    private String propID;
    @JsonProperty("prop_name")
    private String propName;
    @JsonProperty("prop_price")
    private double propPrice;
    @JsonProperty("sq_ft")
    private int sqft;
    @JsonProperty("bedroom")
    private String bedroom;
    @JsonProperty("sale_type")
    private String saleType;
    @JsonProperty("constructn_status")
    private String constructionStatus;
    @JsonProperty("area")
    private String area;

    public PropFilterableSortableData() {

    }

    public PropFilterableSortableData(String propID, String propName, double propPrice, int sqft, String bedroom, String saleType, String constructionStatus, String area) {
        this.propID = propID;
        this.propName = propName;
        this.propPrice = propPrice;
        this.sqft = sqft;
        this.bedroom = bedroom;
        this.saleType = saleType;
        this.constructionStatus = constructionStatus;
        this.area = area;
    }

    public String getPropName() {
        return getBedroom() + " " + getSqft() + " Sq-ft Flat for Sale in " + getArea();
    }
}
