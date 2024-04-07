package javapractice;

import java.lang.reflect.Array;

public class Demoarray1 
{
	public void Printarray()
	{
	int a[]=new int[5];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	
	//traversing array
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	
	}

	public static void main(String[] args) 
	{
		Demoarray1 dm=new Demoarray1();
		dm.Printarray();
		
		
		

	}

}

