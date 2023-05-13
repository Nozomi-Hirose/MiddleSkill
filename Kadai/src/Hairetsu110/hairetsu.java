package Hairetsu110;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class hairetsu {
	public static void main(String[] args) {
		
//改行
	System.out.println("問１");
		
//問題1:配列"numa"の要素を全要素を出力しなさい。※i++など利用しないfor文で記述すること
		int[] numa = {1, 2, 3, 4, 5};
		for (int data:numa) {
			System.out.println(data);
		}
		
//改行
System.out.println("問２");
		
//問題2:配列"numb"の要素を逆順に出力してください。
		int[] numb = {1, 2, 3, 4, 5};
		
		/*★配列数４つの中から、iが0になるまで、配列番号4から配列番号を１つずつ減らしながら出力する*/
		for(int i = numb.length - 1; i >= 0; i-- ) {
				System.out.println(numb[i]);
			}
		
//改行
System.out.println("問３");

/*★★★質問>★★★
 * コンパイルすると0，2，2，6，6と出力される。原因が分かりません*/
//問題3:配列"numc"の中で偶数の要素だけを合計した値を出力してください。
		int[] numc = {1, 2, 3, 4, 5};
		
		int evenSum = 0;
		for (int i:numc) {
			 if (i % 2 == 0) {
			      evenSum += i;
		}
			 System.out.println(evenSum);
		}


		
//改行
System.out.println("問４");
		
//問題4:この配列"numd"をコピーした配列名"new_numd"を作り"new_numd"の中身を出力してください。
		int[] numd = {1, 3, 5, 7, 9};
		
		/*cleneメソッド*/
		int[] new_numd = numd.clone();
		

		for (int data:new_numd) {
			System.out.println(data);
		}
		
		/*別回答
		 * for (int i = 0; i < new_numd.length; i++) {
		System.out.print(new_numd[i] + ", ");
	}*/
	
		
		
//改行
System.out.println("問５");
		
//問題5:この配列"nume"を昇順に並び替えて出力しなさい。
		int[] nume = {6, 2, 8, 1, 9};
		
		Arrays.sort(nume);
		for(int i:nume) {
			System.out.println(i);
		}
		
		
//改行
System.out.println("問６");
		
//問題6:配列"numf"に要素を1つ(10)追加した配列"new_numf"を作成し出力しなさい。

		/*★arraycopyメソッドを使う*/

		/*★型名[] 古い配列 = {要素1, 要素2, 要素3, 要素4, 要素5, ...};*/
		int[] numf = {1, 3, 5, 7, 9};
		
		/*★追加したい要素の個数分だけ長い空の配列を用意。
		 * 型名[] 新しい配列 = new 型名[もとの配列の長さ+追加したい要素の個数];*/
		int[] new_numf = new int[6];
		
		/*★元の配列を新しい配列にコピー。
		 * System.arraycopy(古い配列, 0, 新しい配列, 0, 古い配列の長さ);*/
		System.arraycopy(numf, 0, new_numf, 0, 5);
		
		/*新しい配列[インデックス] = 追加する値;*/
		new_numf[5] = 10;
		
		for(int i:new_numf) {
			System.out.println(i);
		}
		
		
		
//改行
System.out.println("問７");
		
//問題7:Map"car"に「キー："honda"　バリュー"ホンダ",キー："toyota"　バリュー："トヨタ",キー："subaru"　バリュー："スバル"」の要素を追加してください
		
		/*★HashMap（キーを値にマッピングする）を宣言
		 * Map<キーの型名, 値の型名> オブジェクト名 = new HashMap<>();*/
		Map<String,String> car = new HashMap<>();
		
		car.put("honda", "ホンダ");
		car.put("toyota", "トヨタ");
		car.put("subaru", "スバル");
		
//改行
System.out.println("問８");
		
//問題8:Map"car"の「キー："toyota"」のバリューを出力してください。
		System.out.println(car.get("toyota"));
//改行
System.out.println("問９");
		
//問題9:Map"car"のキーとバリューを全て出力してください。※for文で行うこと
		/*★entrySetメソッドを使用する*/
		for(Map.Entry<String,String>ent:car.entrySet()) {
			System.out.println(ent.getKey() + ":"+ ent.getValue());
		}
//改行
System.out.println("問１０");
		
//問題10:Map"car"のキーとバリューを全て出力してください。※forEach文で行うこと
		/*forEachメソッドを使用する*/
		car.forEach((key,value) -> System.out.println(key + ":" + value));
	}
}