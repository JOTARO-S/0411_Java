package jp.Test;

import java.util.HashMap;
import java.util.Map;

public class Test0425_1 {
	public static void main(String[] args) {
	
		 Map<String, String> testmap  = new HashMap<>();
		testmap.put("yamada", "東京");
		testmap.put("suzuki", "埼玉");
		
		Map<Integer, Test1> testmap2 = new HashMap<>();
		testmap2.put(1, new Test1(1,"PC"));
	}
}

class Test1 {
	int num;
	String str;
	
	Test1(int num, String str) {
		this.num = num;
		this.str = str;
	}
}


