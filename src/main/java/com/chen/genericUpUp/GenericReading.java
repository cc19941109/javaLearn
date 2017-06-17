package main.java.com.chen.genericUpUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericReading {
	static <T> T readExart(List<T> list){
		return list.get(0);
	}
	
	static List<Apple> apples = Arrays.asList(new Apple());
	static List<Fruit> fruits = Arrays.asList(new Apple());
	/**
	 * 只能用extends 不能用super
	 * @author chencheng
	 *
	 * @param <T>
	 */
	static class cReader<T>{
		T readC(List<? extends T> list){
			return list.get(0);
		}
	}
	
	public static void main(String[] args) {
		Fruit fruitA = readExart(apples);
		cReader<Fruit> cReader = new cReader<>();
		Fruit aFruit  = cReader.readC(fruits);
		//Fruit bFruit  = cReader.readC(apples);
		
		cReader<Apple> cReader2 = new cReader<>();

		Apple apple1 = cReader2.readC(apples);
		Apple apple = new Apple();
		
		List<? super Integer> foo3 = new ArrayList<Number>();
		//List<Fruit> fruits = new ArrayList<Apple>();
		
	}
	
}
