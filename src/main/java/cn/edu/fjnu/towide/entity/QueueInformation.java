package cn.edu.fjnu.towide.entity;

import lombok.Data;

@Data
public class QueueInformation {

  private Long queueId;
  private String username;
  private String queueNumber;
  private long enable;
  private long currentRank;



}
