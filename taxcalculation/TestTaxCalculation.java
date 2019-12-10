package com.omniwyse.taxcalculation;

import java.util.Scanner;

public class TestTaxCalculation {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Monthly Salary : ");
		float monthlysalary=sc.nextInt();
		float annualIncome=monthlysalary*12;
		 System.out.println("Employee Anuual Income is: " +annualIncome);
		Tax_Calculation sal= new Tax_Calculation();
		 float providentFund=sal.pfCalculation(monthlysalary);
		 System.out.println("Employee Provident Fund is: " +providentFund);
		 float esic=sal.esiCalculation(monthlysalary);
		 System.out.println("Employee ESI is : "+esic);
		 float professionalTax=sal.ptCalculation(monthlysalary);
		 System.out.println("Employee Professional Tax is : "+professionalTax);
		 float incometax=sal.incomeTax(annualIncome);
		 System.out.println("Employee Income Tax : "+incometax);
		 float rebateAmount=sal.rebate(annualIncome, incometax);
		 System.out.println("Employee Rebate "+rebateAmount);
		 System.out.println("Employee Net Salary is : "+Math.round(sal.netSalary(monthlysalary, providentFund, professionalTax, incometax, esic, rebateAmount)));

	}

}
