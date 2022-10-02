package com.testSpringDataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testSpringDataJPA.entity.MayBay;
import com.testSpringDataJPA.repo.MayBayRepo;

@RestController
public class MayBayController {
	@Autowired
	private MayBayRepo mayBayRepo;
	
	@GetMapping("/maybay")
	public List<MayBay> getby10000km(){
		return mayBayRepo.mayBays();
	}
}
