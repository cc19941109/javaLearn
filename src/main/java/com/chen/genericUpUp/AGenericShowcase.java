package main.java.com.chen.genericUpUp;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Father<T> {
}

// class child extends father<T>{}
class Child extends Father<String> {
}

class Base<T> {
}

class Derived extends Base<String> {
}

public class AGenericShowcase {
	public static class AGenericClass<T> {
		List<String> getListOfPropertyName() {
			return new ArrayList<String>();
		}
	}

	  static Type getSuperclassTypeParameter(Class<?> subclass) {
		    Type superclass = subclass.getGenericSuperclass();
		    if (superclass instanceof Class) {
		      throw new RuntimeException("Missing type parameter.");
		    }
		    ParameterizedType parameterized = (ParameterizedType) superclass;
		    return (parameterized.getActualTypeArguments()[0]);
		  }
	
	public static void main(String[] args) {
		// AGenericClass raw = new AGenericClass<>();
		// List<String> list = raw.getListOfPropertyName(); // Warning:
		// Unchecked assignment from List to List<String>
		Child child = new Child();
		System.out.println(child.getClass().getGenericSuperclass());

		Type t = new Base<Map<String, List<String>>>() {
		}.getClass().getGenericSuperclass();
		Type targ = ((ParameterizedType) t).getActualTypeArguments()[0];

		System.out.println(targ);
		System.out.println(t);

		System.out.println(Child.class.getSuperclass());
		System.out.println(Child.class.getClassLoader());
		
		
		System.out.println(getSuperclassTypeParameter(ArrayList.class));
	}
}
