package javapractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 
{
	public void generateTtid()
	{
		String suffix="kanhu";
		String ttid=String.join("-","APCSTEST" ,suffix, new SimpleDateFormat("yyyyMMddHHmmmssSSS").format(new Date()));
		System.out.println(ttid);
	}

	public static void main(String[] args) 
	{
		test1 obj=new test1();
		obj.generateTtid();
		

	}

}
