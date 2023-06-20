package reigaishori124;

public class Reigaishori124 {
	public static void main(String[] args) throws Exception {
		//改行
		System.out.println("問１");
		//問題1:下記を条件としたトライキャッチ文を作成しなさい
		//条件：NullPointerExceptionを発生させ「ヌルポが発生しました」と出力する。
		//try文の処理はthrow new を使い強制的に例外を発生させる事。

		try {// 例外が発生する可能性のある処理を書く場所
			String i = null; {
				throw new NullPointerException();
				//↑例外クラス名（引数）
				//例外を投げる？？？
			}
		} catch(NullPointerException No1) {  // エラー(NullPointerExceptionクラスの例外)が発生した場合の処理
			//↑例外クラス名。

			//例外が起きたときに実行するやで！
			System.out.println("ヌルポが発生しました");
			// e.printStackTrace();
		}

		//改行
		System.out.println("問２");
		//問題2:下記を条件としたトライキャッチ文を作成しなさい
		//条件：NumberFormatExceptionを発生させ「数字フォーマットエラーが発生しました」と出力する。
		//またcatch処理後に必ず「例外処理は終了です」と出力されるプログラム構成にする事
		//try文の処理はthrow new を使い強制的に例外を発生させる事。
		//改行

		/*NumberFormatException
		 * アプリケーションが文字列を数値型に変換しようとしたとき、
		 * 文字列の形式が正しくない場合にスローされます。
		 */
		

		try {
			int num = Integer.parseInt("あ");//
			
			throw new NumberFormatException();
			//数字が入る数字が入っていなから例外が起こる。文字列→数値に直せないからエラーが起こる。
		}catch(NumberFormatException No2) {//NumberFormatExceptionの時のみ動く,Nullpointerだとcatchは飛ばしてfinallyに飛ぶ。
			System.out.println("数字フォーマットエラーが発生しました");
		}finally{
			System.out.println("例外処理は終了です");
		}

		//

		System.out.println("問３");
		//問題3:下記を条件としたトライキャッチ文を作成しなさい
		//条件：NumberFormatExceptionを発生させNumberFormatException以外のExceptionでキャッチし「何らかの例外が発生しました」と出力する。
		//try文の処理はthrow new を使い強制的に例外を発生させる事。
		//改行
		
		try {
			int num = Integer.parseInt("あ");//int型numに、"あ"を数字に直そうとする処理。
			
			throw new Exception();//エラーを起こさせる
		} catch(Exception No3) {
			System.out.println("何らかの例外が発生しました");
		}

		System.out.println("問4");
		//問題4:例外処理を行うメリットを下記にコメント解答欄に記述しなさい
		//回答欄「例外処理とは、例外が発生した場合にもプログラムが不正に中断しないように、適切な処理を施すことができる。」
	}
}

//try {
//例外が発生する可能性のある処理
//} catch (例外の型 引数) {
//例外が発生した場合の処理(例外が発生しなければ行われない処理)
//} finally {
//例外の有無に関わらず、最後に必ず実行される処理
//}
