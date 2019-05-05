
package kr.ac.cnu.team16.controller;

import kr.ac.cnu.team16.domain.SummonerDTO;
import kr.ac.cnu.team16.service.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Set;

@RestController
public class RiotController {

    @Autowired
    private LeagueService leagueService;
    @Autowired
    private LeagueService.SummonerService summonerService;

    @GetMapping("/leagues/{name}")
    public Set<LinkedHashMap> getLeagueName(@PathVariable String name) {
        SummonerDTO summonerDTO = summonerService.getSummonerByName(name);
        String id = summonerDTO.getId();
        return leagueService.getLeagueId(id);
    }

    @RestController
    public static class SummonerController {

        @Autowired
        private LeagueService.SummonerService summonerService;

        @GetMapping("/summoners/{name}")
        public SummonerDTO getSummonerName(@PathVariable String name) {
            return summonerService.getSummonerByName(name);
        }


    }
}
