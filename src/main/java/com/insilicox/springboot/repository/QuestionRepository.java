package com.insilicox.springboot.repository;

import com.insilicox.springboot.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
