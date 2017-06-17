package main.java.com.chen.generic;


public class BasicGenerator<T> implements Generator<T> {

	private Class<T> type;
	public BasicGenerator(Class<T> type) {
		this.type = type;
	}
	
	@Override
	public T next() {
		try{
			return  type.newInstance();
		}catch(Exception exception){
			throw new RuntimeException(exception);
		}
		
	}
	
	public static <T> Generator<T> CreatedBy(Class<T> type){
		return new BasicGenerator<>(type);
	}
	
}
