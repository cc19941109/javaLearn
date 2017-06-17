package main.java.com.chen.collection;


public class TestiInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a =- 1 ;
		Integer b = -1 ;
		int c = -1;
		Integer  d = new Integer(-1);
		//2147483648  2的31次方
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println();
		System.out.println(d.hashCode());

		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		
		System.out.println(b==c);
		System.out.println(b==d);//integer比较地址
		System.out.println(c==d);//int比较数值 

		b = 1;
		System.out.println(a==b);
		
		System.out.println();
	}

}
