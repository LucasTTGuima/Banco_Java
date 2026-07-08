package entities;

public class Account {

		private int number;
		private String holder;
		private double balance;
		
		
		public Account(int number, String holder) {
			this.number = number;
			this.holder = holder;
		}

		public Account(int number, String holder, double initialDeposit) {
			this.number = number;
			this.holder = holder;
			deposit(initialDeposit);
		}
		
		public int getNumber() {
			return number;
		}

		public String getHolder() {
			return holder;
		}

		public void setName(String holder) {
			this.holder = holder;
		}

		public double getBalance() {
			return balance;
		}
		
		public void deposit (double ammount) {
			balance += ammount;
		}
		
		public void withdraw (double ammount) {
			balance -= ammount + 5.00;
		}
		
		public String toString() {
			return "Account " + String.format("%d", getNumber()) + ", Holder: " + getHolder() + ", Balance: $ " + String.format("%.2f", getBalance());
		}
}
