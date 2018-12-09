package cn.edu.fjnu.towide.entity;

import lombok.Data;

@Data
public class Vip {

  private String id;
  private String type;
  private double discount;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public double getDiscount() {
    return discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

}
