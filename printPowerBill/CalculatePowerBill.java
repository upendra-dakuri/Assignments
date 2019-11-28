package printPowerBill;
import java.util.Scanner;
public class CalculatePowerBill 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the No.of units used : ");
		int units=sc.nextInt();
		if(units<100)
		{
			System.out.println("The power bill is : " + units*2.50);
		}
		else if(units>=100 & units<500)
		{
			System.out.println("The power bill is : " + ((100*2.50)+((units-100)*3.0)));
		}
	    else if(units>=500)		
	    {
		System.out.println("The power bill is : " + ((100*2.50)+(400*3.0)+((units-500)*4.50)));		
		}
		else
		{
		System.out.println("Enter the valid number....");
	   }
    }	
}
