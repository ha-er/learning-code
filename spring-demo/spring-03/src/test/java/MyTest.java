import com.haer.pojo.Student;
import com.haer.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student.toString());

    }

    @Test
    public void UserTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
//        User user = context.getBean("user", User.class);
        User user = context.getBean("user2", User.class);
        System.out.println(user);

    }
}
