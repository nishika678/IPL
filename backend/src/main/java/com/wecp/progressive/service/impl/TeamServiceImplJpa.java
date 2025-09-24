
package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.sql.SQLException;
import java.util.List;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;

@Service
public class TeamServiceImplJpa implements TeamService
{

    @Override
    public int addTeam(Team team) throws SQLException 
    {
        return -1;
    }

    @Override
    public void deleteTeam(int teamId) throws SQLException 
    { 
        //TeamService.super.deleteTeam(teamId);
    }

    @Override
    public List<Team> getAllTeams() throws SQLException 
    {
        List<Team> teams = new ArrayList<Team>();
        return (teams);
    }

    @Override
    public List<Team> getAllTeamsSortedByName() throws SQLException 
    {
        List<Team> teamsSortedByName = new ArrayList<Team>();
        return (teamsSortedByName);
    }

    @Override
    public Team getTeamById(int teamId) throws SQLException 
    {
        //return TeamService.super.getTeamById(teamId);
        return null;
    }

    @Override
    public void updateTeam(Team team) throws SQLException 
    {
        //TeamService.super.updateTeam(team);
    }
    
}
package com.wecp.progressive.service.impl;

public class TeamServiceImplJpa  {

}
