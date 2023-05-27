package springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBike {
public static void main(String[] args)
{
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Bike bike=(Bike) context.getBean("bike");
	bike.price();
}
}
