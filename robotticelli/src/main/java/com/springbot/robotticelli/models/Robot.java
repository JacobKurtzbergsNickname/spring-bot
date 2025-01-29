package com.springbot.robotticelli.models;

import java.util.List;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Robot {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String author;
  private String country;
  private String year;

  @ElementCollection
  private List<Long> media;

  public Robot() {}

  public Robot(String name, String author, String country, String year, List<Long> media) {
    this.name = name;
    this.author = author;
    this.country = country;
    this.year = year;
    this.media = media;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public List<Long> getMedia() {
    return media;
  }

  public void setMedia(List<Long> media) {
    this.media = media;
  }

  // Override toString() method
  @Override
  public String toString() {
    return "Robot{" + "id=" + id + ", name='" + name + '\'' + ", author='" + author + '\''
        + ", country='" + country + '\'' + ", year='" + year + '\'' + ", media=" + media + '}';
  }
}
