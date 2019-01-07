package com.service;

import com.entity.Infor;

public class InforService {
  public void say(){
	  Infor inf=new Infor();
	  inf.setName("zhangsan");
	  inf.setPassword("12345");
	  System.out.println(inf);
  }
  public void say2(String name,String pass) {
	  System.out.println("name:"+name+"===>"+"pass:"+pass);
  }
  
}
