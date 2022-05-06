package application;

import entities.Account;
import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(3201, "Matheus Medeiros", 0.0);
		BusinessAccount bAccount = new BusinessAccount(3202, "Fernanda", 100000.0, 10000.0); 
		
		
		System.out.println(account); //Sem o toString imprime o endereço de memoria
		System.out.println(account.getHolder());
		System.out.println(bAccount.getHolder());
	}

}
