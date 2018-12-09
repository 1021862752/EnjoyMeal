package cn.edu.fjnu.towide.entity;

import lombok.Data;

@Data
public class AdviseInformation {

  private String tableId;
  private String username;
  private Long orderTime;
  private Long status;


  public String getTableId() {
    return tableId;
  }

  public void setTableId(String tableId) {
    this.tableId = tableId;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public long getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(long orderTime) {
    this.orderTime = orderTime;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

}
