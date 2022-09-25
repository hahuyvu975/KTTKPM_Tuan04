package com.example.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.*;
@Repository
public interface ChuyenBayRepository extends CrudRepository<ChuyenBay, String> {
	List<ChuyenBay> findChuyenBayDiDaLat (String GaDi);
	
	
}


