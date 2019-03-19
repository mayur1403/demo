package com.example.hello;

public class HousePrice {

	public double ConstructionCost(String standard,double area,boolean automated)
	{
		double basic=1200;
		if(standard.equals("above"))
		{
			basic=1500;
		}
		else if(standard.equals("high") && automated==false)
		{
			basic=1800;
		}
		else if(standard.equals("high") && automated==true)
			basic=2500;
		return basic*area;
	}
}
