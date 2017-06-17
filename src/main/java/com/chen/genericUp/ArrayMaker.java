package main.java.com.chen.genericUp;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * TODO ？
 * 376
 * @author chencheng
 *
 * @param <T>
 */
public class ArrayMaker<T> {
	private Class<T> kind;
	public ArrayMaker(Class<T> kind){
		this.kind = kind;
	}
	@SuppressWarnings("unchecked")
	T[] create(int size){
		//Array.newInstance 实际上并未拥有kind 所蕴含的类型信息，因此不会产生具体的结果，必须转型
		return (T[])Array.newInstance(kind, size);
	}
	
	public static void main(String[] args) {
		ArrayMaker<String> stringMaker = new ArrayMaker<>(String.class);
		String[] stringArray  = stringMaker.create(9);
		System.out.println(Arrays.toString(stringArray));
		
	}
}
