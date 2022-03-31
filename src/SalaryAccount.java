
public class SalaryAccount extends BankAccount{

	public SalaryAccount(int accNum, String accHolder, double accBalance) {
		super(accNum, accHolder, accBalance);
	}

	@Override
	public boolean withdraw(int amount) {
		
		if(amount>this.accBalance) {
			return false;
		}
		this.accBalance=this.accBalance-amount;
		return true;
		
	}

	@Override
	public boolean deposit(int amount) {
		// TODO Auto-generated method stub
		if(amount>1000000) {
			return false;
		}
		this.accBalance=this.accBalance+amount;
		return true;
	}
	
	public void displayDetails() {
		super.toString();
	}
}
