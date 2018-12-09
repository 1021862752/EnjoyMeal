package cn.edu.fjnu.towide.entity;

import lombok.Data;

@Data
public class FoodInformation {

  private String foodId;
  private String foodName;
  private double foodPrice;
  private String graphUri;
  private String tagId; //标签


  public String getFoodId() {
    return foodId;
  }

  public void setFoodId(String foodId) {
    this.foodId = foodId;
  }


  public String getFoodName() {
    return foodName;
  }

  public void setFoodName(String foodName) {
    this.foodName = foodName;
  }


  public double getFoodPrice() {
    return foodPrice;
  }

  public void setFoodPrice(double foodPrice) {
    this.foodPrice = foodPrice;
  }


  public String getGraphUri() {
    return graphUri;
  }

  public void setGraphUri(String graphUri) {
    this.graphUri = graphUri;
  }

}
