package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.TeamDAO;
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;

public class TeamServiceImplJdbc implements TeamService {
    private TeamDAO teamDAO;
    public TeamServiceImplJdbc(TeamDAO teamDAO) {
        this.teamDAO = teamDAO;
    }
    public TeamServiceImplJdbc(){

    }

  
    
    @Override
    public int addTeam(Team team) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public void deleteTeam(int teamId) {
       
    }

    @Override
    public List<Team> getAllTeams() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public List<Team> getAllTeamsSortedByName() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public Team getTeamById(int teamId) {
        // TODO Auto-generated method stub
        return TeamService.super.getTeamById(teamId);
    }

    @Override
    public void updateTeam(Team team) {
        // TODO Auto-generated method stub
        TeamService.super.updateTeam(team);
    }

    
}