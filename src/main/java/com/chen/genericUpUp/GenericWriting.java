package main.java.com.chen.genericUpUp;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {
	/**
	 * writeExart效果和writeWithWildcard 一样
	 * @param list
	 * @param item
	 */
	static <T> void writeExart(List<T> list , T item){
		list.add(item);
	}
	
	static <T> void writeWithWildcard(List<? super T> list, T item){
		list.add(item);
	}
	
	//不能用extends
//	static <T> void writeWithWildcard2(List<? extends T> list, T item){
//		list.add(item);
//	}
	
	static List<Apple> apples = new ArrayList<>();
	static List<Fruit> fruits  = new ArrayList<>();
	
	static void f1(){
		
	}
	
	public static void main(String[] args) {
		writeExart(apples,new Apple());
		writeExart(apples, new ShanXiApple());
		writeExart(fruits, new Orange());
		writeExart(fruits, new ShanXiApple());
		
		writeWithWildcard(apples,new Apple());
		//writeWithWildcard(apples,new Fruit());
		writeWithWildcard(apples,new ShanXiApple());
		writeWithWildcard(fruits,new ShanXiApple());
		writeWithWildcard(fruits,new Orange());

		
	}
	
}
