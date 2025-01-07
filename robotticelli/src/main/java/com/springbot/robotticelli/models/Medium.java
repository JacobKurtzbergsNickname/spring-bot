package com.springbot.robotticelli.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class Medium {
  private String type;
  private String title;
  private String year;

  // Getters and setters
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }
}
