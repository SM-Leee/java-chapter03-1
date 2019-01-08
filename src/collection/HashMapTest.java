package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> m = 
			new HashMap<String, Integer>();
		
		m.put("one", 1); //auto boxing
		m.put("two", 2);
		m.put("three", 3);
		
		int i = m.get("two"); //auto unboxing
		System.out.println(i);
		
		m.put("three", 33333);
		System.out.println(m.get("three"));
		
		//순회
		Set<String> keys = m.keySet();
		for(String key : keys) {
			int value = m.get(key);
			System.out.println(value);
		}
		
	}

}
