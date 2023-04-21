package jp.sample9;

import java.time.LocalDate;
import java.time.Period;

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
 * 				//formatterで変更した内容を出力する(表記上は表示されないがナノ秒を排除する場合などはwith.Nano(0)などをつけること)												
 * 				System.out.println(now.format(formatter));
 * 			}
 * 		}
 * 
 * 		
 * 		
 * 
 */

public class Sample9_1 {
	public static void main(String[] args) {
		
		// LocalDateクラスはnewを利用して直接インスタンス化することが出来ない
		// LocalDate date = new LocalDate(2016, 12, 31); //コンパイルエラー
		
		// LocalDate.ofメソッドを利用して指定した日付を保持するインスタンスを取得
		LocalDate date = LocalDate.of(2016, 12, 31);
		System.out.println("date             : " + date);
		System.out.println("date.plusDays(1) : " + date.plusDays(1));
		
		// plusDays()メソッドを使用してもdateのインスタンスが表す日付はかわらない
		System.out.println("date             : " + date); //2016-12-31
		
		System.out.println("-----------------------------------");
		
		// nowメソッドを使用して今日の日付を保持したインスタンスを取得
		LocalDate now = LocalDate.now();
		System.out.println("今日の日付       : " + now); //今日の日付が YYYY-MM-DDで表示される
		LocalDate tomorrow = now.plusDays(1);
		System.out.println("明日の日付       : " + tomorrow);
		
		// Period を使用して対象の日付までの日数を取得
		Period p = now.until(tomorrow);
		// System.out.println(p); // P1D と表示される
		System.out.println(p.getDays());
	}
}