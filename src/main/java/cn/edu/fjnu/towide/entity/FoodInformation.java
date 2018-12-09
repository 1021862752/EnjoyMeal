package cn.edu.fjnu.towide.entity;

import lombok.Data;

@Data
public class FoodInformation {

  private Long foodId;
  private String foodName;
  private double foodPrice;
  private String graphUri;
  private Long tagId; //标签


}
