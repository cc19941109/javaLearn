package main.java.com.chen.collection;

class Animal{
	public int age = 1;
	public void speak(){
		System.out.println("i am animal. i am speaking");
	}
	public void run(){
		System.out.println("i am animal , i am running");
	}
	public static void eat(){
		System.out.println("animal eat");
	}
}

class Cat extends Animal{
	public int age = 2;
	public void speak(){
		System.out.println("miao miao miao ~~");
	}
	public static void eat(){
		System.out.println("cat eat");
	}
}

class WhiteCat extends Cat{
	public int age = 3;
	public void speak(){
		System.out.println("miao~ miao~");
	}
}

public class Polymorphic {
	/**
	 * 这样就不用给每个animal编写方法了
	 * 只要用这样的一个方法，就可以调用继承这个animal的类的所有重写的方法
	 */
	public static void testAnimal(Animal animal){
		animal.speak();
	}
	
	public static void main(String[] args) {
		Animal cat = new Cat();
		testAnimal(cat);
		cat.eat();
		System.out.println(cat.age);
		Animal whiteCat = new WhiteCat();
		testAnimal(whiteCat);
		System.out.println(whiteCat.age);
		
	}
}
