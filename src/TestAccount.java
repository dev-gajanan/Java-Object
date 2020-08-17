class Account {
	int acNo;
	String name;
	double amount;
	
	//set account info
	void setInfo(int ano, String n, double amt) {
		acNo = ano;
		name = n;
		amount = amt;
	}
	//method to display basic info
	void displayInfo() {
		System.out.print("Account Details: " + acNo + " " + name + " " + amount);
	}
	
	//cash withdraw
	void cashWithdraw(double amt) {
		//check for sufficient balance
		if(amount < amt) {
			System.out.print("\nInsufficient Balance");
			availableBalance();
		} else {
			amount -= amt;
			System.out.print("\nRs. " + amt + " withdrawn");
			availableBalance();
		}
	}
	
	//cash deposit
	void cashDeposit(double amt) {
		amount += amt;
		System.out.print("\nRs. " + amt + " deposited");
		availableBalance();
	}
	
	//available balance
	void availableBalance() {
		System.out.print("\nAvailable Balance: " + amount);
	}
}
public class TestAccount {
	public static void main(String[] args) {
		Account ac1 = new Account();
		ac1.setInfo(100001, "Gajanan Mallik", 20000.00);
		ac1.displayInfo();
		ac1.cashDeposit(12000);
		ac1.cashWithdraw(5000);
	}
}
