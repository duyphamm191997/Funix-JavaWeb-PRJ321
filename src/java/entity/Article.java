/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author demonslight998
 */
public class Article {

  private int id, status;
  private String title, topic, contents, releaseDate, author;

  public Article(int id, String title, String topic, String contents, String releaseDate, String author, int status) {
    this.id = id;
    this.title = title;
    this.topic = topic;
    this.contents = contents;
    this.releaseDate = releaseDate;
    this.author = author;
    this.status = status;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int isStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public Article() {
  }

}
