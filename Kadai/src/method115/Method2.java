package method115;

import java.util.Arrays;

public class Method2 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問１のメソッドを呼び出して出力してください（引数５と１０）
		int result = add(5,10);
		System.out.println(result);

		//改行
		System.out.println("問２");
		//問２のメソッドを呼び出して出力してください（引数"しんぶんし"）
		boolean sentence = isPalindrome( "しんぶんし"); //★boolean型の変数sentenceにboolean型isPalindromの結果を代入する。引数は"しんぶんし"。
		System.out.println(sentence); //★sentenceの結果を出力する。
		//	        if(isPalindrome(sentence)) {
		//	            System.out.println("【回文です】");
		//	        } else {
		//	            System.out.println("【回文ではありません】");
		//	       }

		//改行
		System.out.println("問３");
		//問3のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		Integer[] i = {5,3,1,9,4,8};
		reverse(i); //reserveの計算をしている

		System.out.println(Arrays.toString(i)); //文字列に変換してソートの後の配列の値を出力する
		//改行
		System.out.println("問４");
		//問4のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		int [] k = {5,3,1,9,4,8};

		
		int intMin = getMin(k);
		System.out.println(intMin); //★インデックス番号の出し方が分からない。
	}

	//問題1:2つの整数を受け取り、それらの和を返すメソッドを作成してください。
	public static int add(int num1, int num2) { //★addメソッドにint型の引数num1（5)、num２(10)を渡す
		return  num1 + num2; 
	}
	
	//問題2:文字列を受け取り、その文字列が回文であるかどうかを返すメソッドを作成してください。
	public static boolean isPalindrome(String sentence) { //★boolean型の変数isPalindromeにString型の引数sentence(しんぶんし）を渡す
		int minIdx = 0; //★index番号0から始まり
		int maxIdx = sentence.length() -1; //★index番号の長さ-1で終わる

		while(minIdx < maxIdx) { //minIdxがmaxIdxよりも小さい時。0<4、1<3
			if(sentence.charAt(minIdx ++) != sentence.charAt(maxIdx--)) { //★charAtメソッドで文字の位置を指定する。巡回するごとに１（-１）する。
				//★charAtメソッド…変数名.charAt(値)。charAtメソッドは、文字の位置を指定することで該当の1文字を取得する。
				return false; //★比べてた文字が異なればfalse、一致すればtrueを返す。
			}
		}return true;

	}
	//問題3:整数の配列を受け取り、その配列の要素を降順にソートするメソッドを作成してください。(for文は利用しないこと)

	public static void reverse(Integer[] array) {
		Arrays.sort(array,(a, b) -> b - a);//ラムダ式の書き方。ソートする公式！

		//voidをintにしたらreturn文で使える。return array;
	}


	//問題4:整数の配列を受け取り、その配列の中で最小値を持つ要素のインデックスを返すメソッドを作成してください。
	public static int getMin(int[] array) {
		int intMin = array[0];

		for (int i = 1; i < array.length; i++ ) {
			if(intMin > array[i]) {
				intMin = array[i];
			}
		}
		return intMin;


	}

}



