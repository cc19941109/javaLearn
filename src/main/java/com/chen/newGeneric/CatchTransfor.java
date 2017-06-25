package main.java.com.chen.newGeneric;

 class  Holder<T>{
	 private T value ;
	 public Holder(){}
	 public Holder(T val){
		 value = val;
	 }
	 public T get(){
		 return value;
	 }
	 public void set(T val) {
		value = val;
	}
	 public boolean equals(Object object){
		 return value.equals(object);
	 }
	 
 }

public class CatchTransfor {

	static <T> void f1(Holder<T> holder){
		T t = holder.get();
		System.out.println(t.getClass().getSimpleName());
	}
	
	static void f2(Holder<?> holder){
		f1(holder);
	}
	public static void main(String[] args) {
		Holder raw = new Holder<Integer>(1);
		f1(raw);//Type safety: The expression of type Holder needs unchecked conversion to conform to Holder<Object>
		f2(raw);//No warnings
		
		Holder rawBasic = new Holder();
		rawBasic.set(new Object());
		//Type safety: The method set(Object) belongs to the raw type Holder. 
		//References to generic type Holder<T> should be parameterized
		f2(rawBasic);//No warnings
		
		Holder<?> wildcarded = new Holder<Double>(1.0);
		f2(wildcarded);
		
		
		
	}
}
