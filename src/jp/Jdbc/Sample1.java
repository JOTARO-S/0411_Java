
/*
 * Java(応用編)
 * Javaとデータベースの連携
 * 
 * JDBC
 * 	JDBCとはデータベースごとの使用差を吸収し、Javaアプリケーションがデータベースに対して何らかのアクセスを試みる際に、
 * 	一元的なインタフェースを提供するもの
 * 
 * 	JDBCでは、例えばMySQLに接続するときはopen命令を使うのに、Oracleに接続するときはconnect命令を使う
 * 	などといったことは発生しない。ＪＤＢＣがそうした違いを内部で処理し、唯一のアクセス手段として
 * 	getConnectionメソッドを提供している。
 * 
 * 	JDBCのその中身は1個のライブラリではなく複数のライブラリの集合体となっている。
 * 	JDBCのコアは、JavaSEのjava.sqlパッケージで提供されているが、java.sqlパッケージの大部分は、
 * 	一般的なデータベース接続の管理とインタフェース、つまりメソッド名の決めごとなどを定義している。
 * 
 * 	実際に、各データベースへの一連の接続や操作を担うのは、個々のJDBCドライバと呼ばれるもので、
 * 	JDBCドライバはそれぞれ使用するデータベースによって個別に提供されているため、必要に応じて適切なドライバをインストールする必要がある
 * 
 * 	MySQL ⇒ Connector/J と呼ばれるドライバ(ライブラリ)
 * 	Postgres SQL ⇒ JDBC3 Postgresql Driver や JDBC4 Postgresql Driver		などインストールする必要がある
 * 
 * 	Eclipse で使用する場合は
 * 	ドライバーをインストール後、プロジェクトを右クリックし、ビルドパス ⇒ 外部アーカイブ追加で追加したドライバ(jarファイル)を選択する
 * 	プロジェクト直下にlibフォルダを作成し、jarファイルを入れておくとよい
 * 	(他にも環境設定からclasspathを設定する方法などもある)
 * 
 * getConnection
 * 	データベースの接続にはConnectionインタフェースのインスタンスを用いる
 * 	Connectionのインスタンス取得にはDriverManagerのstaticメソッド、getConnectionを呼ぶ
 * 	getConnection のシグネチャ
 * 		
 * 		public static Connection getConnection(String url, String user, String password)
 * 			throws SQLException { ... }
 * 
 * 	userはデータベースのユーザ名、passwordはデータベースのパスワードを指定する。
 * 	url はMySQLの場合次の形式で記述する
 * 
 * 		"jdbc:mysql://[DATABASE_URL]/[DATTABASE_NAME]" localhostの場合 jdbc:mysql://localhost/sample(データベースの名前)
 * 													   IPv4アドレスの場合  jdbc:mysql://192.168.111.11/sample(データベースの名前) など
 */
package jp.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample1 {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			DriverManager.getConnection("jdbc:mysql://localhost/sample", "test","password"); //mySQL情報
			System.out.println("MySQLに接続しました");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
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