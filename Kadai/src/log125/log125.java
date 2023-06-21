package log125;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class log125{
	public static void main(String[] args){
		//改行
		System.out.println("問１");
		//問題1:下記条件になるようログの出力を行いなさい。

		/*
		 * 条件１　例外でヌルポが発生させヌルポをキャッチした場合のみログ出力がされるプログラムにする事
		 *try-catch文 
		 *
		 *try{
		 *}catch(NullPointerException e){
		 *
		 *}
		 */

		/*
		 * 条件２　"middleskill log"という名前のログのインスタンスを生成する事（Ｌｏｇｇｅｒインスタンスの生成）
		 * 
		 * ▼「Logger型の変数名sample_logger」に「middleskill」という名前のログのインスタンス生成する。
		 *  Logger sample_logger = Logger.getLogger("middleskill");
		 *  
		 */

		/*
		 * 条件３　srcディレクトリ内に"middleskill.log"としてログ出力される設定にする事（出力先の設定）
		 *ファイルに出力するには、FileHandlerクラスを使う。
		 *FileHandlerクラスのコンストラクタの第1引数にはファイルパスを指定する。
		 *第2引数には上書き可の場合false,追記で指定する場合にはtrueを指定する。
		 *（第2引数を指定しない場合は上書き可になる）
		 *
		 *▼FilrHandlerクラスのクラス名fHandlerにインスタンスを生成する。
		 *FileHandler fHandler = new FileHandler(”middelskill.log”, true);
		 *▼setFormatterメソッドを使い、ファイル出力のフォーマットを設定する。
		 *▼SimpleFormatterというファイル出力のフォーマット
		 *fHandler.setFormatter(new SimpleFormatter());
		 *logger.addHandler(fHandler);
		 *
		 *
		 */

		/*
		 * 条件４　ログの内容はコンソールに出ている赤文字と同じ内容のものが表示される事（ログレベルの設定）
		 * 条件５　格納するログメッセージは"ミドルスキルログが発生しました。"という文言にする事
		 * ▼
		 * fHandler.setLevel(Level.INFO,"ミドルスキルログが発生しました");
		 * 
		 */

		// Loggerインスタンスの生成 ・・・Loggerを使えるようにインスタンス化(インスタンス名がslogger）している。

		Logger slogger = Logger.getLogger("middleskill");

		// 現在のディレクトリ情報を取得
		//「user.dirにMiddleSkill.logというファイルを作る」をString pathに代入している。
		String path =  System.getProperty("user.dir"); path = new File(path, "MiddleSkill.log").getPath();


		// Handlerクラスのインスタンス生成のときの例外処理のためのtry-catch構文
		//
		try {
			
			//上記の情報sample_hanlerに入れている（現在のファイル（user.dirにMiddleSkill.logというファイルを作る））＋logファイル形式を変更
			// Handlerクラスをインスタンス化している。FileHandler(path)をsample_handlerに代入している。このままだとlog形式のファイルのまま。// LoggerにHandlerを登録(上記で作ったpathが入っている）
			Handler sample_handler = new FileHandler(path);
			//↓sample_handlerでインスタンス化したものに対してsetFormatterでフォーマット指定をしている（new SimpleFormatter）
			sample_handler.setFormatter(new SimpleFormatter());//形式変更をしている
			slogger.addHandler(sample_handler);//61行目で作ったsloggerに、sample_handlerを入れている。

		}catch(IOException e){}//IOException…どんなエラーでもキャッチする

		// ログの出力
		slogger.log(Level.INFO, "ミドルスキルログが発生しました"); 
	}
}



