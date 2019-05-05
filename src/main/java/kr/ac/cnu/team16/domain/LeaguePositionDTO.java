package kr.ac.cnu.team16.domain;

import lombok.Data;

@Data
public class LeaguePositionDTO {
    private int wins;
    private int losses;
    private int leaguePoints;
    private String rank;
    private String tier;
    private String leagueName;
    private String summonerName;
    private String queueType;
    private boolean hotStreak;
    private boolean veteran;
    private String leagueId;
    private boolean inactive;
    private boolean freshBlood;
    private String summonerId;
}
