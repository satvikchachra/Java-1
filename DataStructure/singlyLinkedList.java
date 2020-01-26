class singlyLinkedList{
	int size;
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
		}
	}

	void addFirst(int d){
		Node n = new Node(d);
		if(head == null){
			head = n;
		}
		else{
			n.next = head;
			head = n;
		}
		size++;
	}
	
	void addLast(int d){
		Node n = new Node(d);
		if(head == null){
			head = n;
		}
		else{
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = n;
		}
		size++;
	}

	void display(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args){
		singlyLinkedList lst = new singlyLinkedList();
		lst.addFirst(10);
		lst.addFirst(20);
		lst.display();
		lst.addLast(30);
		lst.addLast(40);
		lst.display();
	}
	
}