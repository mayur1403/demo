package com.example.hello;

public class Calculator {

	public int add(int a,int b)
	{
		return a+b;
	}
	public int subtract(int a,int b)
	{
		return a-b;
	}
	public int multiply(int a,int b)
	{
		return a*b;
	}
	public int divide(int a,int b)
	{
		int ans=0;
		try
		{
			ans=a/b;
		}
		catch(Exception e)
		{
			ans=0;
		}
		return ans;
	}
	
}
