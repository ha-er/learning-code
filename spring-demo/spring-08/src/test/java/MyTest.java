import com.haer.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //动态代理的是接口
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }
}
