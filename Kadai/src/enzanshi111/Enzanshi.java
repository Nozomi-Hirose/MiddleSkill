package enzanshi111;

public class Enzanshi {

		public static void main(String[] args) {
			//改行
System.out.println("問１");
//問題1:変数"numa"にインクリメント演算子を利用し1マイナスしたものを表示してください。
			
			int numa = 5;
			numa--;
			
			System.out.println(numa);
			
			//改行
System.out.println("問２");
//問題2:変数"numb"の値が正の場合は"positive"、負の場合は"negative"、0の場合は"zero"と出力するプログラムを三項演算子を用いて作成してください。
			//(String result変数を用いてそこに値を格納しそれを出力する形式でお願いいたします)
			
			int numb = 5;
			
			/*★条件式１（numbが１以上のとき）,条件式２（numb1が-1以下のとき）。"zero"は条件式１・条件式２どちらにも当てはまらないときに出力される*/
			String result = (numb >=1) ? (numb <= -1) ?"positive" : "negative" : "zero" ;
						
/*★↑条件式の書き方自体は合っているかと思うのですが、negative1になる原因が分かりません…*/
			
			
			System.out.println(result);
			
			/*★↓この書き方ならpositiveになる*/
			String result2 = (numb >=1) ?"positive" : "negative" ;
			System.out.println(result2);
			
			
			
	//改行
System.out.println("問３");
//問題3:"numc","numd"2つの変数の大きい方の値を出力するプログラムを三項演算子を用いて作成してください。
	//(int intResult変数を用いてそこに値を格納しそれを出力する形式でお願いいたします)
		//※※必ず全パターン正常動作することをコンソールで確認して下さい。

			int numc = 1;
			int numd = 2;
			
			/*★numc>numdがtrueの時、式1のnumcの値を、
			 * numc>numdがfalseの時は、式2のnumdの値がinResultに代入される
			 * 
			 * 条件 ? 式1 : 式2*/
			int intResult = numc > numd ? numc: numd;
			System.out.println(intResult);
			
			//int intResult2 = numc < numd ? numc: numd;
			//System.out.println(intResult2); 
			//1が出力される

			
	
	
	//改行
			
/*★↓複数条件の時の正しい書き方が調べてもわかりません…。*/
System.out.println("問４");
//問題4:"nume"と"numf"の変数が両方の正の場合は"both positive"、どちらかの値が正の場合は"one positive"、
	//両方の値が負の場合は"both negative"、それ以外は"etc"と出力するプログラムを三項演算子を用いて作成してください。
	//(String results変数を用いてそこに値を格納しそれを出力する形式でお願いいたします)
	//※※必ず全パターン正常動作することをコンソールで確認して下さい。
	int nume = 4;
	int numf = -3;
	
	/*a = 条件式1 ? 条件式2 ? "A" : "B" : "C";*/
	/*a =　両方とも正の値、片方が正の値、両方とも負、それ以外*/
	String results = (nume >= 0 && numf >= 0)? (nume >= 0 || numf < 0) ? (nume < 0 && numf < 0) ?"both positive" : "one positive" : "both negative" : "etc";
	
	System.out.println(results);

		}
	}


