package javapractice;

public class demoreturntype 
{
	int square(int num)
	{
		int number=num*num;
		System.out.println(number);
		return number;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		demoreturntype t=new demoreturntype();
		//Call the method using object reference variable. 
		 // Since the return type of this method is int, we will store it using a variable of type int. 
		int squarenumber = t.square(20);
		
		//System.out.println(squarenumber);
		

	}

}
