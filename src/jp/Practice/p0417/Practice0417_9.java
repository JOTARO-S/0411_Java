package jp.Practice.p0417;
import java.util.ArrayList;

public class Practice0417_9 {
	public static void main(String[] args) {
	//Practice0417_9
		ArrayList<String> fruitArray = new ArrayList<>(3);
		fruitArray.add(0,"りんご");
		fruitArray.add(1,"みかん");
		fruitArray.add(2,"ばなな");
		
		ArrayList<Integer> priceArray = new ArrayList<>(3);
		priceArray.add(0,120);
		priceArray.add(1,150);
		priceArray.add(2,90);
		
		for(int i = 0; i < fruitArray.size(); i++) {
			System.out.println(fruitArray.get(i) + " => " + priceArray.get(i) + "円" );
			
			/*String str = fruitArray.get(i);
			 * str += " => ";
			 * str += priceArray.get(i);
			 * str += "円";
			 * System.out.println(str);
			*/
			
		}
	}
}
