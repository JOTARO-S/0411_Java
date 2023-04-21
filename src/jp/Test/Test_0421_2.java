package jp.Test;

/* インターフェース MyInt を作成
 * 抽象メソッド sum を定義 int[] を受け取り値はint
 * 
 * MyIntを実装するクラスMyClassを作成
 * sum は受け取った配列の中身を合計するようにする
 * 
 */

interface MyInt {
	int sum(int[] array);
}

// クラスを作成
class MyClass implements MyInt {
	@Override
	public int sum(int[] array) {
		int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
	}
}


public class Test_0421_2 {
    public static void main(String[] args) {
    	int[] arr = {10, 15, 20, 25, 30};
        MyClass mi = new MyClass();
        System.out.println(mi.sum(arr)); 
       
        //匿名クラス (名前を持たないネストクラス)
        MyInt mi2 = (new MyInt() { //MyInt mi2 = new MyClass(); をクラス宣言せずに実施
        	public int sum(int[] array) { //クラスを作成したときの内容
	            int sum = 0;			  //クラスを作成したときの内容
	            for (int num : array) {   //クラスを作成したときの内容
	                sum += num;			  //クラスを作成したときの内容
	            }						  //クラスを作成したときの内容
	            return sum;				  //クラスを作成したときの内容
        	}							  //クラスを作成したときの内容
        });
        System.out.println(mi2.sum(arr));
        
        //ラムダ式
        MyInt mi3 = (array) -> {
        		int sum = 0;
        		for(int num : array) {
        			sum += num;
        		}
        		return sum;
        };
        System.out.println(mi3.sum(arr));
    }
}


