package com.amas.ioc.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.amas.ioc.dao.IDao;

@Component
public class MetierImpl implements IMetier{

	//Couplage faible
	
	@Autowired
	@Qualifier("dao3")
	IDao dao;
	
	@Override
	public double calcul() {
		double tmp = dao.getData();
		double res = tmp*540/Math.cos(Math.PI);
		return res;
	}

}
