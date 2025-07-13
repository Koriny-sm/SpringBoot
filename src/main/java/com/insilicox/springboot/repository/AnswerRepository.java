package com.insilicox.springboot.repository;

import com.insilicox.springboot.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}
