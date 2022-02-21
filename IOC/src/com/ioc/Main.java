package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Keys{
    public void run(Engine key) {
        key.start();
    }
}
public class Main {

	private static ApplicationContext cntx;

	public static void main(String[] args) {
		cntx = new ClassPathXmlApplicationContext("beans.xml");
		Engine key = (Engine)cntx.getBean("engine");  //pass the ID
		new Keys().run(key);
	}

}
