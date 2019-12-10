package com.omniwyse.taxcalculation;

public interface EmployeeSalary
{
	public float pfCalculation(float monthlysalary);
	public float esiCalculation(float monthlysalary);
	public float ptCalculation(float monthlysalary);
	public float incomeTax(float annualIncome);
	public float rebate(float annualIncome, float tax);
	public float netSalary(float monthlysalary,float pf,float pt,float tax,float esi,float rebate);
	
}
