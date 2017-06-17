package main.java.com.chen.genericUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Frob{}
class Fnorkle{}
class Quark<Q>{}
class Particle<POSITION,MOMENTUM>{}

/**
 * 在泛型代码的内部，无法获得任何有关泛型参数类型的信息
 * 擦除Erasure，即当你使用List<Integer>或者List<String>时，在运行时事实上是同时类型
 * 这两种类型都被擦除成他们的原生类型，即List
 * @category 
 * @author chengchen2
 * @date Jun 15, 2017
 * @param
 */
public class LostInfomation {
	public static void main(String[] args) {
		
	
		List<Frob> list = new ArrayList<>();
		Map<Frob, Fnorkle> map = new HashMap<>();
		//	Quark<Fnorkle> quark = new Quark();
		Quark<Fnorkle> quark = new Quark<Fnorkle>();
		Particle<Long,Double> particle = new Particle<Long,Double>();
		System.out.println(Arrays.toString(
				map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(
				list.getClass().getTypeParameters()));
		
		System.out.println(Arrays.toString(
				quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(
				particle.getClass().getTypeParameters()));
	}
	
}
