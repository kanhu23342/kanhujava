package javapractice;

public class returnarry 
{
   public Object message()
   {
	   int arr[]= {2,3,4,6,1};
	   return arr;
   }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		returnarry ob=new returnarry();
		int arr2[]=(int[])ob.message(); //casting the Object reference back to int array
		for(int i=0;i<arr2.length; i++)	//Reading the int array
		System.out.println(arr2[i]);

	}

}
