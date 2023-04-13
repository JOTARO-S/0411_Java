package jp.ssie.ocjp;

public class Practice0415 {
	public static void main(String[] args) {
		
		//Practice0415_1
		
		int num = 0;
		if (num > 0) {
			System.out.println("その値は正です。");
		} else if (num < 0) {
			System.out.println("その値は負です。");
		} else if (num == 0) {
			System.out.println("その値は0です。");
		}
		
		//Practice0415_2
		
		int x = 3;
		int y = 2;
		if (y % x == 0) {
			System.out.println("xはyの約数です");
		} else if (y % x != 0) {
			System.out.println("xはyの約数ではありません");
		}
		
		//Practice0415_3
		
		int num2 = 6;
		if (num2 % 5 == 0) {
			System.out.println("5の倍数です");
		} else if (num2 % 5 != 0)  {
			System.out.println("5の倍数ではありません");
		}
		
		//Practice0415_4
		
		int num3 = 101;
		if(0 <= num3 && num3 < 60) {
			System.out.println("不可");
		} else if (num3 >= 60 && num3 < 70) {
			System.out.println("可");
		} else if (num3 >= 70 && num3 < 80) {
			System.out.println("良");
		} else if (num3 >= 80 && num3 <= 100) {
			System.out.println("優");
		} else {
			System.out.println("不正な点数です");	
		}
		
		
		
		
		//Practice0415_5
		
		int a = 100;
		int b = 200;
		if (a + b >= 100) {
			System.out.println("100以上です。");
		} else if (a + b <= 100){
			System.out.println("100未満です。");
		}
		
		//Practice0415_6
		
		int c = 100;
		int d = 500;
		if (c < d) {
			System.out.println(d - c);
		} else if (d < c) {
			System.out.println(c - d);
		}
		
		//Practice0415_7
		
		int e = 50;
		int f = 11;
		if (e < f) {
			System.out.println(f);
		} else if (f < e) {
			System.out.println(e);
		}
		
		//Practice0415_8
		
		int g = 100;
		int h = 440;
		int i = 101;
		int max = g;
		
		if (max < h) {
			max = h;
		}
		
		if (max < i) {
			max = i;
		}
		System.out.println(max);
		
		
		//Practice0415_9
		
		int j = 155;
		int k = 43;
		if (j < k) {
			System.out.println("大きいほうの値は" + k + "です");
			System.out.println("小さいほうの値は" + j + "です");
		} else if (k < j) {
			System.out.println("大きいほうの値は" + j + "です");
			System.out.println("小さいほうの値は" + k + "です");
		} else if (j == k) {
			System.out.println("2つの値は同じです");
		}
		
		//Practice0415_10
		
		int num4 = 12;
		if (1 <= num4 && num4 <= 3) {
			System.out.println("冬");
		} else if (4 <= num4 && num4 <= 6) {
			System.out.println("春");
		} else if (7 <= num4 && num4 <= 9) {
			System.out.println("夏");
		} else if (10 <= num4 && num4 <= 12) {
			System.out.println("秋");
		}
		
		//Practice0415_11
		
		int num5 = 75;
		if (num5 % 15 == 0) {
			System.out.println("15の倍数です");
		}
			
		if (num5 % 5 == 0) {
			System.out.println("5の倍数です");
		}
		
		if (num5 % 3 == 0) {
			System.out.println("3の倍数です");
		}
		
		//Practice0415_12
		
		int num6 = 2021;
		if (num6 % 400 == 0) {
			System.out.println("閏年です");
		} else if(num6 % 100 == 0) {
			System.out.println("平年です");
		} else if(num6 % 4 == 0) {
			System.out.println("閏年です");
		} else {
			System.out.println("平年です");
		}
		
		//Practice0415_13
		
		int a2 = 100;
		int b2 = 200;
		System.out.println("aは" + a2 +"です");
		System.out.println("bは" + b2 +"です");
		
		int sub = a;
		a2 = b;
		b2 = sub;
		
		System.out.println("aは" + a2 +"です");
		System.out.println("bは" + b2 +"です");
		
		//Practice0415_14
		
		int a3 = 30;
		int b3 = 20;
		int c3 = 50;
		int max2 = a3;
		int min = a3;
		
		if (max2 < b3) {
			max2 = b3;
		} else if (max2 < c3) {
			max2 = c3;
		}
		
		if (min > b3) {
			min = b3;
		} else if (min > c3) {
			min = c3;
		}
		
		if (min < a3 && a3 < max2) {
			System.out.println(max2);
			System.out.println(a3);
			System.out.println(min);
		} else if (min < b3 && b3 < max2) {
			System.out.println(max2);
			System.out.println(b3);
			System.out.println(min);
		} else if (min < c3 && c3 < max2) {
			System.out.println(max2);
			System.out.println(c3);
			System.out.println(min);
		}
		
		
		
		//Practice0415_15
		
		double height = 1.7;
		double weight = 0;
		if (weight / (height * height) < 18.5) {
			System.out.println("痩せ");
		} else if (weight / (height * height) < 25) {
			System.out.println("普通");
		} else if (25 <= weight / (height * height)) {
			System.out.println("肥満");
		}
	}
}