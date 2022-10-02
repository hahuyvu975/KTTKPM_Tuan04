package com.testSpringDataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testSpringDataJPA.entity.ChuyenBay;
import com.testSpringDataJPA.repo.ChuyenBayRepo;

@RestController
public class ChuyenBayController {
	@Autowired
	private ChuyenBayRepo chuyenBayRepo;
	
	@GetMapping("/chuyenbay")
	public List<ChuyenBay> getbyDL(){
		return chuyenBayRepo.chuyenBays();
	}
	
	@GetMapping("/chuyenbayss")
	public List<ChuyenBay> getbyDD(){
		return chuyenBayRepo.chuyenBayss();
	}
}
