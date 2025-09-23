package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;

public class CricketerServiceImplArraylist implements CricketerService  {

 private static List<Cricketer> list = new ArrayList<>();

    @Override
    public Integer addCricketer(Cricketer cricketer) {
       list.add(cricketer);
        return list.size();
    }


    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        list  = new ArrayList<>();
        //CricketerService.super.emptyArrayList();
    }

    @Override
    public List<Cricketer> getAllCricketers() {
        // TODO Auto-generated method stub
        return list;
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
        List<Cricketer> sortedCricketer = list;
        Collections.sort(sortedCricketer);
        return sortedCricketer;
    }

    

   

   

    
    
}