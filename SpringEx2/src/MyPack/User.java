package MyPack;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class User {

public static void main(String[] args) {
	
	/*Number n1= new Rational(3,5);
	Number n2=new Rational(4,3);
	*/
	
	Resource  r=new  ClassPathResource("beans.xml");
	XmlBeanFactory factory=new XmlBeanFactory(r);
	

	Number n1=(Number)factory.getBean("num1");
	Number n2=(Number)factory.getBean("num2");
			
	System.out.println("first Complex no.");
	n1.display();
	System.out.println("second Complex no.");
	n2.display();
	Number n3=n1.add(n2);
	System.out.println("after sum:");
	n3.display();
	
	
	
	
}
}
