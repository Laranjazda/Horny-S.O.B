package com.hsob.HornySOB.service;

import com.hsob.HornySOB.model.Data;
import com.hsob.HornySOB.repository.DataRepository;
import org.bson.json.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    @Autowired
    DataRepository dataRepository;

    public Object saveData(Data data){

        return saveData(data);

    }

}
