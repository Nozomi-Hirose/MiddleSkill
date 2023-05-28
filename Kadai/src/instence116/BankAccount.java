package instence116;


//下記BankAccount.java
public class BankAccount {
	
	/*BankAccountクラスに何の情報を渡すか？
	 * */
	private String accountNumber;
	private double balance;
	
	//問１のTest1.javaの"山田"、"100000.0"がそれぞれセットされる
	public BankAccount(String accountNumber, double balance) {


		//アカウント名
		this.accountNumber = accountNumber;
		//初期残高
		this.balance = balance;
	}


	public double getBalance() {
		return balance;
	}


	//残高
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}


	}
	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
		}

	}


	public void amount(double d) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
