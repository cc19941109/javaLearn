package main.java.com.chen.genericUpUp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 无界通配符
 * 
List<?> list 可以赋值任何类型，但是不能添加具体的类型
List<Object> list 只能赋值List<Object>，但是可以添加任何类型
List<?extends Object> list 与 List<?> list没区别

 * @author chencheng
 *
 */
public class UnboundedWildcard {
	static Map map1;
	static Map<?, ?> map2;
	static Map<String, ?> map3;
	static void assign1(Map map){
		map1  = map;
	}
	static void assign2(Map<?,?> map){
		map2  = map;
	}	
	static void assign3(Map<String,?> map){
		map3  = map;
	}
	public static void main(String[] args) {
		assign1(new HashMap());
		assign2(new HashMap());
		assign3(new HashMap());
		
		System.out.println(String[].class);
		System.out.println(int.class);
		
	}
	
	
}
