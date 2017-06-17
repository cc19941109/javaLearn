package main.java.com.chen.genericUpUp;

import java.util.ArrayList;
import java.util.List;

/**
 * java有泛型这一个概念，是为了初衷是为了保证在运行时出现的错误能提早放到编译时检查。
 * 即使容器里装的东西有继承关系，但是容器之间并没有继承关系
 * @author chencheng
 *
 */
public class AaaaaWeCannotDo {
	public static void main(String[] args) {
		
		//List<Fruit> fruits = new ArrayList<Apple>();
		/**
		 * 于是有了一个上界通配符
		 */
		List<? extends Fruit> fruits = new ArrayList<Apple>();
		List<? extends Fruit> fruits2 = new ArrayList<Orange>();
		/**
		 * 但是上界通配符有一个问题，只能往外面取，而不能往里面存
		 * 也就是说什么东西也放不进去
		 * The method set(int, capture#1-of ? extends Fruit) in the type 
		 * List<capture#1-of ? extends Fruit> is not applicable for the arguments (int, Apple)
		 * 
		 * 这是为什么呢
		 * 我们在存放元素的时候，实际上只能存放其中一种子类型，
		 * 因为其会在编译期间生成桥接方法<Bridge Methods>，该方法中会出现强制转换，若出现多种子类型，则会强制转换失败
		 * 为了安全，Java只能将其设计成不能添加元素。
		 * 虽然List<? extends E>不能添加元素，但是由于其中的元素都有一个共性--有共同的父类，
		 * 因此我们在获取元素时可以将他们统一强制转换为E类型，我们称之为get原则。
		 * 
		 */
		//fruits.set(1, new Apple());
		//fruits.add(new Apple());
		fruits.isEmpty();
		fruits.size();
		
		/**
		 * super 下界通配符
		 * 对于List<? super E>其list中存放的都是E的父类型元素（包括E），
		 * 我们在向其添加元素时，只能向其添加E的子类型元素（包括E类型），这样在编译期间将其强制转换为E类型时是类型安全的，
		 * 但是，由于该集合中的元素都是E的父类型（包括E），其中的元素类型众多，
		 * 在获取元素时我们无法判断是哪一种类型，故设计成不能获取元素，我们称之为put原则。
		 */
		List<? super Fruit> superFurits = new ArrayList<Fruit>();
		List<? super Fruit> superFurits2 = new ArrayList<Object>();
		superFurits.add(new Apple());
		//Fruit newf = superFurits.get(0);//Type mismatch: cannot convert from capture#4-of ? super Fruit to Fruit
		Object newf1 = superFurits.get(0);//true
		//superFurits.add(new Object());
		
		//PECS 原则
		
		//为了安全，所有泛型相关的异常都应该在编译时候被发现
	}
}


//	List<? extends Apple> apples = new ArrayList<Apple>();
//		List<? extends Apple> apples2 = new ArrayList<Apple>();
//		List<? extends Apple> apples3 = new ArrayList<Apple>();

		