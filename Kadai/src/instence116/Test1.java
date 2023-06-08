package instence116;
//下記Test1.java
public class Test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問題1:新しいBankAccountインスタンス：「yamada」を作成し、名前(山田)と初期残高(10万円)を設定し「残高」を出力してください。

		//使用したいクラス名・使いたいファイルの中での変数名　＝　new演算子　（コンストラクタ）←インスタンス化したときに動くやつ
		BankAccount yamada = new BankAccount("山田",100000); //BAckAccountをインスタンス化(accountNumberに山田、
		//		//【メモ】newで新しいインスタンス(yamada）を作成
		//		//これでyamadaに預金情報を持たせることができる
		//		
		//		
		System.out.println(yamada.getBalance());
		
		double balance = yamada.getBalance();
		System.out.println(balance);
		//		【メモ】
		//		public BankAccount(String accountNumber, double balance) {
		//
		//
		//			//アカウント名
		//			this.accountNumber = accountNumber;
		//			//初期残高
		//			this.balance = balance; ★←ここにdouble balanceの値が入る★
		//		}
		//		
		//　★	public double getBalance() {
		//		return balance; ★←BankAccountの引数double balanceの値をそのまま返すメソッド
		//	}


		//改行
		System.out.println("問２");
		//問題2:BankAccountインスタンス「yamada」の残高3万円を預金して「残高」を出力してください。
		yamada.deposit(30000); //インスタンスyamadaにBankAccountクラスのdeposit()メソッドを使って30000円預金する。yamad.〇
		System.out.println(yamada.getBalance());


		//改行
		System.out.println("問３");
		//問題3:BankAccountインスタンス「yamada」の残高より8万円引き落として「残高」を出力してください。
		yamada.withdraw(80000);
		System.out.println(yamada.getBalance());


		//改行
		System.out.println("問４");
		//問題4:新しいPersonインスタンス：「sato」を作成し、名前(佐藤)、年齢(25)、性別(男性)を設定し「性別」を出力してください。
		Person sato = new Person("佐藤", 25, "男性");
		System.out.println(sato.getGender());

		//改行
		System.out.println("問５");
		//問題5:Personインスタンス：「sato」の年齢を変更しようとして「無効な年齢です１」と出力させてください。
		sato.setAge(-1000);

		//改行
		System.out.println("問６");
		//問題6:Personインスタンス：「sato」の性別を「男性」→「女性」に変更して性別を出力してください。

		sato.setGender("女性");
		System.out.println(sato.getGender());
	}

}
