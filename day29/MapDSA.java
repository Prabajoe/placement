package day29;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDSA {

	public static void main(String[] args) {
		
		
		HashMap<String ,Object> hm=new HashMap<>();
		
		LinkedHashMap<String, Object>  lh=new LinkedHashMap<>();
		
		
		lh.put("name", "fizu");
		lh.put("age", 21);
		lh.put("area", "nelithoppu");
		lh.put("course", "Medical");
		
		
		System.out.println(lh);
		
		
		
		hm.put("name","praba");
		hm.put("age",null);
		hm.put("Trainer","java");
		hm.put("Blood Group",'B');
		hm.put("city1","Pondy");
		hm.put("city2","Mahe");
		
		System.out.println(hm.putIfAbsent("age", 25));
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.containsKey("name"));
		System.out.println(hm.containsValue("Mae"));
		System.out.println(hm.entrySet());
		System.out.println(hm.get("age"));
		
		
		System.out.println(hm);


		
	}

}
