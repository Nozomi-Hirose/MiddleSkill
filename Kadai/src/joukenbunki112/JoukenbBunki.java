package joukenbunki112;


public class JoukenbBunki {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問題1:下記の条件を満たすようにif文を3つネストして条件式を作成してください。
		//
		//変数x,y,zは正の整数であれば★下の条件に続く。（それ以外は”正の整数：NG”と表示する）
		//xの値が10の倍数であれば下の条件に続く。（それ以外は”10の倍数：NG”と表示する）
		//x + y + z = 100であれば”プラス100：OK”（それ以外は”プラス100：NG”と表示する）
		
		int x = 10;
		int y = 80;
		int z = 15;

		/*条件１【x,y,zが正の整数】*/
		if (x >=0 && y>=0 && z>=0)  {
			
			/*条件２【条件１「x,y,zが正の整数」を満たす＆xの値が10の倍数】*/
			if(x % 10 == 0) {
				
				/*条件３【条件２：条件１「x,y,zが正の整数」を満たす＆xの値が10の倍数】のとき、
				 * x + y + z == 100　"プラス100：OK"
				 * x + y + z == 100　"プラス100：NG"*/
				if(x + y + z == 100) {
					System.out.println("プラス100：OK"); 
					} else {
					System.out.println("プラス100：NG");
					} 

		
				/*★↓条件式の中に条件式）
				if (x >=0 && y>=0 && z>=0 &&(x % 10 == 0)) {
					if(x + y + z == 100) {
						System.out.println("プラス100：OK"); 
					} else {
						System.out.println("プラス100：NG");
					} 
				}*/
			}else {
				System.out.println("10の倍数：NG");
			}
			

		}else {
			System.out.println("正の整数：NG");
		}

		/*★↑全て条件を満たすときと条件３だけ満たさないときは上記で良いかと思うのですが、
		 * 条件１を満たさないとき「正の整数：NG」
		 * 条件２を満たさないとき「10の倍数：NG」が記述が分かりません…
		 */
		
		//改行
		System.out.println("問２");
		//問題2:問1と同じ内容で三項演算子で条件式を作成しなさい。最後に変数aを出力する。
		String a = (x >=0 && y>=0 && z>=0) ? ((x % 10 == 0) ? ((x + y + z == 100) ? "プラス100：OK" : "プラス100：NG") : "10の倍数：NG") : "正の整数：NG";
		System.out.println(a);
		
		
}
}



