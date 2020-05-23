package com.propertydekho.infoservice.service;

import com.propertydekho.infoservice.entity.PropFilterableSortableData;
import com.propertydekho.infoservice.models.PropertiesDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class PropertyServiceImpl implements PropertyService {
    @Resource
    PropertiesDao propertiesDao;

    @Override
    public List<PropFilterableSortableData> findAll() {
        return propertiesDao.findAll();
    }

    @Override
    public void insertProperty(PropFilterableSortableData prop) {
        propertiesDao.insertProperty(prop);
    }

    @Override
    public void updateProperty(PropFilterableSortableData prop) {
        propertiesDao.updateProperty(prop);
    }

    @Override
    public void executeUpdateProperty(PropFilterableSortableData prop) {
        propertiesDao.executeUpdateProperty(prop);
    }

    @Override
    public void deleteProperty(PropFilterableSortableData prop) {
        propertiesDao.deleteProperty(prop);
    }
}
