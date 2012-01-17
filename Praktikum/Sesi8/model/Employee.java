package model;

public class Employee extends Person{ //menciptakan class Employee yang dapat mengkases method pada class person
	private String nip;
	
	public String getNip(){
		return nip;
	}
	public void setNip(String nip){
		this.nip = nip;
	}
}
