package main.java.com.chen.genericCore;

import java.util.ArrayList;

public class StringTest {
	public static void main(String[] args) {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("124214");
		System.out.println(sBuilder.getClass());
		System.out.println(sBuilder.toString().getClass());
		ArrayList<String> strings = new ArrayList<>();
	}

}
