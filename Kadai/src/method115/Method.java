package method115;

import java.util.Arrays;
import java.util.Collections;


public class Method {
	public static void main(String[] args) {
		int result = add(5,10);
		//問１のメソッドを呼び出して出力してください（引数５と１０）
		System.out.println(result);
		
		//改行
		System.out.println("問２");
		String sentence = "しんぶんし";
		if(Kaibun(sentence)) {
            System.out.println("true");
        } else {
            System.out.println("false");
       }

		//問２のメソッドを呼び出して出力してください（引数"しんぶんし"）
		//改行
		System.out.println("問３");
		//問3のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		{
			Integer [] i = {5,3,1,9,4,8};
			Arrays.sort(i, Collections.reverseOrder());
			System.out.println(Arrays.asList(i));
		}
	
		//改行
		System.out.println("問４");
		//問4のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		{
			int [] k = {5,3,1,9,4,8};
			int intMin = k[0];
			
			for(int i = 1; i < k.length; i++) { // 要素0番目のは代入済みのため1番目から開始する

			    //intMinに代入されている値と配列の要素を比較して、配列の要素のほうが小さい場合値を上書きする.
			    if(intMin > k[i]) {
			        intMin = k[i];
			    }
			    System.out.println(intMin);
			}
		}

		}

	//問題1:2つの整数を受け取り、それらの和を返すメソッドを作成してください。(return文）
	public static int add(int num1, int num2) {
		return  num1 + num2;
	}
	//問題2:文字列を受け取り、その文字列が回文であるかどうかを返すメソッドを作成してください。
	
/*boolean型の変数名KaibunにString型の引数sentenceを渡す*/
	public static boolean Kaibun(String sentence) {
		
		/*Kaibunの配列番号の設定？*/
		int minKaibunIndex = 0;
		int maxKaibunIndex = sentence.length() - 1;
		
		/*while文で配列番号minKaibunIndexが配列番号maxKaibunIndexよりも小さい時*/
		while(minKaibunIndex < maxKaibunIndex) {
		
			if(sentence.charAt(minKaibunIndex++) == sentence.charAt(maxKaibunIndex--))
				return true;
		}
		
	
	return false;
	
	
	}

	}

	//問題3:整数の配列を受け取り、その配列の要素を降順にソートするメソッドを作成してください。(for文は利用しないこと)
	
	//問題4:整数の配列を受け取り、その配列の中で最小値を持つ要素のインデックスを返すメソッドを作成してください。
	
	


/*回文のチェックの仕方
 * 最初の文字と最後の文字を順番に比較する

 * */
