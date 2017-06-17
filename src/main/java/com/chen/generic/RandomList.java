package main.java.com.chen.generic;


import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
	
	private ArrayList<T> storage = new ArrayList<>();
	private Random random = new Random(47);
	public void add(T item){
		storage.add(item);
	}
	
	public T select(){
		return storage.get(random.nextInt(storage.size()));
	}
	
	public static void main(String[] args) {
		RandomList<String> rs = new RandomList<>();
		for(String s : "hello everyone , good morning !".split(" ")){
			rs.add(s);
		}
		System.out.println("hello everyone , good morning !".split(" ").length);
		for(int i = 0;i<=20;i++){
			System.err.println(rs.select());
		}
	}
	
}
