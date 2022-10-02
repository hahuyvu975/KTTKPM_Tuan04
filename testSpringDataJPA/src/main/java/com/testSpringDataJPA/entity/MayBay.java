package com.testSpringDataJPA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class MayBay {
	
	@Id
	@Column(name = "ma_mb")
	private int maMB;
	
	@Column(name = "loai")
	private String loai;

	@Column(name = "tam_bay")
	private int tamBay ;

	public int getMaMB() {
		return maMB;
	}

	public void setMaMB(int maMB) {
		this.maMB = maMB;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public int getTamBay() {
		return tamBay;
	}

	public void setTamBay(int tamBay) {
		this.tamBay = tamBay;
	}
}
