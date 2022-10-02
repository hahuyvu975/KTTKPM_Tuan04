package com.testSpringDataJPA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")

public class NhanVien {
	
	@Id
	@Column(name = "ma_nv")
	private String maNV;
	
	@Column(name = "ten")
	private String ten;
	
	@Column(name = "luong")
	private int luong;

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}
	
	
}
