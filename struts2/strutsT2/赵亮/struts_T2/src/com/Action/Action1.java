package com.Action;

import com.opensymphony.xwork2.ActionSupport;

public class Action1 extends ActionSupport{
public String execute() throws Exception {
	// TODO Auto-generated method stub
	return null;
}
  public String Success() {
	  System.out.println("ss");
	  return "success";
  }
  public String login() {
	  // TODO Auto-generated method stub
	  return "red";
  }
}
