package com.sts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sts.Student.Shivansh;

public interface ShivanshRepository extends JpaRepository<Shivansh,Integer> {
	
	 @Query("SELECT SUM(m.marks) FROM Shivansh m")
	    int selectTotals();
	 
	 @Query ("SELECT COUNT(c.id) FROM Shivansh c")
	   int selectId();
	
      

}
