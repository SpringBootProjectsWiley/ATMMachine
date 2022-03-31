import org.springframework.context.ApplicationEvent;

public class WithdrawalEvent extends ApplicationEvent{
	
	int amount;
	BankAccount acc;

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		acc = bankAccount;
	}

	public WithdrawalEvent(Object source) {
		
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public void message() {
		System.out.println("Amount Withdrawn: "+amount);
		System.out.println("current Balance: "+acc.showAccBalance());
	}
}
