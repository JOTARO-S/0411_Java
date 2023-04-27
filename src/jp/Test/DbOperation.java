package jp.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/* 
 * DE処理用のクラス
 * 
 * 	DBの操作
 * 	値の取得
 * 
 * 	クラス間でやり取りをする場合はデータの受け渡しが出来るように 条件に応じたメソッド を作成する。
 * 	IDを取得するなら引数がint型のメソッド、全て取得するなどいらないものであれば引数が空のメソッド など
 * 
 * 	処理用のクラスであるため全ての処理が終了後、呼び出し元に値を返す
 * 
 */

public class DbOperation {
	/* Athletesテーブルから全件取得
	 *	引数は空, 戻り値はint型やString型などがある為、Collectionや配列などで作成
	 * 	
	 */
	List<AthleteData> getAthleteAll() { //他のクラスで作成されている AthleteData クラス
		//DBの処理
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<AthleteData> list = new ArrayList<>(); //AthleteDataを保存するため新しくlistという名前のArrayListを作成する(有効範囲に注意)
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM athletes");
		
		try {
			//データベースのURL
			StringBuilder url = new StringBuilder();
			url.append("jdbc:mysql://localhost/athlete");
			//パラメータ
			//StringBuilder parameter = new StringBuilder();
			//parameter.append("?useUnicode=true&characterEncodeing=utf8");
			//データベースのユーザ名 
			StringBuilder user = new StringBuilder();
			user.append("test");
			//データベースのパスワード
			StringBuilder password = new StringBuilder();
			password.append("password");
			// conn にデータベースに接続するために必要な情報を入力する
			conn = DriverManager.getConnection(url.toString(), user.toString(), password.toString());
			// SQL ステートメントをデータベースに送信するための SQLServerStatement オブジェクトを作成
			stmt = conn.createStatement();
			// stmtで作成した SQLServerStatement オブジェクトにSELECT文の命令を実行
			rs = stmt.executeQuery(sql.toString());

			while(rs.next()) { //データベースに保存されているデータの数だけ繰り返す
				int athleteId = rs.getInt("athlete_id"); //データベースからデータを１つずつ取得する
				String name1 = rs.getString("name1");
				String name2 = rs.getString("name2");
				int eventId = rs.getInt("event_id");
				String gender = rs.getString("gender");
				
				AthleteData data = new AthleteData(athleteId, name1, name2, eventId, gender); //取得したデータを 新しくAthleteData で作成する
				list.add(data); //ArrayList<AthleteData> list に 取得したデータを追加する
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) { e.printStackTrace(); }
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) { e.printStackTrace(); }
			}
			if (conn != null) {
				try {
					stmt.close();
				} catch (SQLException e) { e.printStackTrace(); }
			}
		}
		 return list; //listを戻り値として返す
	}
}
