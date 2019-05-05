package kr.ac.cnu.team16.repository;

import kr.ac.cnu.team16.domain.LeaguePositionDTO;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

@Repository
public class LeagueRepo {
  private MongoTemplate mongoTemplete;
  
    public void insertData(LeaguePositionDTO leaguePositionDTO){ 
        mongoTemplete.insert(leaguePositionDTO);
}
}
