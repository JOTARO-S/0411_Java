
/*
 * Java(応用編)
 * 
 * ファイルシステムのナビゲーション
 * 	Fileクラスのオブジェクトが完成したら、次はファイルシステムのナビゲーションファイルの作成など
 * 	ファイルシステム内のファイルに対する処理を実行する
 * 
 * Fieクラスのメソッド
 * 	boolean exsits() ⇒ Fileオブジェクトに対応するパスを示すファイルまたはディレクトリが存在する場合にtrueを返す など 8p参照
 * 
 * 
 */

package jp.ssie.ocjp.exam0424;

import java.io.File;

public class Sample11_2 {
	public static void main(String[] args) {
		//デフォルトとしてカレントディレクトリ
		String treeRoot = "src\\jp\\ssie\\ocjp\\exam0424"; //treeRootに絶対パスを代入する
		
		if(args.length >= 1) { //args(コマンドライン引数)のlengthが1以上(つまりコマンドライン引数が入力されていた場合)
			treeRoot = args[0]; //コマンドライン引数に入力されているものをtreeRoot に代入する。
		}
		File rootDir = new File(treeRoot);
		System.out.println("Root of navigation:" + rootDir.getAbsolutePath());
		//ルートがディレクトリとして存在するか確認
		if(!(rootDir.isDirectory())) {
			System.out.println("The root of the navigation subtree"
					+ "does not exist as a directory!");
			System.exit(0);
		}
		Sample11_2 obj = new Sample11_2();
		obj.navigate(rootDir);
	}
	
	//指定された抽象パスの情報の取り出し
	public void navigate(File dir) {
		System.out.println(" ");
		System.out.println("Directory" + dir + ":");
		
		String[] dirContent = dir.list();
		for(int i = 0; i < dirContent.length; i++) {
			System.out.println(dirContent[i]);
			File child = new File(dir, dirContent[i]);
			if(child.isDirectory()) {
				navigate(child);
			}
		}
	}
}