package com.examination.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examination.entity.Exam;
import com.examination.repository.ExaminationRepo;
@Service
public class ExaminationService implements ExaminationServiceImp{
	@Autowired
	private ExaminationRepo repo;
	public Exam saveExam(Exam std)
	{
		Exam std1=repo.save(std);
		return std1;
	}
	
}
