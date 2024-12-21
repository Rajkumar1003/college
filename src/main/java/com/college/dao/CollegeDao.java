package com.college.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.entity.College;
import com.college.repository.CollegeRepository;

@Repository
public class CollegeDao {
	@Autowired
	CollegeRepository cr;
	
	public String get(College e) {
		cr.save(e);
		return "stored";
	}
	public String se(List<College> a) {
		cr.saveAll(a);
		return "store";
	}
	public String vv(int a,College e) {
		cr.save(e);
		return "updated";
	}
	

}
