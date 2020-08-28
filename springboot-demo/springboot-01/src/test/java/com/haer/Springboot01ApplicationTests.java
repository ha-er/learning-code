package com.haer;

import com.haer.pojo.Student;
import com.haer.pojo.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01ApplicationTests {
    @Autowired
    private Student student;
    @Autowired
    private Teacher teacher;

    @Test
    void contextLoads() {
        System.out.println(student);
        System.out.println(teacher);
    }

}
