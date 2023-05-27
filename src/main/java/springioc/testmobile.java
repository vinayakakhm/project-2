package springioc;

import java.beans.beancontext.BeanContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class testmobile 
{
public static void main(String[] args) {
	
//	ClassPathResource resource=new ClassPathResource("config.xml");
//	BeanFactory beanfactory=new XmlBeanFactory(resource);
//	mobile mobile=(mobile) beanfactory.getBean("mymobile");
//	mobile.musicplayer();
	
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	mobile mobile=(mobile) context.getBean("mymobile");
	mobile.musicplayer();
}
}
