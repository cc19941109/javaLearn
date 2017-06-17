package main.java.com.chen.genericUpUp;

import java.util.List;

class Fruit{}
class Apple extends Fruit{}
class Orange extends Fruit{}
class ShanXiApple extends Apple{}

public class SuperTypeWildcards {

	/**
	 * 只能用super 不能用extends
	 * List<? super Apple>   特定apple及其子类
	 * @param apples
	 */
	static void write(List<? super Apple> apples){
		apples.add(new Apple());
		//apples.add(new Orange());
		apples.add(new ShanXiApple());
		
		//apples.add(new Fruit());
	}
	
}
