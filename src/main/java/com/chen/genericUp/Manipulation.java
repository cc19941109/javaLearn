package main.java.com.chen.genericUp;

/**
 * 普通的类型变量在未指定边界额情况下，将被擦除为object
 * 擦出的核心动机就是使得泛化的对象可以用非泛化的类库来使用 ————迁移兼容性
 * 擦除是一种折中的，或者说迫不得已的决定——原因是要1.5之前的类库能够兼容运行
 * 但代价也是巨大的，泛型不能用于显式地引用运行时的类型操作———— 转型、instanceof、new————因为所有的类型信息全都丢失了
 * 泛型只是看起来拥有有关参数的类型信息
 * @author chencheng
 *
 */
 class HasF {
	public void f() {
		System.out.println("HasF.f() 。。。。start。。");
	}
}
 
//要使用<T extends HasF>，而不是 <T>，不然会报错
class Manipulator<T extends HasF> {
	private T obj;

	public Manipulator(T t) {
		obj = t;
	}
	public void manipulate(){
		obj.f();//The method f() is undefined for the type T
	}
}

public class Manipulation{
	public static void main(String[] args) {
		HasF hasF = new HasF();
		Manipulator<HasF> manipulator = new Manipulator<HasF>(hasF);
		manipulator.manipulate();
		
	}
}
