package com.testSpringDataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testSpringDataJPA.entity.NhanVien;
import com.testSpringDataJPA.repo.NhanVienRepo;

@RestController
public class NhanVienController {
	@Autowired
	private NhanVienRepo nhanVienRepo;
	
	@GetMapping("/nhanvien")
	public List<NhanVien> getbyLuongHon10000(){
		return nhanVienRepo.nhanViens();
	}
}
