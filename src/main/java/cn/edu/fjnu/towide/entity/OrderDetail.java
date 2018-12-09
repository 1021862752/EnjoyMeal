package cn.edu.fjnu.towide.entity;

import lombok.Data;

@Data
public class OrderDetail {

  private String orderId;
  private String foodId;
  private long foodNumber;


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public String getFoodId() {
    return foodId;
  }

  public void setFoodId(String foodId) {
    this.foodId = foodId;
  }


  public long getFoodNumber() {
    return foodNumber;
  }

  public void setFoodNumber(long foodNumber) {
    this.foodNumber = foodNumber;
  }

}
