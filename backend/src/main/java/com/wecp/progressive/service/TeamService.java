
package com.wecp.progressive.service;

import com.wecp.progressive.entity.Team;

import java.sql.SQLException;
import java.util.List;

public interface TeamService {

    List<Team> getAllTeams() throws SQLException;

    int addTeam(Team team) throws SQLException;

    List<Team> getAllTeamsSortedByName() throws SQLException;

    default void emptyArrayList() throws SQLException{
    }

    //Do not implement these methods in TeamServiceImplArrayList.java class
    default Team getTeamById(int teamId) throws SQLException{
        return null;
    }

    default void updateTeam(Team team) throws SQLException{}

    default void deleteTeam(int teamId) throws SQLException{}

}
package com.wecp.progressive.service;

import com.wecp.progressive.entity.Team;

import java.util.List;

public interface TeamService {

    List<Team> getAllTeams();

    int addTeam(Team team);

    List<Team> getAllTeamsSortedByName();

    default void emptyArrayList() {
    }

    //Do not implement these methods in TeamServiceImplArrayList.java class
    default Team getTeamById(int teamId) {
        return null;
    }

    default void updateTeam(Team team) {}

    default void deleteTeam(int teamId) {}

}
