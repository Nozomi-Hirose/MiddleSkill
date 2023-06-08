package instence116;


//下記BankAccount.java
public class BankAccount {

	/*BankAccountクラスに何の情報を渡すか？
	 * */
	private String accountNumber;
	private double balance;

	//問１のTest1.javaの"山田"、"100000.0"がそれぞれセットされる
	public BankAccount(String accountNumber, double balance) { //publicのメソッドだから他のクラスでも使える？


		//アカウント名
		this.accountNumber = accountNumber;
		//初期残高
		this.balance = balance; //メンバ変数・ローカル変数を区別するため。ここで定義して
	
	} 

	//残高照会のメソッド定義
	public double getBalance() { //値を入れる箱（中身を見たいだけなので直接値は入れない）
		return balance; //
	}


	//預入れ処理のメソッド定義
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	
	//引落処理のメソッド定義
	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
		}

	}
}

//コンストラクタ…インスタンスを生成するときに実行される機能のこと
