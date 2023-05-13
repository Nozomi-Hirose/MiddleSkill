package Hairetsu110;

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
		for (int numcNumber:numc) {
			 if (numcNumber % 2 == 0) {
			      evenSum += numcNumber;
		}
			 System.out.println(evenSum);
		}


		
//改行
System.out.println("問４");
		
//問題4:この配列"numd"をコピーした配列名"new_numd"を作り"new_numd"の中身を出力してください。
		int[] numd = {1, 3, 5, 7, 9};
		
		
		
//改行
System.out.println("問５");
		
//問題5:この配列"nume"を昇順に並び替えて出力しなさい。
		int[] nume = {6, 2, 8, 1, 9};
		
//改行
System.out.println("問６");
		
//問題6:配列"numf"に要素を1つ(10)追加した配列"new_numf"を作成し出力しなさい。
		int[] numf = {1, 3, 5, 7, 9};
		
//改行
System.out.println("問７");
		
//問題7:Map"car"に「キー："honda"　バリュー"ホンダ",キー："toyota"　バリュー："トヨタ",キー："subaru"　バリュー："スバル"」の要素を追加してください
		
//改行
System.out.println("問８");
		
//問題8:Map"car"の「キー："toyota"」のバリューを出力してください。
		
//改行
System.out.println("問９");
		
//問題9:Map"car"のキーとバリューを全て出力してください。※for文で行うこと
//改行
System.out.println("問１０");
		
//問題10:Map"car"のキーとバリューを全て出力してください。※forEach文で行うこと
		
	}
}