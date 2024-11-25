package com.amas.ioc.dao;

import org.springframework.stereotype.Component;

@Component("dao1")
public class DaoImplCapteur implements IDao {

	@Override
	public double getData() {
		double res = Math.PI*34/345;
		System.out.println("Version capteur");
		return res;
	}

}
