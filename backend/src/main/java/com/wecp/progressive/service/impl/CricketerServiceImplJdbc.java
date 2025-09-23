package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.CricketerDAO;
import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;

public class CricketerServiceImplJdbc implements CricketerService {

    CricketerDAO cricketerDAO;
    public CricketerServiceImplJdbc(){}
    

    public CricketerServiceImplJdbc(CricketerDAO cricketerDAO) {
        this.cricketerDAO = cricketerDAO;
    }


    @Override
    public Integer addCricketer(Cricketer cricketer) {
        return -1;
    }

    @Override
    public void deleteCricketer(int cricketerId) {
        CricketerService.super.deleteCricketer(cricketerId);
    }

  

    @Override
    public List<Cricketer> getAllCricketers() {
      return List.of();
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
        return List.of();
    }

    @Override
    public Cricketer getCricketerById(int cricketerId) {
        // TODO Auto-generated method stub
        return CricketerService.super.getCricketerById(cricketerId);
    }

    // @Override
    // public List<Cricketer> getCricketersByTeam(int teamId) {
    //     // TODO Auto-generated method stub
    //     return CricketerService.super.getCricketersByTeam(teamId);
    // }

    @Override
    public void updateCricketer(Cricketer cricketer) {
        // TODO Auto-generated method stub
        CricketerService.super.updateCricketer(cricketer);
    }

    
}