package jp.sample2;

public class Sample2_9 {
	public static void main(String[] args) {
	    int a = 10;
	    int b = 20;

	    System.out.println("a == b   : " + (a == b)); // a == b aとbが等しい場合⇒True
	    System.out.println("a != b   : " + (a != b)); // a != b aとbが等しくない場合⇒True
	    System.out.println("a > b    :" + (a > b));  // a > b   aがbより大きい場合⇒True
	    System.out.println("a >= b   : " + (a >= b)); // a >= b aがb以上の場合⇒True
	    System.out.println("a < b    : " + (a < b)); // a < b   bがaより大きい場合⇒True
	    System.out.println("-a <= b  : " + (a <= b)); // a <= b   bがa以上場合⇒True
	    
	    //---------------------------------------------------------
	    
	    a = a + 10;
	    
	    if(a == b) {
	    	System.out.println("a は b と同じ数字です。 a: " + a + " b: " + b );
	    } else if(a < b) {
	    	System.out.println("a は b より小さい数字です。 a: " + a + " b: " + b );
	    } else if(a > b) {
	    	System.out.println("a は b より大きい数字です。 a: " + a + " b: " + b );
	    } else {
	    	System.out.println("error  a: " + a + " b: " + b );
	    }

	}

}