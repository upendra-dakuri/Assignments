package bankaccount;

import java.util.Scanner;

public class TestBankATM {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Balance available in your Account : ");
		int balance=sc.nextInt();
		BankATM bank=new MyBankATMImpl();
		bank.showBalance(balance);
		bank.withdraw(balance);
		System.out.println("Remaining balance in your account is : " +bank.remainingBalance());
	}

} 
