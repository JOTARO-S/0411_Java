package jp.Test;

import java.util.HashMap;
import java.util.Scanner;

/* 
 * shopクラスを作成
 * ID, 名前, 住所
 * コンストラクタで上記3つを設定
 * 
 * show()メソッドで3つの情報を表示
 * 
 * メイン
 * 	MapにShopオブジェクトを３つ格納
 * 	キーはID、値はオブジェクト
 */

class Shop {
	private int id;
	private String name;
	private String address;
	
	Shop(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void setId(int id) {
		this.id = id;
	}
	void setName(String name) {
		this.name = name;
	}
	void setAddress(String address) {
		this.address = address;
	}
	void show() {
		System.out.println("ID: " + id + ", 店名: " + name + ", 住所: " + address);
	}
}

public class Test0425_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, Shop> shopList = new HashMap<>();
		int choice = 1;
		
		
		while (true) {
			System.out.println("データを入力してください: 0で終了");
			try {
				choice = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("半角数字を入力してください");
	            scanner.next(); // 入力ストリームをクリア
	            continue;
			}
			if (choice == 0) {
				break;
			} else {
				System.out.println("");
			}
			System.out.println("IDを入力してください");
			int id = scanner.nextInt();
				
			System.out.println("店名を入力してください");
			String name = scanner.next();
			
			System.out.println("住所を入力してください");
			String address = scanner.next();

			shopList.put(id, new Shop(id, name, address));
			}
			
			for (Shop shop : shopList.values()) {
				shop.show();
		}
		scanner.close();
	}

}


