package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		IO.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		IO.print("Enter account holder: ");
		String holder = sc.nextLine();
		IO.print("Is there an initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		
		Account client;
		
		if (resp == 'y') {
			IO.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			client = new Account (number, holder, initialDeposit);
		}
		else {
			client = new Account (number, holder);
		}
		
		IO.println();
		IO.println("Account data: ");
		IO.println(client);
		
		IO.println();
		IO.print("Enter a deposit value: ");
		client.deposit(sc.nextDouble());
		IO.println("Updated account data: ");
		IO.println(client);
		
		IO.println();
		IO.print("Enter a withdraw value: ");
		client.withdraw(sc.nextDouble());
		IO.println("Updated account data: ");
		IO.println(client);
		
		sc.close();
	}
}