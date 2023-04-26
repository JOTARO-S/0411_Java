
/*
 * Java(応用編)
 * Javaとデータベースの連携
 * 
 * SELECT文の実行
 * 	接続したデータベースにSQL文を実行するにはStatementオブジェクトを用いる
 * 	StatementオブジェクトはConnectionのcreateStatementメソッドにより取得する。
 * 
 * 	SELECT文はexecuteQueryにより実行する。実行結果はResultSetに格納される。
 * 	ResultSetから実際の値を取り出すためにカーソルという概念を理解する必要がある。
 * 	ResultSetオブジェクトには複数の行のデータが含まれているが、カーソルは現在の行の位置を表す。
 * 	ResultSetのnextメソッドはカーソルを次に移動する処理を行い、移動先がある場合trueを返す。
 * 	また、get～(String columnLabel)により現在のカーソルに応じた値を取得できる。
 * 
 */
package jp.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample2 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		// String sql = "SELECT athlete_id, name1, name2 FROM athletes"; //String型 mySQLに命令
		
		StringBuilder sql = new StringBuilder(); //StringBuilder型で作成した方が、のちに追加しやすい
		sql.append("SELECT a.athlete_id, a.name1, a.name2, e.name FROM athletes a JOIN events e ON a.event_id = e.event_id"); //sql.append() で 命令文を追加
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/athlete", "test","password"); //mySQL情報
			stmt = conn.createStatement();
			// rs = stmt.executeQuery(sql); //String型はそのまま
			rs = stmt.executeQuery(sql.toString()); //StringBuilderの場合、toString()でString型に変換が必要 (executeQuery で実行)
			
			while(rs.next()) {
				System.out.println(rs.getInt("athlete_id") + " : " + rs.getString("name1") + " " + rs.getString("name2") + ", " + rs.getString("name") );
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
	}
}