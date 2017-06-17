package main.java.com.chen.generic;


import java.util.ArrayList;
import java.util.List;

public class VarGeneric {

	public static <T> List<T> MakeList(T... args){
		List<T> result  = new ArrayList<>();
		for(T item:args){
			result.add(item);
		}
		return result;
	}
	public static <T> List<T> MakeList(){
		List<T> result  = new ArrayList<>();
		return result;
	}
	
	public static void main(String[] args) {
		List<String> lStrings = MakeList("A");
		System.out.println(lStrings);
		lStrings = MakeList("A","B","C");
		System.out.println(lStrings);
		lStrings= MakeList("QWERTYUIOPASDFGHJKLZXCVBNM".split(""));
		System.out.println(lStrings);
	}
}
