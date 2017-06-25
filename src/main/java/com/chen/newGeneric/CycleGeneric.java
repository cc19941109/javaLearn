package main.java.com.chen.newGeneric;

/**
 * 404
 * CRG 古怪的循环泛型
 * @author chencheng
 *
 */

class BasicHolder<T> {
	T element;
	void set(T t){
		element = t;
	}
	T get(){
		return element;
	}
	void f(){
		System.out.println(element.getClass().getSimpleName());
	}
}

/**
 * 基类用导出类代替其参数
 * @author chencheng
 *
 */
class Subtype extends BasicHolder<Subtype>{
	
}

public class CycleGeneric {
	public static void main(String[] args) {
		Subtype st1 = new Subtype(),
				st2 = new Subtype();
		st1.set(st2);
		Subtype st3 = st1.get();
		st1.f();
		
	}
}
