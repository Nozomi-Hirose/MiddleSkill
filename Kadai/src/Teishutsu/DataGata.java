package Teishutsu;

public class DataGata {					
	public static void main(String[] args) {				
					
//		1.数字の5と9の変数を定義し、足した数字を出力しなさい。			
					
		/*int型の変数number1に5を代入する*/			
		/*int型の変数number2に9を代入する*/			
		int number1 = 5;			
		int number2 = 9;			
					
			System.out.println(number1 + number2);		
					
					
//		2.64ビット整数の「1111111111」を定義し2倍した値を出力しなさい。			
		long number3 = 1111111111;			
					
			System.out.println(number3 * 2);		
					
		/*↓書き方不明…*/			
//		3.boolean型の変数の値に不正な文字列比較を入れてfalseを出力してください。			
			boolean boolean1 = true;		
					
			boolean boolean2 = false;		
					
			System.out.println(boolean1 == boolean2);		
					
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