package javapractice;

import java.util.Arrays;

public class demoduplicate {

	public static void main(String[] args) 
	{
		String s="amitsinghtelstra"; 
		char sa[] = s.toCharArray();
		
		for(int i =0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(sa[i]==sa[j])
				{
				System.out.println(sa[i]);
				break;
				} 
			}
			
		}
 
	}

}
