package com.testSpringDataJPA.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.testSpringDataJPA.entity.MayBay;

@Repository
@Transactional
public interface MayBayRepo extends JpaRepository<MayBay, Integer> {
	@Query("select mb from MayBay mb  where mb.tamBay > 10000")
	List<MayBay> mayBays();
}
