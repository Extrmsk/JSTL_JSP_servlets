package com.maypackage;

public class Post {
	
	private int id;
	private String txt;
	
	public Post(int id, String name) {
		this.id = id;
		this.txt = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
	
	

}
