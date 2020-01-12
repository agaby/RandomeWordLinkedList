package pro2_LinkedList;

public class LinkList {
	private int size; // what is this?
	private Node head;
	private int newWord;
	// private Node word;

	public LinkList() {
		size = 0;
		head = null;
		newWord=0;
	}

	public void newList()
	{
		Node temp= head;
		System.out.println("List: ");
		for(int i=0; i<size;i++)
		{
			if(i==newWord){
				System.out.println(temp.getValue()+"* ");
			}
			else{
				System.out.println(temp.getValue()+" ");
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

	public void erase(String word)
	{
		Node current = head;
		Node previous = current;
		Node temp=new Node(word);
		boolean found=false;
		if (head == null) {
			return;
		} 	
		else if (current.getValue().equalsIgnoreCase(word))
		{
			found=true;
			head=current.getNext();
			size--;
		}
		else{
			while(!current.getValue().equalsIgnoreCase(word))
			{
				previous=current;
				current= current.getNext();
			}
			if(current.getValue().equalsIgnoreCase(word))
			{
				found=true;
				previous.setNext(current.getNext());
				size--;
			}
		}
		return;
	}
	
	public void delete(String word) {
		Node current = head;
		Node previous = null;
		Node temp=new Node(word);
		if (head == null) {
			System.out.println("List is empty");
		} else if (head.getValue().equalsIgnoreCase(word))
		// first word
		{
			head = head.getNext();
				}
		else if (current != null) {
			previous = current;
			current = current.getNext();

			while ((current.getValue().compareToIgnoreCase(word) > 0)) {
				// previous=current;
				previous = current.getNext();
				current.setNext(null);
			}
			if ( current.getValue().compareToIgnoreCase(word) == 0) {
				previous.setNext(current.getNext());
				current.setNext(null);
			}
		}
		else if(current==null&& current.getValue().equalsIgnoreCase(word))
		{
			current.setNext(null);
		}
		else {
			// if (current == null) {
			System.out.println("Can not delete");
		}

		//return current;

	}

	public void Dislplay() {
		// Node newNode = head;
		int counter = 0;
		
		Node itr = head;
		//System.out.print(itr.getValue() + " ");
		while (itr != null) {
			
			counter++;			
			if (counter > 12) {
				//System.out.println("count= "+ counter);
				counter = 0;
				System.out.println();
			}
			
			System.out.print(itr.getValue() + " ");
			if (itr == null)
				return;
			itr = itr.getNext();
		}
		
	}

}
