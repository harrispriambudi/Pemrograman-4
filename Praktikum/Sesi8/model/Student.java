package model;

public class Student extends Person{ //menciptakan class student yang dapat mengkases method pada class person
	private String nim;
	
	public String getNim(){
		return nim;
	}
	public void setNim(String nim){
		this.nim = nim;
	}
}
