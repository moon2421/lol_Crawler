package kr.ac.cnu.team16.repository;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

@Repository
public class LeagueRepo {
    @Autowired
    private MongoTemplate mongoTemplete;

}