package com.cydeo.service.impl;

import java.util.*;

public  abstract class AbstractMapService <T,ID> {
   public Map<ID,T> map=new HashMap<>();//DB

    T save(ID id,T object){
        map.put(id,object);
        return object;
    }

    List<T>findAll(){
        return new ArrayList<>(map.values());
    }

    T findById(ID id){

        return map.get(id);
    }

    void deleteById(ID id){
        map.remove(id);
    }


}
