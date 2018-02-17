
public class CheckingAccount {
	private int AccountNumber;
	private String CustomerName;
	private double AccountBalance;
	private double TransactionFee = 0.3; 
	// Constructors
	public CheckingAccount(int AccountNumber, String CustomerName, double AccountBalance)
	{
		this.AccountNumber = AccountNumber;
		this.CustomerName = CustomerName;
		setAccountBalance(AccountBalance);
	}
	
	// Properties
	public double getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		if(accountBalance >= 50)
		{
		AccountBalance = accountBalance;
		}
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	
	// Methods
	// When withdrawing money it will be a $3 transaction fee to the amount with every withdrawal
	public double withdraw(double amount)
	{
		double result = 0;
		if(amount > 0 && amount <= AccountBalance)
		{
			setAccountBalance(getAccountBalance() - amount - TransactionFee);
			result = amount - TransactionFee;
		}
		return result;
	}
	
	
	public String toString() {
		return "AccountNumber=" + AccountNumber + ", CustomerName=" + CustomerName
				+ ", AccountBalance=" + AccountBalance;
	}
	
}