package kr.ac.cnu.team16.api;

import kr.ac.cnu.team16.domain.SummonerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SummonerApi {
    @Autowired
    private RestTemplate restTemplate;

    private String apiKey = "RGAPI-c310224f-9cb6-4a6c-bdd1-b23efb0c726c";
    private String requestUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={api_key}";

    public SummonerDTO getSummoner(String summonerName) {
        return restTemplate.exchange(requestUrl, HttpMethod.GET, null, SummonerDTO.class, summonerName, apiKey)
                .getBody();
    }
}
