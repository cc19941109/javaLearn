package main.java.com.chen.genericCore;

import java.util.ArrayList;
import java.util.List;

class bao<T>{
	private  T single;
	
	
	
}

public class TEST {
	public static void main(String[] args) {
		
		List<?>[] lsa = new List<?>[10]; // OK, array of unbounded wildcard type.
		Object o = lsa;
		Object[] oa = (Object[]) o;
		List<Integer> li = new ArrayList<Integer>();
		li.add(new Integer(3));
		oa[1] = li; // Correct.
		String s = (String) lsa[1].get(0); // Run time error, but cast is explicit.
		
		
	}
}
