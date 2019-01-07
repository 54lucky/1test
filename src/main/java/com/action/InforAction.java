package com.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Infor;

public class InforAction {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//构造注入
		Infor in=(Infor) ac.getBean("construct");
		System.out.println("构造注入"+in);
//		工厂注入（动态，静态注入），内部bean，级联，集合
	}
}
