package main.java.com.chen.runTimeType;

public class InterfaceInfo {

	public static void getInterfaces(Class claz){
		
		for(Class sClass : claz.getInterfaces()){
			System.out.println(sClass.isInterface()+sClass.getSimpleName());
		}
		
	}
	public static void main(String[] args) {
		getInterfaces(Integer.class);
		
		getInterfaces(Integer.TYPE);//why no output????
		getInterfaces(int.class);//why no output????
		
	}
}
