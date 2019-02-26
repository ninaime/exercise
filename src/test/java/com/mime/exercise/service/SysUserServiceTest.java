package com.mime.exercise.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SysUserServiceTest {
	
	public static void main(String[] args) {
		//1.加载spring容器，即加载并且解析applicationContext.xml
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("");
	}
}
