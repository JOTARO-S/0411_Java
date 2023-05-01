package jp.mylibrary;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

interface DbInterface {

	void LendingBook();
	void ReturnBook();
	void NewRegistrationBook();
	void NewRegistrationUser();
	ArrayList<Library> SearchTitle();
	ArrayList<Library> SearchAuthor();
	ArrayList<Library> OverdueBooks();	
}

public class DbOperation implements DbInterface {
	
	private static final String DB_URL = "jdbc:mysql://localhost/mylibrary";
    private static final String DB_USER = "test";
    private static final String DB_PASSWORD = "password";
	
	//利用者に対する図書の貸出
	
	@Override
	public void LendingBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Scanner scanner = new Scanner(System.in);
		StringBuilder sql = new StringBuilder();
		LocalDate localdate = LocalDate.now();
		
		try {
			sql.append("INSERT INTO managelending(book_id, user_id, untilReturn) VALUES (?,?,?)"); //SQL文
			// conn にデータベースに接続するために必要な情報を入力する
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			// SQL ステートメントをデータベースに送信するための SQLServerStatement オブジェクトを作成
			stmt = conn.createStatement();
			// stmtで作成した SQLServerStatement オブジェクトにSELECT文の命令を実行
			ps = conn.prepareStatement(sql.toString());
			
			System.out.println("本IDを入力してください");
			String bookId = scanner.next();
			System.out.println("利用者のIDを入力してください");
			String userId = scanner.next();
			System.out.println("返却期日は何日後ですか？");
			long ReturnDay = scanner.nextLong();
			String untilReturn = (localdate.plusDays(ReturnDay)).toString();
			
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
		}
	}
	
	//利用者に対する図書の返却
	@Override
	public void ReturnBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Scanner scanner = new Scanner(System.in);
		StringBuilder sql = new StringBuilder();
		
		try {
			sql.append("DELETE FROM managelending WHERE book_id = ?"); //SQL文
			// conn にデータベースに接続するために必要な情報を入力する
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
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
		}
	}
	
	//新規図書の登録
	@Override
	public void NewRegistrationBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Scanner scanner = new Scanner(System.in);
		StringBuilder sql = new StringBuilder();
		
		try {
			sql.append("INSERT managebook(title, author, isbn, ndc) VALUES (?,?,?,?)"); //SQL文
			// conn にデータベースに接続するために必要な情報を入力する
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
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
		}
	}
	
	
	// 新規利用者の登録
	 public void NewRegistrationUser() {
		 
		 Connection conn = null;
		 Statement stmt = null;
		 ResultSet rs = null;
		 PreparedStatement ps = null;
		 Scanner scanner = new Scanner(System.in);
		 StringBuilder sql = new StringBuilder();
			
		try {
			sql.append("INSERT manageuser(name, phonenumber, address) VALUES (?,?,?)"); //SQL文
			// conn にデータベースに接続するために必要な情報を入力する
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			// SQL ステートメントをデータベースに送信するための SQLServerStatement オブジェクトを作成
			stmt = conn.createStatement();
			// stmtで作成した SQLServerStatement オブジェクトにSELECT文の命令を実行
			ps = conn.prepareStatement(sql.toString());
			
			System.out.println("名前を入力してください");
			String name = scanner.next();
			System.out.println("電話番号を入力してください");
			String phonenumber = scanner.next();
			System.out.println("住所を入力してください");
			String address = scanner.next();
			ps.setString(1, name);
			ps.setString(2, phonenumber);
			ps.setString(3, address);
			ps.executeUpdate();
			System.out.printf("名前:%s 電話番号: %s 住所: %sで登録しました。%n%n",name,phonenumber,address);
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
		}
		
		
	}
	//図書のタイトル検索
	 @Override
	 public ArrayList<Library> SearchTitle() {
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			PreparedStatement ps = null;
			Scanner scanner = new Scanner(System.in);
			StringBuilder sql = new StringBuilder();
			ArrayList<Library> list = new ArrayList<>();
			
			try {
				sql.append("SELECT * FROM managebook m LEFT JOIN managelending l ON m.id = l.book_id WHERE title LIKE ?"); //SQL文
				// conn にデータベースに接続するために必要な情報を入力する
				conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				// SQL ステートメントをデータベースに送信するための SQLServerStatement オブジェクトを作成
				stmt = conn.createStatement();
				// stmtで作成した SQLServerStatement オブジェクトにSELECT文の命令を実行
				ps = conn.prepareStatement(sql.toString());
				
				System.out.println("本のタイトル");
				String bookTitle = scanner.next();
				
				System.out.println("部分検索で検索しますか？ 1,yes(y)");
				String x = scanner.next();
				switch (x) {
	            case "1": 
	            	ps.setString(1,"%" + bookTitle + "%");
	            	break;
	            case "y": 
	            	ps.setString(1,"%" + bookTitle + "%");
	            	break;
	            case "yes": 
	            	ps.setString(1,"%" + bookTitle + "%");
	            	break;
				default:
					ps.setString(1, bookTitle);
				}
				

				rs = ps.executeQuery();
				while(rs.next()) { //データベースに保存されているデータの数だけ繰り返す				
					Book book = new Book();
					Lending len = new Lending();
					Library library = new Library();
					book.setId(rs.getInt("id"));
					book.setTitle(rs.getString("title"));
					book.setAuthor(rs.getString("author"));
					book.setIsbn(rs.getString("isbn"));
					book.setNdc(rs.getString("ndc"));
					len.setBook_id(rs.getInt("book_id"));
					
					library.setBook(book);
					library.setLending(len);
					list.add(library);
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
			}
			return list;
		}
	 
	 	//図書の著者検索
	 	@Override
		 public ArrayList<Library> SearchAuthor() {
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				PreparedStatement ps = null;
				Scanner scanner = new Scanner(System.in);
				StringBuilder sql = new StringBuilder();
				ArrayList<Library> list = new ArrayList<>();
				
				try {
					sql.append("SELECT * FROM managebook m LEFT JOIN managelending l ON m.id = l.book_id WHERE author LIKE ?"); //SQL文
					// conn にデータベースに接続するために必要な情報を入力する
					conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
					// SQL ステートメントをデータベースに送信するための SQLServerStatement オブジェクトを作成
					stmt = conn.createStatement();
					// stmtで作成した SQLServerStatement オブジェクトにSELECT文の命令を実行
					ps = conn.prepareStatement(sql.toString());
					
					System.out.println("著者の名前");
					String bookAuchor = scanner.next();
					
					
					System.out.println("部分検索で検索しますか？ 1,yes(y)");
					String x = scanner.next();
					switch (x) {
		            case "1": 
		            	ps.setString(1,"%" + bookAuchor + "%");
		            	break;
		            case "y": 
		            	ps.setString(1,"%" + bookAuchor + "%");
		            	break;
		            case "yes": 
		            	ps.setString(1,"%" + bookAuchor + "%");
		            	break;
					default:
						ps.setString(1, bookAuchor);
					}

					rs = ps.executeQuery();
					while(rs.next()) { //データベースに保存されているデータの数だけ繰り返す				
						Book book = new Book();
						Lending len = new Lending();
						Library library = new Library();
						book.setId(rs.getInt("id"));
						book.setTitle(rs.getString("title"));
						book.setAuthor(rs.getString("author"));
						book.setIsbn(rs.getString("isbn"));
						book.setNdc(rs.getString("ndc"));
						len.setBook_id(rs.getInt("book_id"));
						
						library.setBook(book);
						library.setLending(len);
						list.add(library);
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
				}
				return list;
			}
		 
		//貸出期限超過の図書一覧
	 	@Override
		 public ArrayList<Library> OverdueBooks() {
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				PreparedStatement ps = null;
				Scanner scanner = new Scanner(System.in);
				StringBuilder sql = new StringBuilder();
				ArrayList<Library> list = new ArrayList<>();
				
				try {
					sql.append("SELECT b.id, b.title, b.author, lu.untilReturn, lu.name, lu.phonenumber, lu.address ");
					sql.append("FROM managebook b JOIN ( ") ;
					sql.append("SELECT l.book_id, l.untilReturn, u.name, u.phonenumber, u.address FROM managelending l ");
					sql.append("JOIN manageuser u ON l.user_id = u.id) lu ON b.id = lu.book_id ");
					sql.append("WHERE lu.untilReturn < '");
					sql.append(LocalDate.now().toString());
					sql.append("'"); //SQL文
					// conn にデータベースに接続するために必要な情報を入力する
					conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
					// SQL ステートメントをデータベースに送信するための SQLServerStatement オブジェクトを作成
					stmt = conn.createStatement();

					rs = stmt.executeQuery(sql.toString());
					while(rs.next()) { //データベースに保存されているデータの数だけ繰り返す				
						Book book = new Book();
						Lending len = new Lending();
						User user = new User();
						Library library = new Library();
						book.setId(rs.getInt("id"));
						book.setTitle(rs.getString("title"));
						book.setAuthor(rs.getString("author"));
						user.setName(rs.getString("name"));
						user.setPhonenumber("phonenumber");
						user.setAddress(rs.getString("address"));
						Date date = Date.valueOf(rs.getString("untilReturn"));
						len.setUntilReturn(date);
						
						library.setBook(book);
						library.setUser(user);
						library.setLending(len);
						list.add(library);
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
				}
				return list;
			}
	
}
