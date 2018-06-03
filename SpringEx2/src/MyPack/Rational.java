package MyPack;

public class Rational implements Number {

	int p,q;
	public Rational(int p,int q)
	{
		this.p=p;
		this.q=q;
		
	}
	
	public Number add(Number n1)
	{
		Rational r=(Rational)n1;
		int p1=this.p*r.q+this.q+r.q;
		int q1=this.q*r.q;
		return new Rational(p1,q1);
		
		
	}
	
	public void display()
	{
		System.out.println(p+"/"+q);
	}
}
