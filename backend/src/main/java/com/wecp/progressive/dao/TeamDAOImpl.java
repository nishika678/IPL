package com.wecp.progressive.dao;

import java.util.List;

import com.wecp.progressive.entity.Team;

public class TeamDAOImpl implements TeamDAO {

    public TeamDAOImpl(){}
    @Override
    public int addTeam(Team team) {
        return -1;
    }

    @Override
    public void deleteTeam(int teamId) {
        
    }

    @Override
    public List<Team> getAllTeams() {
      return List.of();
    }

    @Override
    public Team getTeamById(int teamId) {
       
        return null;
    }

    @Override
    public void updateTeam(Team team) {
        
    }
    

}
