package com.propertydekho.infoservice.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PropIDs
{
    private List<String> propIDs;

    public PropIDs() {
    }

    public PropIDs(List<String> propIDs){
        this.propIDs = propIDs;
    }
}
