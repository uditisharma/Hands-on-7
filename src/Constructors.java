
public class Constructors 
{   int a;
    float b;
	public Constructors(int a)
	{
		this.a=a;
		System.out.println(" in constructor int "+" value is "+a);
	}
	public Constructors(float b)
	{
		this.b=b;
		System.out.println(" in constructor float "+" value is "+b);
	}
	public Constructors()
	
	{
		System.out.println(" in constructor default ");
	}

}
