/**
 * Agaby Azer
 * 10/4/16
 */
package pro2_LinkedList;

public class LinkList {
	private int size;
	private Node head;
	private int newWord;

	public LinkList() {
		size = 0;
		head = null;
		newWord=0;
	}
	public void newList()
	{
		Node temp= head;
		for(int i=0; i<size;i++)
		{
			if(i==newWord){
				System.out.print(temp.getValue()+"* ");
			}
			else{
				System.out.print(temp.getValue()+" ");
			}
			if(((i+1)%12)==0)
			{
				System.out.println();
			}
			temp=temp.getNext();
		}
		}
	public void addInOrder(String s) {
		Node newNode = new Node(s);
		size++;
		if (head == null) {
			head = newNode;
			newWord=0;
			// System.out.print(head.getValue()+"* ");

		} else if (newNode.getValue().compareToIgnoreCase(head.getValue()) < 0) {
			newNode.setNext(head);
			head = newNode;
			newWord=0;
			//System.out.print(head.getValue()+"* ");
		} else {
			Node curr = head;
			Node prev = null;
			newWord=0;
			while (newNode.getValue().compareToIgnoreCase(curr.getValue()) > 0) {
				newWord++;
				if (curr.getNext() == null) {
					curr.setNext(newNode);
					//System.out.print(newNode.getValue()+"* ");
					newNode.setNext(null);
					return;
				} else {
					prev = curr;
					curr = curr.getNext();
				}

			}
			prev.setNext(newNode);
			newNode.setNext(curr);
			
		}
	}


	public void erase(String word) {
		String s2 = new String(word);
		Node current = head;
		Node previous = null;
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else if (current.getValue().equals(word)) { // right here

			head = head.getNext();

		} else {
			while (current.getNext() != null) {
				previous = current;
				current = current.getNext();
				String s1 = new String(current.getValue());
				if (s1.equals(s2)) { // right here
					//System.out.println("oh my gosh");
					break;
				}
			}
			previous.setNext(current.getNext());
			current.setNext(null);
			size--;

		}
		
	}
	
	public void Dislplay() {
		// Node newNode = head;
		int counter = 0;

		Node itr = head;
		// System.out.print(itr.getValue() + " ");
		while (itr != null) {

			if (counter > 11) {
				// System.out.println("count= "+ counter);
				counter = 0;
				System.out.println();
			}

			System.out.print(itr.getValue() + " ");
			if (itr == null)
				return;
			itr = itr.getNext();
			counter++;
		}

	}

}
