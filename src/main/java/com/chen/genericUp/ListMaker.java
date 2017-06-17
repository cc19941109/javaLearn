package main.java.com.chen.genericUp;

import java.util.ArrayList;
import java.util.List;

public class ListMaker<T> {
	List<T> create(){
		//在运行时下面的 ArrayList<T>()中的T 被移除
		return new ArrayList<T>();
	}
	
	List<T> create(T t,int n ){
		List<T> result =  new ArrayList<>();
		for(int i = 0;i<n;i++){
			result.add(t);
		}
		return result;
	}
	
	public static void main(String[] args) {
		ListMaker<String> listMaker=  new ListMaker<>();
		List<String> stringList = listMaker.create();
		
		List<String> list = listMaker.create("ni hao", 5);
		System.out.println(list);
	}
}
