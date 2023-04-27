
/*
 * Java(応用編)
 * Javaとデータベースの連携
 * 
 * insert, update, delete文の実行
 * 
 * 	insert, update, deleteのSQL文の場合もStatementオブジェクトを用いるが、実行にはexecuteQueryではなくexecuteUpdateメソッドを用いる
 * 
 * 	executeUpdateの戻り値はResultSetではなく、intとなる。これは更新があった行数を表している。
 * 
 */
package jp.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample3 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO athletes(name1, name2, event_id, gender) VALUES ('大谷', '翔平', 2,'男')"); //追加するSQL文を入力
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/athlete", "test","password"); //mySQL情報
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql.toString()); //executeUpdate 処理 
			System.out.println(result); //追加した件数を表示
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close(); //クローズ処理
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}