package jp.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Scanner scanner = new Scanner(System.in);
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT a.athlete_id, a.name1, a.name2, e.name FROM athletes a JOIN events e ON a.event_id = e.event_id");
		
		try {
			String url = "jdbc:mysql://localhost/athlete";
			String parameter = "?useUnicode=true&characterEncodeing=utf8";
			String user = "test";
			String password = "password";
			conn = DriverManager.getConnection(url + parameter, user, password); //mySQL情報
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql.toString()); //StringBuilderの場合、toString()でString型に変換が必要 (executeQuery で実行)
			
			while(rs.next()) {
				System.out.println(rs.getInt("athlete_id") + " : " + rs.getString("name1") + " " + rs.getString("name2") + ", " + rs.getString("name") );
			}
			
			sql.delete(0, sql.length());
			sql.append("UPDATE athletes SET name2 = ? WHERE athlete_id = ?");
			
			ps = conn.prepareStatement(sql.toString());
			System.out.println("athlete_idを入力してください");
			int id = scanner.nextInt();
			System.out.println("新しいname2を入力してください");
			String name2 = scanner.next();
			ps.setString(1, name2);
			ps.setInt(2, id);
			ps.executeUpdate();
			System.out.println("athletesテーブルのathlete_idが[ " + id + " ]のレコードのname2を[ " + name2 + " ]にしました");	
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace(); 
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace(); 
				}
			}
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
		scanner.close();
		
	}
}
