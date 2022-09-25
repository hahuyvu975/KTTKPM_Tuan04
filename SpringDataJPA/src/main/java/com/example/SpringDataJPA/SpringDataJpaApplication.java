package com.example.SpringDataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.ChuyenBayRepository;
import com.example.entity.ChuyenBay;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}
//	private void insertChuyenBay(ChuyenBayRepository repository) {
//		ChuyenBay chuyenBay = ChuyenBay.builder()
//				.maCB("A001")
//				
//				.builder();
//		repository.save(chuyenBay);
//				
//	}

}
