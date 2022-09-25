package one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class MyCollection1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "first");
		hm.put(2, "second");
		hm.put(3, "third");
		
		
		System.out.println(hm);
		
		Iterator it = hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry mapset = (Map.Entry)it.next();
			System.out.println(mapset.getKey() +"   -   "+ mapset.getValue());
		}
		
		
		for(Entry<Integer, String> en: hm.entrySet()) {
			en.getKey();
			en.getValue();
		}
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(10, "Ten");
		hs.put(11, "Eleven");
		hs.put(12, "Tweleve");
		
		
		Iterator itr = hs.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry mp = (Map.Entry)itr.next();
			mp.getKey();
			mp.getValue();
		}
		
		for(Entry<Integer, String> e: hs.entrySet()) {
			e.getKey();
			e.getValue();
		}
		
		//----------------------------ArrayList----------------
		
		ArrayList<String> ar = new ArrayList();
		ar.add("one");
		ar.add("Two");
		ar.add("Three");
		
		
		System.out.println(ar);
		
		
		Iterator its = ar.iterator();
		
		while(its.hasNext()) {
			System.out.print(its.next());
		}
		
		ar.remove(2);
		ar.get(1);
		ar.add(0, "Previous one");
		
		System.out.println("Final ArrayList:    " + ar);
		
		
		
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit Sharma");  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itrs=queue.iterator();  
		while(itrs.hasNext()){  
		System.out.println(itrs.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  				
	}

}
