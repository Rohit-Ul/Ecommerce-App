package com.Ecom.SpringDataRest_JobApp.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ecom.SpringDataRest_JobApp.model.Jobpost;

@Repository
public interface JobRepo extends JpaRepository<Jobpost,Integer>{
	
	
}
