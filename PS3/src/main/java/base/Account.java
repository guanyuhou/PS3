package base;

import java.util.Date;

public class Account {
		
		private int id = 0;
		private double balance = 0;
		private double annualInterestRate = 0;
		private Date dateCreated;
		
		//Assume all accounts have the same interest rate
		public static double generalAnnualInterestRate = 0;
		
		public Account()
		{
			
		}
		
		public Account(int specific_id, double ini_balance)
		{
			this.set_id(specific_id);
			this.set_balance(ini_balance);
			this.annualInterestRate = generalAnnualInterestRate;
			this.dateCreated = new Date();
		}
		
		//Getters and Setters
		public int get_id()
		{
			return this.id;
		}
		
		public double get_balance()
		{
			return this.balance;
		}
		
		public double get_annualInterestRate()
		{
			return this.annualInterestRate;
		}
		
		public Date get_dateCreated()
		{
			return this.dateCreated;
		}
		
		public void set_id(int set)
		{
			this.id = set;
		}
		
		public void set_balance(double set)
		{
			this.balance = set;
		}
		
		public void set_annualInterestRate(double set)
		{
			//set the same annual interest rate for all account
			generalAnnualInterestRate = set;
			this.annualInterestRate = set;
		}
		
		//-
		public double getMonthlyInterestRate()
		{
			//returns the monthly interest rate
			return (this.annualInterestRate / 12);
		}
		
		public void withdraw(double amount)
		throws InsufficientFundsException
		{
			//withdraws a specified amount from the account
			if (amount > this.balance)
				throw new InsufficientFundsException(amount-balance);
			else
				this.balance -= amount;
		}
		
		public void deposit(double amount)
		{
			//deposits a specified amount to the account
			balance += amount;
		}
		
		
		
		


}
