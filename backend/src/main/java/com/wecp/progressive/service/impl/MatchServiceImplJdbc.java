
package com.wecp.progressive.service.impl;

import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import com.wecp.progressive.dao.MatchDAO;
import com.wecp.progressive.entity.Match;
import com.wecp.progressive.service.MatchService;

public class MatchServiceImplJdbc implements MatchService
{
    private MatchDAO matchDAO;

    public MatchServiceImplJdbc(MatchDAO matchDAO) {
        this.matchDAO = matchDAO;
    }

    @Override
    public Integer addMatch(Match match) throws SQLException
    {
        return matchDAO.addMatch(match);
    }

    @Override
    public void deleteMatch(int matchId) throws SQLException
    {
        matchDAO.deleteMatch(matchId);
    }

    @Override
    public List<Match> getAllMatches() throws SQLException
    {
        return matchDAO.getAllMatches();
    }

    @Override
    public Match getMatchById(int matchId) throws SQLException
    {
        return (matchDAO.getMatchById(matchId));
    }

    @Override
    public void updateMatch(Match match) throws SQLException
    {
        matchDAO.updateMatch(match);
    }

    
}
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
