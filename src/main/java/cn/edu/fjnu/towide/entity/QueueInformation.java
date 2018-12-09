package cn.edu.fjnu.towide.entity;

import lombok.Data;

@Data
public class QueueInformation {

  private String queueId;
  private String username;
  private String queueNumber;
  private long enable;
  private long currentRank;


  public String getQueueId() {
    return queueId;
  }

  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getQueueNumber() {
    return queueNumber;
  }

  public void setQueueNumber(String queueNumber) {
    this.queueNumber = queueNumber;
  }


  public long getEnable() {
    return enable;
  }

  public void setEnable(long enable) {
    this.enable = enable;
  }


  public long getCurrentRank() {
    return currentRank;
  }

  public void setCurrentRank(long currentRank) {
    this.currentRank = currentRank;
  }

}
