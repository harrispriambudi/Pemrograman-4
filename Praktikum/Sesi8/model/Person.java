package model;

import java.util.Date; // pemanggilan class dengan method date dari java

	public class Person {
		// pendeklarasian variable yang hanya dapat diakses oleh anggota class person
		private String nama;
		private String alamat;
		private String noHp;
		private Date tglLahir;
		
		public String getAlamat(){
			return alamat;
		}
		public void setAlamat(String alamat){
		this.alamat = alamat;
		}
		public String getNama(){
			return nama;
		}
		public void setNama(String nama){
			this.nama = nama;
		}
		public String getNoHp(){
			return noHp;
		}
		public void setNoHp(String noHp){
			this . noHp = noHp;
		}
		public Date getTglLahir(){
			return tglLahir;
		}
		public void setTglLahir(Date tglLahir){
			this.tglLahir = tglLahir;
		}
	}
