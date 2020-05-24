package com.propertydekho.infoservice.models;

import com.propertydekho.infoservice.entity.PropFilterableSortableData;

import java.util.List;

public interface PropertiesDao {

    List<PropFilterableSortableData> findAll();

    void insertProperty(PropFilterableSortableData prop);

    void updateProperty(PropFilterableSortableData prop);

    void executeUpdateProperty(PropFilterableSortableData prop);

    public void deleteProperty(PropFilterableSortableData prop);
}
