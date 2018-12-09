package cn.edu.fjnu.towide.entity;

import lombok.Data;

@Data
public class OrderInformation {

  private Long orderId;
  private String username;
  private double orderPrice;
  private long orderTime;
  private String orderComment;




}
