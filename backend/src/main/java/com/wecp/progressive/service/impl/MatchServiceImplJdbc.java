package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.MatchDAO;
import com.wecp.progressive.entity.Match;
import com.wecp.progressive.service.MatchService;

public class MatchServiceImplJdbc  implements MatchService{

    private MatchDAO matchDAO;

    public MatchServiceImplJdbc(MatchDAO matchDAO) {
        this.matchDAO = matchDAO;
    }

    public MatchServiceImplJdbc(){
    }

    @Override
    public Integer addMatch(Match match) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public void deleteMatch(int matchId) {
        // TODO Auto-generated method stub     
    }

    @Override
    public List<Match> getAllMatches() {
        // TODO Auto-generated method stub
        return List.of();
    }


    @Override
    public Match getMatchById(int matchId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateMatch(Match match) {
        // TODO Auto-generated method stub
        
    }

    
}