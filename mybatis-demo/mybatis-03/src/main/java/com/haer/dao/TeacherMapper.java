package com.haer.dao;

import com.haer.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> selectTeacherList();

    List<Teacher> selectTeacherList2();
}
