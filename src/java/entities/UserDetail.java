/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author demonslight998
 */
public class UserDetail {

  private String fullName, userNameBio, address, email, phoneNumber, avatar, website, bio, gender;

  public UserDetail(String fullName, String userNameBio, String address, String email, String phoneNumber, String avatar, String website, String bio, String gender) {
    this.fullName = fullName;
    this.userNameBio = userNameBio;
    this.address = address;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.avatar = avatar;
    this.website = website;
    this.bio = bio;
    this.gender = gender;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getUserNameBio() {
    return userNameBio;
  }

  public void setUserNameBio(String userNameBio) {
    this.userNameBio = userNameBio;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

}
