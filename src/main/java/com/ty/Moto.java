package com.ty;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Moto implements Mobile
{

	public void call() {
		System.out.println("person is using moto phone");
		
	}

}
