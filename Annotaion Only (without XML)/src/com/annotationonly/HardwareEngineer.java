package com.annotationonly;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary	//bydefault, when confused, if qualifer is also not given
public class HardwareEngineer implements Engineer{
	public void development() {
		System.out.println("hardware development !!");
	}
}
