package javapractice;

public class demoreturn1 
{
	
	public int show()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) 
	{
		demoreturn1 dm=new demoreturn1();
		dm.show();

	}

}
