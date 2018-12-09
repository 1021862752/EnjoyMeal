package cn.edu.fjnu.towide.entity;

import lombok.Data;

@Data
public class TableInformation {

  private Long tableId;
  private long status;
  private double mininumComsumption;
  private double deposit;
  private String graphUri;
  private long recommendNumber;


}
