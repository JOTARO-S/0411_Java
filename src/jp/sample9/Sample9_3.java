package jp.sample9;

import java.time.LocalDateTime;

/* Java API
 * 	Java8 では APIが新しく追加された
 * 	API とは Application Programming Interface の 略で、Javaのプログラミングをするうえで便利なクラスやメソッドがまとまっている
 * 	
 * 	java.time
 * 		java.time パッケージではJDK 8 で追加されたパッケージで日付や時刻を扱うAPIがまとめられている
 * 		今までは、java.util.Calenderクラスなどを利用して日付や時刻を扱うことが出来たが、Calenderクラスでは日時の足し算などの処理が
 * 		しづらかったり、マルチスレッド環境ではスレッドセーフではなかったりという問題があった。
 * 
 * 		LocalDate ⇒ ISO-8601暦体系のタイムゾーンのない日付、2017-12-03 など
 * 		LocalTime ⇒ ISO-8601暦体系におけるタイムゾーンのない時間、10:15:30 など
 * 		LocalDateTime ⇒  ISO-8601暦体系のタイムゾーンのない日付/時間、2017-12-03T10:15:30 など
 * 		Period ⇒  ISO-8601暦体系における日付ベースの時間の量、2年と3か月4日 など
 * 		Duration ⇒ 時間ベースの時間 34.5秒 など													etc
 * 
 * 	LocalDateクラス
 * 		LocalDateクラスは、日付を表す不変の日付/時間オブジェクト、他の日付フィールド(曜日や年の週番号など)にもアクセスできる。
 * 
 * 		LocalDate = LocalDate.of(YYYY, MM, DD); // 01など頭の0は省略可能
 * 
 * 	LocalTimeクラス
 * 		LocalTimeクラスは、時間を表す不変の日付/時間オブジェクト、時間はナノ秒の精度まで表される
 * 
 * 		LocalTime = LocalTime.of(hh, mm, ss, nnnnnnnn); // 01など頭の0は省略可能
 * 
 * 	LocalDateTimeクラス
 * 		LocalDateTimeクラスは、日付/時間を表す不変の日付/時間オブジェクト、日付/時間はナノ秒の精度まで表される
 * 
 * 		LocalDateTime = LocalDateTime.of(YYYY, MM, DD, hh, mm, ss, nnnnnnnn) // 01など頭の0は省略可能
 * 
 * 	メソッド
 * 		
 * 		LocalDate plusDays(long daysToAdd) ⇒ 指定された日付を加算したこのLocalDateのコピーを返す(LocalDateクラス) etc
 * 		LocalTime plusHours(long hoursToAdd) ⇒ 指定された時間数を加算したこのLocalTimeのコピーを返す(LocalTimeクラス) etc
 * 		LocalDateTime plusDays(long daysToAdd) ⇒ 指定された日付を加算したこのLocalDateTimeのコピーを返す(LocalDateTimeクラス)
 * 		LocalDateTime plusHours(long hoursToAdd) ⇒ 指定された時間数を加算したこのLocalDateTimeのコピーを返す(LocalDateTimeクラス) etc
 * 		String format(DateTimeFormatter formatter) ⇒ 指定されたフォーマッタを使用してこの日付を書式設定する(共通) etc
 * 		詳細は 422,425,426p参照
 * 
 * 	フォーマッター
 * 		import java.time.LocalDateTime; //DateTimeの必要なimport文
 * 		import java.time.format.DateTimeFormatter; // DateTimeのFormatterに必要なimport文
 * 
 * 		class sample {
 * 			public static void main(String[] args) {
 * 				LocalDateTime now = LocalDateTime.now(); //DateTimeで現在時刻を宣言
 * 
 * 				//DateTimeFormatterでDateTimeのPatternを()内のものに変更することが出来る
 * 				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH:mm:ss"); 
 * 				
 * 				//formatterで変更した内容を出力する(ナノ秒に関してはformatterで排除している為、with)													
 * 				System.out.println(now.format(formatter));
 * 			}
 * 		}
 * 
 * 		
 * 		
 * 
 */

public class Sample9_3 {
	public static void main(String[] args) {
		// LocalDateTimeクラスはnewを利用して直接インスタンス化することが出来ない
		// LocalDateTime datetime = new LocalDate(2016, 12, 31, 12, 34, 56, 78); //コンパイルエラー
		
		// LocalDateTime.ofメソッドを利用して指定した日付/時刻を保持するインスタンスを取得
		LocalDateTime datetime = LocalDateTime.of(2016, 12, 31, 12, 34, 56, 78);
		
		//13月はないのでエラー
		//LocalDateTime datetime = LocalDateTime.of(2016, 13, 31, 12, 34, 56, 78);
		
		// 年ｰ月ｰ日T時.分.秒.ナノ秒で表示される
		System.out.println("dateTime                : " + datetime);
		
		//10時間後の日付/時刻を表すインスタンスを表示
		System.out.println("date.plusHours(10)      : " + datetime.plusHours(10));
		
		//1年後の日付/時刻を表すインスタンスを表示
		System.out.println("date.plusYears(1)       : " + datetime.plusYears(1));
		
		// plusDays()メソッドを使用してもdateのインスタンスが表す日付はかわらない
		System.out.println("datetime                : " + datetime);
		
		System.out.println("-----------------------------------");
		
		// nowメソッドを使用して今日の日付/時刻を保持したインスタンスを取得
		LocalDateTime now = LocalDateTime.now();
		System.out.println("現在の日付/時刻         : " + now); //今日の日付が YYYY-MM-DDThh.mm.ss.nnnnnnnn で表示される
		
		// 日付時刻がナノ秒まで一致しないと異なる時刻と判断される
		System.out.println("now.equals(withNano(0)) : " + now.equals(now.withNano(0)));
	}
}