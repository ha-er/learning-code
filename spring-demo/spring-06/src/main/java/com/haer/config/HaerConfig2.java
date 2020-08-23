package com.haer.config;

import com.haer.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//相当于<beans></beans>
@Configuration//也会被注册到容器中，本身也是@Component
@ComponentScan("com.haer")
public class HaerConfig2 {

    //注册一个bean就相当于，之前写的一个bean
    //方法的名字，就相当于bean的id属性值
    //方法返回值，就相当于bean标签的class属性值
    @Bean
    public User getUser() {
        return new User();//就是返回要注入到bena的对象
    }
}
