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
			
			/*★条件式１（numbが１以上のとき）,条件式２（numb1が-1以下のとき）。"ZERO"は条件式１・条件式２どちらにも当てはまらないときに出力される*/
			String result = (numb >=1) ? (numb <=-1) ?"positive" : "negative" : "ZERO" ;
						
/*★↑条件式の書き方自体は合っているかと思うのですが、negative1になる原因が分かりません…*/
			
			
			System.out.println(result);
			
			/*↓この書き方ならpositiveになる*/
			String result2 = (numb >=1) ?"positive" : "negative" ;
			System.out.println(result2);
			
			
	//改行
System.out.println("問３");
//問題3:"numc","numd"2つの変数の大きい方の値を出力するプログラムを三項演算子を用いて作成してください。
	//(int intResult変数を用いてそこに値を格納しそれを出力する形式でお願いいたします)
		//※※必ず全パターン正常動作することをコンソールで確認して下さい。
		
	int numc = 1;
	int numd = 2;
	int intResult = 0;
	//改行
System.out.println("問４");
//問題4:"nume"と"numf"の変数が両方の正の場合は"both positive"、どちらかの値が正の場合は"one positive"、
	//両方の値が負の場合は"both negative"、それ以外は"etc"と出力するプログラムを三項演算子を用いて作成してください。
	//(String results変数を用いてそこに値を格納しそれを出力する形式でお願いいたします)
	//※※必ず全パターン正常動作することをコンソールで確認して下さい。
	int nume = 4;
	int numf = -3;
	String results = "";
		}
	}


