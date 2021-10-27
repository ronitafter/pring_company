package com.ronit.repositories;

import java.sql.Date;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ronit.beans.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer>{
	
	List<Job> findByEndDateBetween(Date jobDate, Date jobDate2);
	List<Job> findByEndDate(Date endDate);



}
