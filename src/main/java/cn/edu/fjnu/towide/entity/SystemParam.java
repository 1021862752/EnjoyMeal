package cn.edu.fjnu.towide.entity;

import lombok.Data;

@Data
public class SystemParam {

  private java.sql.Timestamp preAdvanceTime;
  private java.sql.Timestamp afterAdvanceTime;


  public java.sql.Timestamp getPreAdvanceTime() {
    return preAdvanceTime;
  }

  public void setPreAdvanceTime(java.sql.Timestamp preAdvanceTime) {
    this.preAdvanceTime = preAdvanceTime;
  }


  public java.sql.Timestamp getAfterAdvanceTime() {
    return afterAdvanceTime;
  }

  public void setAfterAdvanceTime(java.sql.Timestamp afterAdvanceTime) {
    this.afterAdvanceTime = afterAdvanceTime;
  }

}
