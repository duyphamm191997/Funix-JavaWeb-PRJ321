/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author demonslight998
 */
public class Article {

  private String title, topic, contents;
  private boolean status;
  private int authorID;
  private Date createdAt;

  public Article() {
  }

  public Article(String title, String topic, String contents, boolean status, int authorID, Date createdAt) {
    this.title = title;
    this.topic = topic;
    this.contents = contents;
    this.status = status;
    this.authorID = authorID;
    this.createdAt = createdAt;
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

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public int getAuthorID() {
    return authorID;
  }

  public void setAuthorID(int authorID) {
    this.authorID = authorID;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

}
