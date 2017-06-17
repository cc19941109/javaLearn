package main.java.com.chen.generic;

import java.util.HashMap;
import java.util.Map;

public class GenericMethod {
	public static <K,V> Map<K,V> map(){
		return new HashMap<>();
	}
	
	public <T> void f(T x) {
		System.out.println(x.getClass().getName());
	}
	public static void main(String[] args) {
		GenericMethod method  = new GenericMethod();
		method.f(" ");
		method.f(12);
		method.f('c');
		method.f(method);
		method.f(map());
	}

}
