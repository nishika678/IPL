
package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.impl.TeamServiceImplArraylist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    @Qualifier("teamServiceImplArrayList")
    private TeamServiceImplArraylist teamServiceImplArrayList;

    @GetMapping()
    public ResponseEntity<List<Team>> getAllTeams() {
        List<Team> teams = teamServiceImplArrayList.getAllTeams();
        return new ResponseEntity<>(teams, HttpStatus.OK);
    }

    // @GetMapping("/{teamId}")
    // public ResponseEntity<Team> getTeamById(@PathVariable int teamId) {
    //     Team team = teamServiceImplArrayList.getTeamById(teamId);
    //     return new ResponseEntity<>(team, HttpStatus.OK);
    // }

    @PostMapping
    public ResponseEntity<Integer> addTeam(@RequestBody Team team) 
    {
        int t = teamServiceImplArrayList.addTeam(team);
        return new ResponseEntity<>(t, HttpStatus.OK);
    }

    //@PutMapping("/{teamId}")
    public ResponseEntity<Void> updateTeam(int teamId, Team team) {
        return null;
    }

    //@DeleteMapping("/{teamId}")
    public ResponseEntity<Void> deleteTeam(int teamId) {
        return null;
    }

    @GetMapping("/fromArrayList")
    public ResponseEntity<List<Team>> getAllTeamsFromArrayList() {
        List<Team> teamList = teamServiceImplArrayList.getAllTeams();
        return new ResponseEntity<>(teamList, HttpStatus.OK);
    }

    @PostMapping("/toArrayList")
    public ResponseEntity<Void> addTeamToArrayList(@RequestBody Team team) {
        int t = teamServiceImplArrayList.addTeam(team);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/fromArrayList/sorted")
    public ResponseEntity<List<Team>> getAllTeamsSortedByNameFromArrayList() {
        List<Team> team = teamServiceImplArrayList.getAllTeamsSortedByName();
        return new ResponseEntity<>(team, HttpStatus.OK);
    }
}
package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Team;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class TeamController {
    public ResponseEntity<List<Team>> getAllTeams() {
        return null;
    }

    public ResponseEntity<Team> getTeamById(int teamId) {
        return null;
    }

    public ResponseEntity<Integer> addTeam(Team team) {
        return null;
    }

    public ResponseEntity<Void> updateTeam(int teamId, Team team) {
        return null;
    }

    public ResponseEntity<Void> deleteTeam(int teamId) {
        return null;
    }

    public ResponseEntity<List<Team>> getAllTeamsFromArrayList() {
        return null;
    }

    public ResponseEntity<Integer> addTeamToArrayList(Team team) {
        return null;
    }

    public ResponseEntity<List<Team>> getAllTeamsSortedByNameFromArrayList() {
        return null;
    }
}
