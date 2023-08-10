package com.examination.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examination.entity.Exam;
import com.examination.service.ExaminationService;
@RestController
public class ExaminationController {
	@Autowired	
	private ExaminationService service;
	@PostMapping("/savexam")//Post data into database
	public Exam insertExam(@Valid @RequestBody Exam std)
	{
		
		return service.saveExam(std);
	}
}
	
