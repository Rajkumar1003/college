package com.college.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.dao.CollegeDao;
import com.college.entity.College;

@Service
public class CollegeService {
	@Autowired
	CollegeDao cd;
	public String get1(College e) {
		return cd.get(e);
	}
	
	public String ab(List<College> a) {
		return cd.se(a);
	}
	public String cd(int a,College e) {
		return cd.vv(a,e);
	}

}
