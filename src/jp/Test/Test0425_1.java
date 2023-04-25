package jp.Test;

import java.util.HashMap;
import java.util.Map;

public class Test0425_1 {
	
	private Map<String, String> testmap  = new HashMap<>();
	testmap.put("yamada", "東京");
	testmap.put("suzuki", "埼玉");
	
	private Map<Integer, Test1> testmap2 = new HashMap<>();
	testmap2.put(1, new Test1(1,"PC"));
}


