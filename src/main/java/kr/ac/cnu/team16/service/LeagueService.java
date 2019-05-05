package kr.ac.cnu.team16.service;

import kr.ac.cnu.team16.api.LeagueApi;
import kr.ac.cnu.team16.api.SummonerApi;
import kr.ac.cnu.team16.domain.LeaguePositionDTO;
//import kr.ac.cnu.team16.repository.LeagueRepo;
import kr.ac.cnu.team16.domain.SummonerDTO;
import kr.ac.cnu.team16.repository.LeagueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

@Service
public class LeagueService {
    @Autowired
    private LeagueApi leagueApi;
    @Autowired
    private LeagueRepo leagueRepo;

    public Set<LinkedHashMap> getLeagueId(String id) {

        Set<LinkedHashMap> leagueSet = leagueApi.getLeague(id);

        Iterator<LinkedHashMap> iterator = leagueSet.iterator();
        LinkedHashMap<String, Object> leageHashMap;
        while (iterator.hasNext()) {

            leageHashMap = iterator.next();
            LeaguePositionDTO leaguePositionDTO = new LeaguePositionDTO();

            leaguePositionDTO.setWins((int) leageHashMap.get("wins"));
            leaguePositionDTO.setLosses((int) leageHashMap.get("losses"));
            leaguePositionDTO.setLeaguePoints((int) leageHashMap.get("leaguePoints"));

            leaguePositionDTO.setSummonerId((String) leageHashMap.get("summonerId"));
            leaguePositionDTO.setRank((String) leageHashMap.get("rank"));
            leaguePositionDTO.setTier((String) leageHashMap.get("tier"));
            leaguePositionDTO.setLeagueName((String) leageHashMap.get("leagueName"));
            leaguePositionDTO.setSummonerName((String) leageHashMap.get("summonerName"));
            leaguePositionDTO.setQueueType((String) leageHashMap.get("queueType"));
            leaguePositionDTO.setLeagueId((String) leageHashMap.get("leagueId"));

            leaguePositionDTO.setHotStreak((boolean) leageHashMap.get("hotStreak"));
            leaguePositionDTO.setVeteran((boolean) leageHashMap.get("veteran"));
            leaguePositionDTO.setInactive((boolean) leageHashMap.get("inactive"));
            leaguePositionDTO.setFreshBlood((boolean) leageHashMap.get("freshBlood"));


            leagueRepo.insertData(leaguePositionDTO);
        }

        return leagueSet;
    }

    @Service
    public static class SummonerService {
        @Autowired
        private SummonerApi summonerApi;

        public SummonerDTO getSummonerByName(String name) {
            SummonerDTO summonerDTO = summonerApi.getSummoner(name);
            return summonerDTO;
        }
    }
}
