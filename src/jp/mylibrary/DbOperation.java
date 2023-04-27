package jp.mylibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DbOperation {
	
	//利用者に対する図書の貸出
	void LendingBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Scanner scanner = new Scanner(System.in);
		StringBuilder sql = new StringBuilder();
		StringBuilder url = new StringBuilder(); //データベースのURL
		StringBuilder parameter = new StringBuilder(); //パラメータ
		StringBuilder user = new StringBuilder(); //データベースのユーザ名 
		StringBuilder password = new StringBuilder(); //データベースのパスワード
		
		try {
			sql.append("INSERT INTO managelending(book_id, user_id, untilReturn) VALUES (?,?,?)"); //SQL文
			url.append("jdbc:mysql://localhost/mylibrary"); //データベースのURL
			//parameter.append("?useUnicode=true&characterEncodeing=utf8"); //パラメータ
			user.append("test"); //データベースのユーザ名 
			password.append("password"); //データベースのパスワード
			// conn にデータベースに接続するために必要な情報を入力する
			conn = DriverManager.getConnection(url.toString(), user.toString(), password.toString());
			// SQL ステートメントをデータベースに送信するための SQLServerStatement オブジェクトを作成
			stmt = conn.createStatement();
			// stmtで作成した SQLServerStatement オブジェクトにSELECT文の命令を実行
			ps = conn.prepareStatement(sql.toString());
			
			System.out.println("本IDを入力してください");
			String bookId = scanner.next();
			System.out.println("利用者のIDを入力してください");
			String userId = scanner.next();
			System.out.println("返却期日(YYYY-MM-DD)");
			String untilReturn = scanner.next();
			
			ps.setString(1, bookId);
			ps.setString(2, userId);
			ps.setString(3, untilReturn);
			ps.executeUpdate();
			System.out.printf("本ID:%s 利用者ID: %s 返却期日: %s で登録しました。%n%n",bookId,userId,untilReturn);
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) { e.printStackTrace(); }
			}
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
			if (sql != null) { sql.delete(0, sql.length());}
			if (url != null) { url.delete(0, url.length());}
			if (parameter != null) { parameter.delete(0, parameter.length());}
			if (user != null) { user.delete(0, user.length());}
			if (password != null) { password.delete(0, password.length());}
		}
	}
	
	//利用者に対する図書の返却
	void ReturnBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Scanner scanner = new Scanner(System.in);
		StringBuilder sql = new StringBuilder();
		StringBuilder url = new StringBuilder(); //データベースのURL
		StringBuilder parameter = new StringBuilder(); //パラメータ
		StringBuilder user = new StringBuilder(); //データベースのユーザ名 
		StringBuilder password = new StringBuilder(); //データベースのパスワード
		
		try {
			sql.append("DELETE FROM managelending WHERE book_id = ?"); //SQL文
			url.append("jdbc:mysql://localhost/mylibrary"); //データベースのURL
			//parameter.append("?useUnicode=true&characterEncodeing=utf8"); //パラメータ
			user.append("test"); //データベースのユーザ名 
			password.append("password"); //データベースのパスワード
			// conn にデータベースに接続するために必要な情報を入力する
			conn = DriverManager.getConnection(url.toString(), user.toString(), password.toString());
			// SQL ステートメントをデータベースに送信するための SQLServerStatement オブジェクトを作成
			stmt = conn.createStatement();
			// stmtで作成した SQLServerStatement オブジェクトにSELECT文の命令を実行
			ps = conn.prepareStatement(sql.toString());
			
			System.out.println("本IDを入力してください");
			String bookId = scanner.next();
			
			ps.setString(1, bookId);

			ps.executeUpdate();
			System.out.printf("本ID:%s を返却登録しました。%n%n",bookId);
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) { e.printStackTrace(); }
			}
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
			if (sql != null) { sql.delete(0, sql.length());}
			if (url != null) { url.delete(0, url.length());}
			if (parameter != null) { parameter.delete(0, parameter.length());}
			if (user != null) { user.delete(0, user.length());}
			if (password != null) { password.delete(0, password.length());}
		}
	}
	
	//新規図書の登録
	void NewRegistrationBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Scanner scanner = new Scanner(System.in);
		StringBuilder sql = new StringBuilder();
		StringBuilder url = new StringBuilder(); //データベースのURL
		StringBuilder parameter = new StringBuilder(); //パラメータ
		StringBuilder user = new StringBuilder(); //データベースのユーザ名 
		StringBuilder password = new StringBuilder(); //データベースのパスワード
		
		try {
			sql.append("INSERT managebook(title, author, isbn, ndc) VALUES (?,?,?,?)"); //SQL文
			url.append("jdbc:mysql://localhost/mylibrary"); //データベースのURL
			//parameter.append("?useUnicode=true&characterEncodeing=utf8"); //パラメータ
			user.append("test"); //データベースのユーザ名 
			password.append("password"); //データベースのパスワード
			// conn にデータベースに接続するために必要な情報を入力する
			conn = DriverManager.getConnection(url.toString(), user.toString(), password.toString());
			// SQL ステートメントをデータベースに送信するための SQLServerStatement オブジェクトを作成
			stmt = conn.createStatement();
			// stmtで作成した SQLServerStatement オブジェクトにSELECT文の命令を実行
			ps = conn.prepareStatement(sql.toString());
			
			System.out.println("タイトルを入力してください");
			String title = scanner.next();
			System.out.println("著者を入力してください");
			String author = scanner.next();
			System.out.println("ISBNを入力してください");
			String isbn = scanner.next();
			System.out.println("NDCを入力してください");
			String ndc = scanner.next();
			ps.setString(1, title);
			ps.setString(2, author);
			ps.setString(3, isbn);
			ps.setString(4, ndc);
			ps.executeUpdate();
			System.out.printf("タイトル:%s 著者: %s ISBN: %s NDC: %sで登録しました。%n%n",title,author,isbn,ndc);
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) { e.printStackTrace(); }
			}
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
			if (sql != null) { sql.delete(0, sql.length());}
			if (url != null) { url.delete(0, url.length());}
			if (parameter != null) { parameter.delete(0, parameter.length());}
			if (user != null) { user.delete(0, user.length());}
			if (password != null) { password.delete(0, password.length());}
		}
	}
	
	
	// 新規利用者の登録
	 void NewRegistrationUser() {
		 
		 Connection conn = null;
		 Statement stmt = null;
		 ResultSet rs = null;
		 PreparedStatement ps = null;
		 Scanner scanner = new Scanner(System.in);
		 StringBuilder sql = new StringBuilder();
		 StringBuilder url = new StringBuilder(); //データベースのURL
		 StringBuilder parameter = new StringBuilder(); //パラメータ
		 StringBuilder user = new StringBuilder(); //データベースのユーザ名 
		 StringBuilder password = new StringBuilder(); //データベースのパスワード
			
		try {
			sql.append("INSERT manageuser(name, phonenumber, addres) VALUES (?,?,?)"); //SQL文
			url.append("jdbc:mysql://localhost/mylibrary"); //データベースのURL
			//parameter.append("?useUnicode=true&characterEncodeing=utf8"); //パラメータ
			user.append("test"); //データベースのユーザ名 
			password.append("password"); //データベースのパスワード
			// conn にデータベースに接続するために必要な情報を入力する
			conn = DriverManager.getConnection(url.toString(), user.toString(), password.toString());
			// SQL ステートメントをデータベースに送信するための SQLServerStatement オブジェクトを作成
			stmt = conn.createStatement();
			// stmtで作成した SQLServerStatement オブジェクトにSELECT文の命令を実行
			ps = conn.prepareStatement(sql.toString());
			
			System.out.println("名前を入力してください");
			String name = scanner.next();
			System.out.println("電話番号を入力してください");
			String phonenumber = scanner.next();
			System.out.println("住所を入力してください");
			String addres = scanner.next();
			ps.setString(1, name);
			ps.setString(2, phonenumber);
			ps.setString(3, addres);
			ps.executeUpdate();
			System.out.printf("名前:%s 電話番号: %s 住所: %sで登録しました。%n%n",name,phonenumber,addres);
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) { e.printStackTrace(); }
			}
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
			if (sql != null) { sql.delete(0, sql.length());}
			if (url != null) { url.delete(0, url.length());}
			if (parameter != null) { parameter.delete(0, parameter.length());}
			if (user != null) { user.delete(0, user.length());}
			if (password != null) { password.delete(0, password.length());}
		}
		
		
	}
	//図書のタイトル検索
	 List<Book> SearchTitle() {
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			PreparedStatement ps = null;
			Scanner scanner = new Scanner(System.in);
			StringBuilder sql = new StringBuilder();
			StringBuilder url = new StringBuilder(); //データベースのURL
			StringBuilder parameter = new StringBuilder(); //パラメータ
			StringBuilder user = new StringBuilder(); //データベースのユーザ名 
			StringBuilder password = new StringBuilder(); //データベースのパスワード
			ArrayList<Book> bookList = new ArrayList<>();
			
			try {
				sql.append("SELECT * FROM managebook WHERE title = ?"); //SQL文
				url.append("jdbc:mysql://localhost/mylibrary"); //データベースのURL
				//parameter.append("?useUnicode=true&characterEncodeing=utf8"); //パラメータ
				user.append("test"); //データベースのユーザ名 
				password.append("password"); //データベースのパスワード
				// conn にデータベースに接続するために必要な情報を入力する
				conn = DriverManager.getConnection(url.toString(), user.toString(), password.toString());
				// SQL ステートメントをデータベースに送信するための SQLServerStatement オブジェクトを作成
				stmt = conn.createStatement();
				// stmtで作成した SQLServerStatement オブジェクトにSELECT文の命令を実行
				ps = conn.prepareStatement(sql.toString());
				
				System.out.println("本のタイトル");
				String bookId = scanner.next();
				
				ps.setString(1, bookId);

				rs = ps.executeQuery();
				while(rs.next()) { //データベースに保存されているデータの数だけ繰り返す
					int id = rs.getInt("id"); //データベースからデータを１つずつ取得する
					String title = rs.getString("title");
					String author = rs.getString("author");
					String isbn = rs.getString("isbn");
					String ndc = rs.getString("ndc");
					
					Book list = new Book(id, title, author, isbn, ndc); //取得したデータを 新しくAthleteData で作成する
					bookList.add(list); //ArrayList<AthleteData> list に 取得したデータを追加する
				}
				
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				if (ps != null) {
					try {
						ps.close();
					} catch (SQLException e) { e.printStackTrace(); }
				}
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
				if (sql != null) { sql.delete(0, sql.length());}
				if (url != null) { url.delete(0, url.length());}
				if (parameter != null) { parameter.delete(0, parameter.length());}
				if (user != null) { user.delete(0, user.length());}
				if (password != null) { password.delete(0, password.length());}
			}
			return bookList;
		}
	
}
