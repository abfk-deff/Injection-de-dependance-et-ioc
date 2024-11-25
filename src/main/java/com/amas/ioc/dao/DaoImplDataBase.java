package com.amas.ioc.dao;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImplDataBase implements IDao {

	@Override
	public double getData() {
		 double res = Math.random()*600;
		 System.out.println("Version Base de donnee");
		return res;
	}

}
