package kr.ac.cnu.team16.repository;

import kr.ac.cnu.team16.domain.LeaguePositionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class LeagueRepo {
    @Autowired
    private MongoTemplate mongoTemplete;

    public void insertData(LeaguePositionDTO leaguePositionDTO){ // 안됨
        mongoTemplete.insert(leaguePositionDTO);
    }
}
