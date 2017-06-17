package main.java.com.chen.generic;

public class TestTuple {

	
	static TwoTuple<String, Integer> f(){
		return new TwoTuple<String, Integer>("hijack", 11);
		
	}
	
	public static void main(String[] args) {
		System.out.println(f());
	}
	
}
