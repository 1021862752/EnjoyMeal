package cn.edu.fjnu.towide.entity;

import lombok.Data;

@Data
public class TableInformation {

  private String tableId;
  private long status;
  private double mininumComsumption;
  private double deposit;
  private String graphUri;
  private long recommendNumber;


  public String getTableId() {
    return tableId;
  }

  public void setTableId(String tableId) {
    this.tableId = tableId;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public double getMininumComsumption() {
    return mininumComsumption;
  }

  public void setMininumComsumption(double mininumComsumption) {
    this.mininumComsumption = mininumComsumption;
  }


  public double getDeposit() {
    return deposit;
  }

  public void setDeposit(double deposit) {
    this.deposit = deposit;
  }


  public String getGraphUri() {
    return graphUri;
  }

  public void setGraphUri(String graphUri) {
    this.graphUri = graphUri;
  }


  public long getRecommendNumber() {
    return recommendNumber;
  }

  public void setRecommendNumber(long recommendNumber) {
    this.recommendNumber = recommendNumber;
  }

}
