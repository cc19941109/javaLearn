package main.java.com.chen.generic;

public class BasicGeneratorDemo {
	public static void main(String[] args) {
//		Generator<CountObject> generator  = 
//				BasicGenerator.CreatedBy(CountObject.class);
		Generator<CountObject> generator  = new BasicGenerator<>(CountObject.class);
		
		for(int i = 0;i<5;i++){
			System.out.println(generator.next());
		}
	}
}
