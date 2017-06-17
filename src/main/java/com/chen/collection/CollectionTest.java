package main.java.com.chen.collection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class CollectionTest {
	public static void main(String[] args) {
		LinkedList<String> linkedList  = new LinkedList<>();
		HashMap<Long, String> sMap = new HashMap<>();

		sMap.put(1l, "first");
		sMap.put(2l, "second");
		sMap.put(3l, "third");
		sMap.put(4l, "fourth");

		Iterator<Entry<Long, String>> iterator  = sMap.entrySet().iterator();
		while(iterator.hasNext()){

			Entry<Long, String> e1  = iterator.next();
			System.out.println(e1.getKey()+e1.getValue());
			iterator.next();
			
		}
		
		Hashtable<Long, String> hashtable  = new Hashtable<>();
		//List<String> alList  = new List<String>();
		
		
	}

}
