package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(1001, "Alex", 1000.0);
		acc.withdraw(200.0);
		System.out.println(acc.getBalance());
		
		Account acc1 = new SavingsAccount(1002, "Ana", 1000.0, 0.01);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new BusinessAccount(1003, "Jorge", 1000.0, 200.0);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
	}
}

	