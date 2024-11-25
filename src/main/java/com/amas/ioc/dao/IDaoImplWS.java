package com.amas.ioc.dao;

import org.springframework.stereotype.Component;

@Component("dao3")
public class IDaoImplWS implements IDao {

	@Override
	public double getData() {
		double res = 7000*13456/Math.random()*56;
		System.out.println("Version web service");
		return res;
	}

}
