package main.java.com.chen.genericUpUp;

import java.util.ArrayList;
import java.util.List;

public class N25ListOrArray {

	public static void main(String[] args) {
		Object[] objects = new Long[1];
		objects[0]  = "don't fit this";//编译时没有报错
		
		//List<Object> objects2 = new ArrayList<Long>();//编译报错
		//利用列表我们可以在编译时候发现错误
		
		//Cannot create a generic array of List<String>
		//不能创建泛型数组
		//List<String>[] sLists = new List<String>[1];
		
		
		
		
	}
	
}
