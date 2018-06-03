package MyPack;

public class User {

public static void main(String[] args) {
	
	/*Number n1= new Rational(3,5);
	Number n2=new Rational(4,3);
	System.out.println("first Rational");
	n1.display();
	System.out.println("second Rational");
	n2.display();
	Number n3=n1.add(n2);
	System.out.println("after sum:");
	n3.display();*/
	
	Number n1=new Complex(3,5);
	Number n2=new Complex(4,3);
	System.out.println("first Complex no.");
	n1.display();
	System.out.println("second Complex no.");
	n2.display();
	Number n3=n1.add(n2);
	System.out.println("after sum:");
	n3.display();
	
	
	
	
}
}
