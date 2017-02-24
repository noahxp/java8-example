package java8.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LamdbaExample {
	
	public static void main(String... args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(10);
		list.add(100);
		Map<String, Object> map = new HashMap();
		map.put("a", 1);
		map.put("b", "b");
		
		
		// lamdba 表示式 input->body
		list.forEach(s -> System.out.println(s));
		
		list.stream().filter(s -> Integer.valueOf(s) <= 10).forEach(s -> System.out.println(s));
		
		System.out.println(list.stream().mapToInt(s->Integer.valueOf(s)).sum());

		
		// lamdba 表示式
		map.forEach((k,v) -> System.out.println(k + "=" + v));
	}
}
