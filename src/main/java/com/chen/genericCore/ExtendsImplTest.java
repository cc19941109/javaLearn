package main.java.com.chen.genericCore;

import java.io.Serializable;
 
//数组的类型不可以是类型变量，除非是采用通配符的方式  http://blog.csdn.net/orzlzro/article/details/7017435
//错误的？？
public class ExtendsImplTest {
	public static <T extends Comparable<T>> T min(T[] a) {
		if(a==null||a.length==0){
			return null;
		}
		T smallest = a[0];
		for(int i = 0;i<a.length;i++){
			if(smallest.compareTo(a[i])>0){
				smallest = a[i];
				
			}
		}
		return smallest;
	}
	
	public static void main(String[] args) {
		Integer[] a = new Integer[]{1,12,31,2};
		Object[] a1 = new Object[5];

		//System.out.println(min(a));
		
	}
}
