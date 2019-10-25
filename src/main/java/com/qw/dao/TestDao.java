package com.qw.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Package: com.qw.dao
 * @ClassName: TestDao
 * @Author: fgq
 * @Description:
 * @Date: 2019/10/24 14:14
 */
public class TestDao {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        System.err.println(context.getBean("source",Source.class));
        ApplicationContext ac = new FileSystemXmlApplicationContext("c:/applicationContext.xml");

    }
}
