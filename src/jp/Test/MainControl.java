package jp.Test;

import java.util.List;

/*
 * メインクラス
 * 	
 * 	表示
 */



public class MainControl {
	public static void main(String[] args) {
		/*
		 * クラスを分けて、作成する際の手順
		 * 	一度、
		 */
		DbOperation dbo = new DbOperation(); //他のクラスで作成されたメソッドを呼び出す為に、DbOperationクラスを定義
		List<AthleteData> list = dbo.getAthleteAll(); //格納するためのList<AthleteData> listを作成し、dbo.getAthleteAll()を実行
		
		for(AthleteData ad : list) {
			
			/*
			System.out.println("ID: " + ad.getAthleteId() + ", " + ad.getName1() + " " + ad.getName2()
			+ ", " + ad.getEventId() +", " + ad.getGender());
			 */
			
			//printfの場合 任意のフォーマットで出力できる( %s = 引数, %n = 改行 、他にも %d = 整数, %f = 小数点などもある)
			System.out.printf("名前:%s %s 性別:%s%n",ad.getName1(),ad.getName2(),ad.getGender()); 
		}		
	}
}

/*
 * 
 */
