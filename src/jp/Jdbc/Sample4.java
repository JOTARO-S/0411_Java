
/*
 * Java(応用編)
 * Javaとデータベースの連携
 * 
 * PreparedStatementによるクエリの実行
 * 
 * 	SQL文をプリコンパイルするPreparedStatementを用いることで処理を高速にできる。
 * 	また、日本語を登録するためにはURLにパラメータで文字コードを指定する必要がある。
 * 
 * 	PreparedStatementで用いるSQL文には「?」を入れることが出来る。これはパラメータ変数とよばれ、後から値を代入できるようにしたものを指す。
 * 	パラメータ変数への値の代入にはset～メソッドを用いる。set～メソッドの第一引数はパラメータ変数のインデックス、第二引数に値を指定する。
 * 	Statementオブジェクトと同様、クエリの実行にSELECT文ではexecuteQuery、INSERT/UPDATE/DELETEではexecuteUpdateを用いる。
 * 
 * 	検索機能の例
 * 
 * 		"SELECT * FROM athletes WHERE name1 = ?"  // ? にユーザーが送ってきた変数を代入する
 * 
 * 	複数行の場合
 * 		
 * 		"UPDATE athletes SET name1 = ? WHERE athlete_id = ?" //2か所あるため、それぞれに変数を代入しなければならない
 * 
 * 		setString(1, "太郎"); // 1つ目の ? に String型の "太郎" を代入する
 * 		setInt(2, 1);	//	2つ目の ? に Int型の 1 を代入する
 * 
 */
package jp.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sample4 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE athletes SET name2 = ? WHERE athlete_id = ?");
		
		try {
			String url = "jdbc:mysql://localhost/athlete";
			String parameter = "?useUnicode=true&characterEncodeing=utf8";
			String user = "test";
			String password = "password";
			conn = DriverManager.getConnection(url + parameter, user, password); //mySQL情報
			ps = conn.prepareStatement(sql.toString());
			ps.setString(1, "太郎");
			ps.setInt(2, 1);
			ps.executeUpdate();
			System.out.println("athletesテーブルのathlete_idが1のレコードのname2を太郎にしました");	
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
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