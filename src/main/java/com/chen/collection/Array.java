package main.java.com.chen.collection;

public class Array {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3 };
		Integer size =0;
		System.out.println(a.equals(b));
		System.out.println(a == b);

		int[] c = {};
		int[] d = c;
		System.out.println(c.equals(d));
		System.out.println(c == d);
		int e []=new int[size];
//		e[0]=1;
//		
//		int[] f  = new int[2];
		
//		System.out.println(e==f);
		
	}
}
