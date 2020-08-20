package com.haer.dao;

import com.haer.pojo.Student;
import com.haer.pojo.Teacher;
import com.haer.pojo.User;
import com.haer.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void test() {
        //获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //方式一：getMapper
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.selectUserList();

            //方式二：
            //List<User> userList = sqlSession.selectList("com.haer.dao.UserMapper.selectUserList");

            for (User user : userList) {
                System.out.println(user);
            }
        } finally {
            //关闭sqlSession(必须要关闭)
            sqlSession.close();
        }
    }

    @Test
    public void testTeacher() {
        //获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //方式一：getMapper
            TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
            List<Teacher> teacherList = teacherMapper.selectTeacherList2();

            //方式二：
            //List<User> userList = sqlSession.selectList("com.haer.dao.UserMapper.selectUserList");

            for (Teacher teacher : teacherList) {
                System.out.println(teacher);
            }
        } finally {
            //关闭sqlSession(必须要关闭)
            sqlSession.close();
        }
    }

    @Test
    public void testStudent() {
        //获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //方式一：getMapper
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> studentList = studentMapper.selectStudentList();

            //方式二：
            //List<User> userList = sqlSession.selectList("com.haer.dao.UserMapper.selectUserList");

            for (Student student : studentList) {
                System.out.println(student);
            }
        } finally {
            //关闭sqlSession(必须要关闭)
            sqlSession.close();
        }
    }

    @Test
    public void log4jTest() {
        logger.info("info:");
        logger.debug("debug:");
        logger.error("error:");
    }
}
