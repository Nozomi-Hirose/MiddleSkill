package simpleDateFormat122;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormat112 {
	public static void main(String[] args) throws ParseException {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		//改行
		System.out.println("問１");
		//問題1:現在の時刻を出力してください
		Date now = new Date(); //データ型Dateの変数名nowをインスタンス化する

		System.out.println(now.toString());

		//改行
		System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。

		//SimpleDateFormat sdf = new SimpleDateFormat("[整形したい日付フォーマット]");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

		//Date型に変換することで日時を取得・計算できるようにする。
		//文字列String shinyaBirthday、minamiBirthdayをDate型に変更する。
		//yyyy/MM/ddの形に変換する。Date型のインスタンスを作る。

		//		Data型shinyaDataという変数に、
		//		dateFormat("yyyy/MM/dd")の形になるように、shinyaBirthdayにparseメソッド使用する。
		Date shinyaDate = dateFormat.parse(shinyaBirthday);
		Date minamiDate = dateFormat.parse(minamiBirthday);

		//System.out.println(shinyaBirthday);→1998/03/19

		//もしshinyaDate（shinyaBirthday)がminamiDate(minamiBirthday)よりも早い日付だったらshinyaDateを出力する。

		if (shinyaDate.before(minamiDate)) {
			System.out.println(dateFormat.format(shinyaDate)); //shinyaDateだけで出力するとThu Mar 19 00:00:00 JST 1998→なんでこの形になるのか？
		} else {
			System.out.println(dateFormat.format(minamiBirthday));
		}

		//改行
		System.out.println("問３");
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい

		
		//まず文字列String furuyamaBirthday = "1998/09/12"をData型に変更する
		//SimpleDateFormat sdf = new SimpleDateFormat("[整形したい日付フォーマット]");→yyyy/MM/ddの形に変えますよ～。
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd");
		//実際にData型furuyamaDateを作りますYO。Stirng型furuyamaBirthdayをdatormat2（yyyy/MM/dd）に成型しますYO。
		Date furuyamaDate =dateFormat2.parse(furuyamaBirthday);
		//System.out.println(furuyamaDate);→Date型のSat Sep 12 00:00:00 JST 1998が出力される
		
		//Calendarクラスとは、特定の日付や指定した年・月・日・時などの操作を行うためのクラス
		//Date型をCalender型に変換
		//Calendarクラスは演算子newではなく、 getInstanceメソッドを呼ぶことにより、オブジェクトを生成する。現在の年・月・日に初期化された状態でオブジェクトを返します。
		Calendar furuyamaCalendar = Calendar.getInstance();
		furuyamaCalendar.setTime(furuyamaDate);
		
		
		furuyamaCalendar.add(Calendar.YEAR, 5);
		furuyamaCalendar.add(Calendar.MONTH, 2);
		System.out.println(dateFormat2.format(furuyamaCalendar.getTime()));
		
		
		



	}
}
