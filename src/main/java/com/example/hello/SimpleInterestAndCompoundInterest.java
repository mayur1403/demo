package com.example.hello;

public class SimpleInterestAndCompoundInterest {
public double SimpleIntrest(int p,int t,int r)
{
	return((p*t*r)/100);
}
public double CompoundIntrest(int p,int n,int r,int nt)
{
	return(p*Math.pow((1+(r/n)),nt));
}
}
