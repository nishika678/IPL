
package com.wecp.progressive.service.impl;

import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import com.wecp.progressive.dao.CricketerDAO;
import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;

public class CricketerServiceImplJdbc implements CricketerService
{
    private CricketerDAO cricketerDAO;

    
    public CricketerServiceImplJdbc(CricketerDAO cricketerDAO) {
        this.cricketerDAO = cricketerDAO;
    }

    @Override
    public Integer addCricketer(Cricketer cricketer) throws SQLException
    {
        return (cricketerDAO.addCricketer(cricketer));
    }

    @Override
    public void deleteCricketer(int cricketerId) throws SQLException
    {
        //CricketerService.super.deleteCricketer(cricketerId);
        cricketerDAO.deleteCricketer(cricketerId);
    }

    @Override
    public List<Cricketer> getAllCricketers() throws SQLException 
    {
        return (cricketerDAO.getAllCricketers());
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() throws SQLException 
    {
        return List.of();
    }

    @Override
    public Cricketer getCricketerById(int cricketerId) throws SQLException
    {
        //return CricketerService.super.getCricketerById(cricketerId);
        return (cricketerDAO.getCricketerById(cricketerId));
    }

    @Override
    public void updateCricketer(Cricketer cricketer) throws SQLException
    {
        //CricketerService.super.updateCricketer(cricketer);
        cricketerDAO.updateCricketer(cricketer);
    }

    
}
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
