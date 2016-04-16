package com.springapp.mvc.Service;

import com.springapp.mvc.Entity.EntityData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ovidiu on 2/25/2016.
 */
public class EntityDataService {

    public List<EntityData> getAllData() {
        EntityData entityData = new EntityData(12, 45);
        EntityData entityData2 = new EntityData(32, 75);
        EntityData entityData3 = new EntityData(52, 47);
        List<EntityData> entityDataList = new ArrayList<EntityData>();
        entityDataList.add(entityData);
        entityDataList.add(entityData2);
        entityDataList.add(entityData3);

        return entityDataList;
    }
}
