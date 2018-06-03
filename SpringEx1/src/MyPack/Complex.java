package MyPack;

public class Complex implements Number {
	
	int r,i;
	public Complex(int r,int i)
	{
		this.r=r;
		this.i=i;
		
	}
	
	public Number add(Number n1)
	{
		Complex c=(Complex)n1;
		int r1=this.r+c.r;
		int i1=this.i+c.i;
		return new Complex(r1,i1);
		
		
	}
	
	public void display()
	{
		System.out.println(r+"+"+i+"i");
	}

}
