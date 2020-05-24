package com.propertydekho.infoservice.service;

import com.propertydekho.infoservice.entity.PropFilterableSortableData;

import java.util.List;

public interface PropertyService {
    List<PropFilterableSortableData> findAll();

    void insertProperty(PropFilterableSortableData prop);

    void updateProperty(PropFilterableSortableData prop);

    void executeUpdateProperty(PropFilterableSortableData prop);

    void deleteProperty(PropFilterableSortableData prop);
}
