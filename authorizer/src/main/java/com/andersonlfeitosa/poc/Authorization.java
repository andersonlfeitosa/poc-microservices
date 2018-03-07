package com.andersonlfeitosa.poc;

import java.util.Date;

public class Authorization {

  private String transactionId;
  private String hostName;
  private String version;
  private Date dateTime;

  public Authorization() {
    super();
  }

  public Authorization(String transactionId, String hostName, String hostAddress, Date dateTime) {
    super();
    this.transactionId = transactionId;
    this.hostName = hostName;
    this.version = hostAddress;
    this.dateTime = dateTime;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String hostAddress) {
    this.version = hostAddress;
  }

  public Date getDateTime() {
    return dateTime;
  }

  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }

}
