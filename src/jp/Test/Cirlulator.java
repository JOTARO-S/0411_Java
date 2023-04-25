package jp.Test;

import java.util.Scanner;

class Bank {
	int id;
	String name;
	long money;
	
	Bank(int id, String name, long money) {
		this.id = id;
		this.name = name;
		this.money = money;
	}
	//setter
	void setName(String name) {
		this.name = name;
	}
	void setMoney(long money) {
		this.money = money;
	}
	//getter
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	long getMoney() {
		return money;
	}
	void show() {
		System.out.println("口座番号: " + id + ", 名前: " + name + ", 残高: " + money + "円です。");
	}
	
}

public class Cirlulator {
	public static void main(String[] args) {
		Bank user1 = new Bank(1000001,"山田",1000000);
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		long num = 0;
		
		while (choice != 9) {
			System.out.println("1: 預ける");
            System.out.println("2: 引き出す");
            System.out.println("3: 残高照会");
            System.out.println("9: 終了");
			System.out.print("選択肢を入力してください: ");
			try {
				choice = scanner.nextInt();
			} catch (Exception e) {
	            scanner.next(); // 入力ストリームをクリア
			}
			switch (choice) {
            case 1: //預ける
            	System.out.println("パスワードを入力してください: ******** ");
            	System.out.println("お金を入金してください。:");
            	num = scanner.nextLong();
            	if (num >= 1) {
            		user1.setMoney(user1.getMoney() + num);
            	} else {
            		System.out.println("最初からやり直してください。");
            	}
            	
            	System.out.println("残高は " + user1.getMoney() + "円です。" );
            	System.out.println("ご利用ありがとうございました。");
            	System.out.println();
            	break;
            case 2: //引き出す
            	System.out.println("パスワードを入力してください: ******** ");
            	System.out.println("引き出す金額を入力してください。:");
            	num = scanner.nextLong();
            	if (num > user1.getMoney()) {
            		System.out.println("残高が足りません。最初からやり直してください。");
            	} else if (num <= user1.getMoney()) {
            		user1.setMoney(user1.getMoney() - num);
            	} else {
            		System.out.println("最初からやり直してください。");
            	}
            	System.out.println("残高は " + user1.getMoney() + "円です。" );
            	System.out.println("ご利用ありがとうございました。");
            	System.out.println();
            	break;
            case 3: //残高照会
            	System.out.println("パスワードを入力してください: ******** ");
                user1.show();
                System.out.println("ご利用ありがとうございました。");
                System.out.println();
                break;
            case 9: //終了
            	System.out.println("終了します");
            	System.out.println("ご利用ありがとうございました。");
            	System.out.println();
            	break;
            default:
                System.out.println("無効な選択肢です。もう一度入力してください。");
                ;
    		}
		}
		scanner.close();
	}
}
