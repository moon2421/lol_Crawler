package kr.ac.cnu.team16.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.Set;

@Service
public class LeagueApi {
    @Autowired
    private RestTemplate restTemplate;

    private String api_key = "RGAPI-c310224f-9cb6-4a6c-bdd1-b23efb0c726c";
    private String requestUrl = "https://kr.api.riotgames.com/lol/league/v4/positions/by-summoner/{encryptedSummonerId}?api_key={api_key}";

    public Set<LinkedHashMap> getLeague(String encryptedSummonerId) {

        Set<LinkedHashMap> leagueSet = restTemplate.exchange(requestUrl, HttpMethod.GET, null, Set.class, encryptedSummonerId, api_key)
                .getBody();

        return leagueSet;
    }


}
