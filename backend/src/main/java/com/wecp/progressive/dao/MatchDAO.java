
package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Match;
import java.sql.SQLException;
import java.util.List;

public interface MatchDAO {
    int addMatch(Match match) throws SQLException;
    Match getMatchById(int matchId) throws SQLException;
    void updateMatch(Match match) throws SQLException;
    void deleteMatch(int matchId) throws SQLException;
    List<Match> getAllMatches() throws SQLException;
}
package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Match;

import java.util.List;

public interface MatchDAO {
    int addMatch(Match match);
    Match getMatchById(int matchId);
    void updateMatch(Match match);
    void deleteMatch(int matchId);
    List<Match> getAllMatches();
}
