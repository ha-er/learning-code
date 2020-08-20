package com.haer.dao;

import com.haer.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selectStudentList();

    List<Student> selectStudentList2();
}
