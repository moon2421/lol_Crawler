package kr.ac.cnu.team16.domain;

import lombok.Data;

@Data
public class SummonerDTO {
   private int profileIconId;
    private String name;
    private String puuid;
    private long summonerLevel;
    private String id; // 이거 뽑아써야 됨.
    private String accountId;
    private long revisionDate;
}
