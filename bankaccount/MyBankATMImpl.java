package bankaccount;

import java.util.Scanner;

public class MyBankATMImpl implements BankATM {
	int balance;

	@Override
	public void showBalance(int balance) {
		System.out.print("Initial Balance in your account is :  " + balance);
	}

	public int withdraw(int amount) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the amount to withdraw : ");
		int withdrawamount = sc.nextInt();
		if (withdrawamount < amount) {
			this.balance = amount - withdrawamount;
		} else {
			System.out.println("Insufficient Balance to withdraw....");
		}
		return balance;
	}

	public int remainingBalance() {
		return balance;
	}

}
