package com.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.College;
import com.college.service.CollegeService;

@RestController
@RequestMapping(value ="/college")
public class CollegeController {
	@Autowired
	CollegeService cs;
	
	@PostMapping(value = "/get")
		public String get(@RequestBody College e) {
			return cs.get1(e);
		}
	@PostMapping(value ="/post")
	public String ab(@RequestBody List<College> a) {
		return cs.ab(a);
	}
	@PutMapping(value = "/update/{a}")
	public String cd(@PathVariable int a,@RequestBody College d) {
		return cs.cd(a,d);
	}
	
	

}
