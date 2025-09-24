
package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.wecp.progressive.dao.TeamDAO;
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;

public class TeamServiceImplJdbc implements TeamService
{
    private TeamDAO teamDAO;

    public TeamServiceImplJdbc(TeamDAO teamDAO) {
        this.teamDAO = teamDAO;
    }

    @Override
    public int addTeam(Team team) throws SQLException
    {
        return teamDAO.addTeam(team);
    }

    @Override
    public void deleteTeam(int teamId) throws SQLException
    {
        //TeamService.super.deleteTeam(teamId);
        teamDAO.deleteTeam(teamId);
    }

    @Override
    public List<Team> getAllTeams() throws SQLException
    {
        return (teamDAO.getAllTeams());
    }

    @Override
    public List<Team> getAllTeamsSortedByName() throws SQLException
    {
        return List.of();
    }

    @Override
    public Team getTeamById(int teamId) throws SQLException
    {
        //return TeamService.super.getTeamById(teamId);
        return teamDAO.getTeamById(teamId);
    }

    @Override
    public void updateTeam(Team team) throws SQLException
    {
        //TeamService.super.updateTeam(team);
        teamDAO.updateTeam(team);
    }

}
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
