package jp.mylibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MainControl {
	public static void main(String[] args) {
		DbOperation dbo = new DbOperation(); //他のクラスで作成されたメソッドを呼び出す為に、DbOperationクラスを定義
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		 new ArrayList<>();
		
		while (choice != 9) {
	        	System.out.println("1: 図書の貸出");
	            System.out.println("2: 図書の返却");
	            System.out.println("3: 新規図書の登録");
	            System.out.println("4: 新規利用者の登録");
	            System.out.println("5: 図書のタイトル検索");
	            System.out.println("6: 図書の著者検索");
	            System.out.println("7: 貸出期限超過の図書一覧検索");
	            System.out.println("9: 終了");
	            System.out.println();
	        	System.out.print("選択肢を入力してください: ");
	            System.out.println();
	        try {
	            choice = scan.nextInt();
	        } catch (Exception e) {
	            scan.next(); // 入力ストリームをクリア
	        }
	        // 選択肢によって分岐
	        switch (choice) {
	            case 1: 
	            	dbo.LendingBook();
	            	break;
	            case 2: 
	            	dbo.ReturnBook();
	            	break;
	            case 3:
	            	dbo.NewRegistrationBook();
	                break;
	            case 4: 
	            	dbo.NewRegistrationUser();
	            	break;
	            case 5: 
	            	List <Book> bookList = dbo.SearchTitle();
	            	for(Book book : bookList) {
	            		System.out.printf("%s %s %s %s %s",book.getId(),book.getTitle(),book.getAuthor(),book.getIsbn(),book.getNdc());
	            	}
	            	break;
	            case 6:
	            	//List <Book> bookList = dbo.SearchAuthor();
	            	break;
	            case 7:
	            	//dbo.Search
	            	break;
	            case 9:
	            	System.out.println("終了します。");
	            	break;
	            default:
	                System.out.println("無効な選択肢です。もう一度入力してください。");
	    	}
		}
		scan.close();
	}
}
