package com.propertydekho.infoservice;

import com.propertydekho.infoservice.models.PropDetailList;
import com.propertydekho.infoservice.models.PropIDs;
import com.propertydekho.infoservice.models.PropertyDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/")
public class PropertyInfoServiceResource
{

    @RequestMapping("/fetch-prop-details")
    public PropDetailList fetchPropDetails(@RequestBody PropIDs propIDs) {

        return PropDetailList.builder().propertyDetails(
                propIDs.getPropIDs().stream()
                        .map(propID -> PropertyDetails.builder().propID(propID).propName(propID + "-" + "Name").propPrice(4500000).build())
                        .collect(Collectors.toList())
        ).build();
    }
}