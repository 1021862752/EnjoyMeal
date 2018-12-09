package cn.edu.fjnu.towide.entity;

import lombok.Data;

@Data
public class OrderInformation {

  private String orderId;
  private String username;
  private double orderPrice;
  private long orderTime;
  private String orderComment;


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public double getOrderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(double orderPrice) {
    this.orderPrice = orderPrice;
  }


  public long getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(long orderTime) {
    this.orderTime = orderTime;
  }


  public String getOrderComment() {
    return orderComment;
  }

  public void setOrderComment(String orderComment) {
    this.orderComment = orderComment;
  }

}
