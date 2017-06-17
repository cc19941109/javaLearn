package main.java.com.chen.generic;


/**
 * 堆栈的实现
 * 移除node类上的类型参数，证明内部类 可以访问其外部类的类型参数
 * @category 
 * @author chengchen2
 * @date Jun 15, 2017
 * @param
 * @param <T>
 */
public class LinkStack<T> {
	//将U 改成T就可以 ？
	private static class Node<U> {
		U item;
		Node<U> next;

		public Node() {
			item = null;
			next = null;
		}

		public Node(U item, Node<U> next) {
			this.item = item;
			this.next = next;
		}

		boolean end() {
			return item == null && next == null;
		}
	}

	private Node<T> top = new Node<>();

	public void push(T item) {
		top = new Node<>(item, top);
	}

	public T pop() {
		T result = top.item;
		if (!top.end()) {
			top = top.next;
		}
		return result;
	}

	public static void main(String[] args) {
		LinkStack<String> linkStack  = new LinkStack<>();
		linkStack.push("a");
		linkStack.push("b");
		linkStack.push("c");
		linkStack.push("d");		
		linkStack.push("e");
		String s;
		for(String string:"i am cc , i am 24 years old".split(" ")){
			linkStack.push(string);
		}
		while((s = linkStack.pop())!=null)
			System.out.println(s);
	}

}
