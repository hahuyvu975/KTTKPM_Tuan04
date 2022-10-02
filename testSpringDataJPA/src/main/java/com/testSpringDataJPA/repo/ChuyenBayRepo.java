package com.testSpringDataJPA.repo;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.testSpringDataJPA.entity.ChuyenBay;

@Repository
@Transactional
public interface ChuyenBayRepo extends JpaRepository<ChuyenBay, String>  {
	@Query("Select c from ChuyenBay c where c.gaDen = 'DAD'")
	List<ChuyenBay> chuyenBays();
	
	@Query("Select cb from ChuyenBay cb where cb.doDai < 10000 and cb.doDai > 8000")
	List<ChuyenBay> chuyenBayss();
	
	@Query("Select d  from  ChuyenBay d where d.gaDi = 'SGN' and d.gaDen = 'BMV'")
	List<ChuyenBay> chuyenBaysss();
	
	@Query("Select l  from  ChuyenBay l where l.gaDi = 'SGN'")
	List<ChuyenBay> chuyenBaySGN();
}
