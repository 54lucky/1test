package com.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Infor;

public class InforAction {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//����ע��
		Infor in=(Infor) ac.getBean("construct");
		System.out.println("����ע��"+in);
//		����ע�루��̬����̬ע�룩���ڲ�bean������������
	}
}
