//package com.insilicox.springboot;
//
//import com.insilicox.springboot.entity.Question;
//import com.insilicox.springboot.repository.QuestionRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//class ApplicationTests {
//
//    @Autowired
//    private QuestionRepository questionRepository;
//
//    @Test
//    void testJpa() {
//        Optional<Question> oq = this.questionRepository.findById(1);
//        if(oq.isPresent()) {
//            Question q = oq.get();
//            assertEquals("sbb에 대해서 알려줘.", q.getSubject());
//        }
//    }
//
//}
