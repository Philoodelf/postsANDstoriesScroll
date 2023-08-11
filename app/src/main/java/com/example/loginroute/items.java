package com.example.loginroute;

import android.widget.Button;

public class items {
 int profile,picon,post;
 String name, hr,dots;
 Button like,comment,share,learn,sms,more;


 public Button getLike() {
  return like;
 }

 public void setLike(Button like) {
  this.like = like;
 }

 public Button getComment() {
  return comment;
 }

 public void setComment(Button comment) {
  this.comment = comment;
 }

 public Button getShare() {
  return share;
 }

 public void setShare(Button share) {
  this.share = share;
 }

 public Button getLearn() {
  return learn;
 }

 public void setLearn(Button learn) {
  this.learn = learn;
 }

 public Button getSms() {
  return sms;
 }

 public void setSms(Button sms) {
  this.sms = sms;
 }

 public Button getMore() {
  return more;
 }

 public void setMore(Button more) {
  this.more = more;
 }


 public int getProfile() {

  return profile;
 }

 public void setProfile(int profile) {

  this.profile = profile;
 }

 public int getPicon() {

  return picon;
 }

 public void setPicon(int picon) {

  this.picon = picon;
 }

 public int getPost() {

  return post;
 }

 public void setPost(int post) {
  this.post = post;
 }



 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getHr() {
  return hr;
 }

 public void setHr(String hr) {

  this.hr = hr;
 }

 public String getDots() {
  return dots;
 }

 public void setDots(String dots) {
  this.dots = dots;
 }

 public items(int profile, int post, String name, String hr) {
  this.profile = profile;

  this.post = post;
  this.name = name;
  this.hr = hr;




 }
}
