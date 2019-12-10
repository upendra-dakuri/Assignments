package com.omniwyse.taxcalculation;

public class Tax_Calculation implements EmployeeSalary
{
	
	float esi,pf,pt,tax,annualsalary,rebate;
	
	@Override
	public float pfCalculation(float monthlysalary) 
	{
		 pf=(monthlysalary*12)/100;
		 if(pf>1800)
		 {
			 pf=1800;
			 return pf;
		 }
		 else {
			 return pf;
		 }
			 
	}

	@Override
	public float esiCalculation(float monthlysalary) 
	{
		if(monthlysalary>=21000)
		{
			 esi=(float) ((monthlysalary*1.75)/100);
		}
		else
		{
			esi=0;
		}
		return esi;
	}

	@Override
	public float ptCalculation(float monthlysalary)
	{
		if(monthlysalary>=15000 & monthlysalary<=20000)
		{
			 pt=150;
		}
		else if(monthlysalary>20000)
		{
			 pt=200;
		}
		else
		{
			pt=0;
		}
		return pt;
	}

	@Override
	public float incomeTax(float annualIncome)
	{
		if(annualIncome<250000)
		{
			//System.out.println("Income Tax is: 0 ");
			 tax=0;
		}
		else if(annualIncome>=250000 & annualIncome<=500000)
		{
			 tax= 0+((annualIncome-250000)*5)/100;
		}
		else if(annualIncome>500000 & annualIncome<=1000000)
		{
			 tax=12500+((annualIncome-500000)*20)/100;
		}
		else if(annualIncome>=1000000)
		{
			 tax= 12500+100000+((annualIncome-1000000)*30)/100;
		}
		return tax/12;
	}

	@Override
	public float rebate(float annualIncome,float tax) 
	{
		if(annualIncome>=250000  & annualIncome<=350000)
		{
			rebate=tax-1500;
		}
		else if(annualIncome>350000 & annualIncome<500000)
		{
			rebate=tax-5000;
		}
		else
		{
			rebate=0;
		}
		return rebate/12;
	}

	@Override
	public float netSalary(float monthlysalary, float pf, float pt, float tax, float esi, float rebate)
	{
		return monthlysalary-pf-pt-esi-tax+rebate;
	}

}
