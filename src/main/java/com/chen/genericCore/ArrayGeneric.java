package main.java.com.chen.genericCore;

import java.lang.reflect.Array;

public class ArrayGeneric {
	public static <T> T getMiddle(T... a){
		return a[a.length/2];
	}
	//
    /**
     * 根据数组类型的class创建对应类型的数组
     * @param <T> 目标类型
     * @param clazz
     * @param length 数组长度
     * @return
     */
	public static <T> T[] newArrayByArrayClass(Class<T[]> clazz, int length) {
        return (T[]) Array.newInstance(clazz.getComponentType(), length);
    }
     
    /**
     * 根据普通类型的class创建数组
     * @param <T> 目标类型
     * @param clazz
     * @param length 数组长度
     * @return
     */
    public static <T> T[] newArrayByClass(Class<T> clazz, int length) {
        return (T[]) Array.newInstance(clazz, length);
    }
	
	public static void main(String[] args) {
		System.out.println(getMiddle(1,2,24,14,2.1));
		//Type safety: A generic array of Number&Comparable<?> is created for a varargs parameter
		System.out.println(getMiddle("dafa","faf","afa212da"));
		System.out.println(getMiddle(1.2,123.212,1,new Object(),0,"12asda3","add","ccc"));
		System.out.println(getMiddle(new Object(),new ArrayGeneric(),2,1));
	}
}
