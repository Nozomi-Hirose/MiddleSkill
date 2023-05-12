package DataGata19;

public class DataGata {					
	public static void main(String[] args) {				
					
		//1.数字の5と9の変数を定義し、足した数字を出力しなさい。			
					
			/*int型の変数number1に5を代入する*/			
			/*int型の変数number2に9を代入する*/			
			int number1 = 5;			
			int number2 = 9;			
					
			System.out.println(number1 + number2);		
					
			
			
		//2.64ビット整数の「1111111111」を定義し2倍した値を出力しなさい。			
			long number3 = 1111111111;			
					
			System.out.println(number3 * 2);		
					
			
			
		//3.boolean型の変数の値に不正な文字列比較を入れてfalseを出力してください。
			
			//★String型の変数s1、変数s2宣言
			String s1 = "承太郎";				
			String s2 = "Dio";		
			
			//★boolean型の変数blnEqualsにequalsメソッド（文字列比較するため）を代入
			boolean blnEquals = (s1.equals(s2));
			
			//★blnEqualsを出力
			System.out.println(blnEquals);		
					
	}				
}					
					
/*boolean boolean1 = true;					
ヒントとは違いますが、変数名ごちゃつきそうなので、この宣言の仕方はやめたほうがいいです！(このまま進めるなら、boolean1 を別のやつに変えたほうがいいです)					
					
問3の文字列比較のヒントです。					
// equalsメソッドで比較するやり方					
System.out.println(s1.equals(s2));					
// ==演算子で比較するやり方					
System.out.println(s1 == s2);					
					
上記での書き方をboolean型に変更すればできると思いますので、やってみて下さい！					
また、変数s1,s2は別途宣言して下さい！*/		

//★5/12(3)再提出 お疲れ様です。上記の書き方だと認識したのですが、ヒントの意味と違ってたらすみません（＞＜）採点よろしくお願い致します。（廣瀬）
