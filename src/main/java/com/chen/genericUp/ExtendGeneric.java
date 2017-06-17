package main.java.com.chen.genericUp;

/**
 * 376 
 * @author chencheng
 *
 */


public class ExtendGeneric {
	public static void main(String[] args) {
		Derived2 d2 = new Derived2();
		Object object = d2.get();
		//Type safety: The method set(Object) belongs to the raw type Base. 
		//References to generic type Base<T> should be parameterized
		d2.set(object);
	}
}

class Base<T> {
	private T element;

	public void set(T args) {
		args = element;
	}

	public T get() {
		return element;
	}
}

class Derived1<T> extends Base<T> {

}

class Derived2 extends Base {

}
// 将会报错 
//The type Derived3 cannot extend or implement Base<?>. A supertype may not specify any wildcard
//class Derived3 extends Base<?>{}