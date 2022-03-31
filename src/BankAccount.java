
abstract class BankAccount {
	int accNum;
	String accHolder;
	double accBalance;
	
	public BankAccount(int accNum, String accHolder, double accBalance) {
		this.accNum = accNum;
		this.accHolder = accHolder;
		this.accBalance = accBalance;
	}

	public double showAccBalance() {
		return accBalance;
	}
	
	public abstract boolean withdraw(int amount);
	public abstract boolean deposit(int amount);

	@Override
	public String toString() {
		return "[accNum=" + accNum + ", accHolder=" + accHolder + ", accBalance=" + accBalance + "]";
	}
	
}
