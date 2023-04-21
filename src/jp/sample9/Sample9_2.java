package jp.sample9;

import java.time.LocalTime;

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

public class Sample9_2 {
	public static void main(String[] args) {
		
		// LocalTimeクラスはnewを利用して直接インスタンス化することが出来ない
		// LocalTime time = new LocalTime(12, 34, 56, 78); //コンパイルエラー
		
		// LocalTime.ofメソッドを利用して指定した時間を保持するインスタンスを取得
		LocalTime time = LocalTime.of(12, 34, 56, 78);
		// LocalTime time = LocalTime.of(24, 3, 4, 5); //実行時エラーになる
		System.out.println("time               : " + time); 
		
		//10時間後を表すインスタンス
		System.out.println("time.plusHours(10) : " + time.plusHours(10));
		
		// plusHours()メソッドを使用してもtimeのインスタンスが表す日付はかわらない
		System.out.println("time               : " + time);
		
		System.out.println("-------------------------------------------------");
		
		// nowメソッドを使用して今の時刻を保持したインスタンスを取得
		LocalTime now = LocalTime.now();
		System.out.println("現在時刻      : " + now); //取得した時刻がhh:mm:ss:nnnnnnnnで表示される
		LocalTime afterOneHours = now.plusHours(1);
		System.out.println("1時間後の時刻 : " + afterOneHours);
		
		//
		LocalTime nano0 = now.withNano(0); //withNano()メソッドを使用して対象の時刻のでナノ秒を0に設定
		System.out.println("現在時刻      : " + nano0);
		
		System.out.println("-------------------------------------------------");
		
		// ナノ秒まで一致しないと異なる時刻と判断される
		System.out.println("now.equals(nano0)              : " + now.equals(nano0));
		// ナノ秒まで一致していれば同じ時刻と判断される
		System.out.println("now.withNano(0).equals(nano0)  : " + now.withNano(0).equals(nano0));
	}
}