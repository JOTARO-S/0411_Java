/*
 *  Itemクラスを作成
 *  id, name, price を保持
 *  setter, getter
 *  
 *  item.txtファイルを用意して以下を書き込み
 *  
 *  1, パソコン, 200000
 *  2, ボールペン, 120
 *  3, 教科書, 4000
 *  
 *  item.txtから読み込んだデータをもとにItemオブジェクトを作成
 * 
 * 
 * 
 */

package jp.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


class Item {
	private int id;
	private String name;
	private int price;
	
	//setter
	void setId(int id) {
		this.id = id;
	}
	void setName(String name) {
		this.name = name;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
	//getter
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	int getPrice() {
		return price;
	}
}

public class Test_0424 {
	public static void main(String[] args) {	
		File inputFile = null;
		BufferedReader in = null;
		
		ArrayList<Item> list = new ArrayList<>();
		
		try {
			inputFile = new File("item.txt");
			in = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), "Shift-JIS"));
			String line;
			while((line = in.readLine()) != null) {
				Item item = new Item();
				String[] str = line.split(",");
				item.setId(Integer.parseInt(str[0]));
				item.setName(str[1]);
				item.setPrice(Integer.parseInt(str[2]));
				list.add(item);
			}
			for(Item i : list) {
				System.out.println((i.getId()) + ", " + (i.getName()) + ", " + (i.getPrice()));
			}
			
		} catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException occurs");
		} catch(IOException e) {
			System.out.println("IOException occurs");
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch(IOException e) {
				System.out.println("close fail");
				e.printStackTrace();
			}
		}
	}
}
