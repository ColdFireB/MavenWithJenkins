package one;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MyCollections {

	public static void main(String[] args) {

		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "one plus");
		hm.put(2, "Android");
		hm.put(3, "Android");
		hm.put(3, "Samsung");
		hm.put(4, "Nokia");
		
		System.out.println(hm.get(3));
		
		System.out.println("HashMap colection values     " +hm);
		
		Iterator iter = hm.entrySet().iterator();
		
		while(iter.hasNext())
		{
			Map.Entry mapEntry = (Map.Entry)iter.next();
			System.out.println("The Key is:" + mapEntry.getKey() + "value is:   " + mapEntry.getValue());
		}
		
		System.out.println();
		
		for(Entry<Integer, String> entry: hm.entrySet()) {
			System.out.println("Key:  " + entry.getKey() + "Value:   " + entry.getValue());
		}
		
		System.out.println();

		for(Object key: hm.entrySet()) {
			System.out.println("Key: " + key.toString() + "Value:  " + hm.get(key));
		}
		
		System.out.println();
	}

}
