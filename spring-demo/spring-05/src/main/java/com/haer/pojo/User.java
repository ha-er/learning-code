package com.haer.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于 <bean id="user" class="com.haer.pojo.User"/>
//@Component 组件,放在类上，说明这个类被Spring管理了，就是bean
@Component
@Scope("singleton")
public class User {

    //相当于<property name="name" value="哈儿"/>，也可以放到set方法上
    @Value("哈儿")
    public String name;
}
