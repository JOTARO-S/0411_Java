package jp.Practice.p0417;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Random;

public class Practice0417_11 {
	public static void main(String[] args) {
	//Practice0417_11
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> numArray = new ArrayList<>(10);
		//Random rand = new Random();
		//num = 1 + rand.nextInt(10); //ランダムな1～10の間で値を生成する
		
		for(int i = 1; i <= 10; i++) {
			numArray.add(i);
		}
		
		Collections.shuffle(numArray);
		
		for(int i = 0; i < 5; i++) {
			list.add(i, numArray.get(i));
			System.out.println(list.get(i));
			
		}
	}
}
