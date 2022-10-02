package com.testSpringDataJPA.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.testSpringDataJPA.entity.NhanVien;

@Repository
@Transactional
public interface NhanVienRepo extends JpaRepository<NhanVien, String> {
	@Query("select nv from NhanVien nv  where nv.luong < 10000")
	List<NhanVien> nhanViens();
	

}
