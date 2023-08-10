package com.examination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examination.entity.Exam;

public interface ExaminationRepo extends JpaRepository<Exam,Integer>{

}
