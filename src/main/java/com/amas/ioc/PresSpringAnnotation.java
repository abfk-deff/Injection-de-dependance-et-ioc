package com.amas.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amas.ioc.metier.IMetier;

public class PresSpringAnnotation {
	
	public static void main(String[] args) {
		ApplicationContext contex = new AnnotationConfigApplicationContext("com.amas.ioc");
		
		IMetier metier = contex.getBean(IMetier.class);
		
		System.out.println("Resultat "+metier.calcul());
	}
}
