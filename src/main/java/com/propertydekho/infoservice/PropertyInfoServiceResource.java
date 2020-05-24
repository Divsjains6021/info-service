package com.propertydekho.infoservice;

import com.propertydekho.infoservice.entity.PropFilterableSortableData;
import com.propertydekho.infoservice.models.PropDetailList;
import com.propertydekho.infoservice.models.PropIDs;
import com.propertydekho.infoservice.models.PropertyDetails;
import com.propertydekho.infoservice.service.PropertyService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utilities.Utilities;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/")
public class PropertyInfoServiceResource {
    @Resource
    PropertyService propertyService;

    @RequestMapping("/fetch-prop-details")
    public PropDetailList fetchPropDetails(@RequestBody PropIDs propIDs) {


        return PropDetailList.builder().propertyDetails(
                propIDs.getPropIDs().stream()
                        .map(propID -> PropertyDetails.builder()
                                .propID(propID)
                                .propName(propID + "-" + "Name")
                                .propPrice(4500000)
                                .area("Bellandur, Bangalore")
                                .bedroom("1 bhk")
                                .constructionStatus("ready to move")
                                .budgetMax(5000000)
                                .saleType("new")
                                .build())
                        .collect(Collectors.toList())
        ).build();
    }

    @RequestMapping("/addDataToDB")
    public String addDataToDB() {
        Utilities utilities = new Utilities();
        List<PropFilterableSortableData> properties = utilities.getProperties();
        for (PropFilterableSortableData property : properties) {
            propertyService.insertProperty(property);
        }
        return "Data added successfully";
    }

//    @GetMapping(value = "/PropFilterableSortableDataList")
//    public List<PropFilterableSortableData> getPropFilterableSortableData() {
//        return propertyService.findAll();
//
//    }
//
//    @PostMapping(value = "/createProp")
//    public void createProperty(@RequestBody PropFilterableSortableData prop) {
//        propertyService.insertProperty(prop);
//
//    }
//    @PutMapping(value = "/updateProp")
//    public void updateProperty(@RequestBody PropFilterableSortableData prop) {
//        propertyService.updateProperty(prop);
//
//    }
//    @PutMapping(value = "/executeUpdateProp")
//    public void executeUpdateProperty(@RequestBody PropFilterableSortableData prop) {
//        propertyService.executeUpdateProperty(prop);
//
//    }
//
//    @DeleteMapping(value = "/deletePropById")
//    public void deleteProperty(@RequestBody PropFilterableSortableData prop) {
//        propertyService.deleteProperty(prop);
//
//    }
}
