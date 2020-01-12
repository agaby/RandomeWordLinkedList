package pro2_LinkedList;

public class Node {
	private String word;
	private Node next;

	public Node(String x) {
		word = x;
		next = null;
//		System.out.println("-------------------------");
//		System.out.println("new node created with string " + x);
//		System.out.println("and its next set to: " + next);
//		System.out.println("-------------------------");
	}

	public void Display() {
		System.out.println("value" + word);
	}

	public String getValue() {
		return word;
	}

	public void setValue(String value) {
		this.word = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
