package base;

public class Test {

	public static void main(String[] args) throws InsufficientFundsException {
		Account acct0 = new Account(1122, 20000);
		acct0.set_annualInterestRate(4.5);
		acct0.withdraw(2500);
		acct0.deposit(3000);

		System.out.println("The balance is " + String.format("%.2f", acct0.get_balance()));
		System.out.println("The monthly interest rate is " + acct0.getMonthlyInterestRate()+ "%");
		System.out.println("The date the account was created is " + acct0.get_dateCreated());
		
	}

}
