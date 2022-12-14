
public class DoublyLinkedList<Item> {
	Node<Item> head = null;
	Node<Item> tail = null;
	
	public void insertAfter(Item info) { //this is for inserting in the middle of a list
		Node<Item> p = new Node<Item>();
		Node<Item> t = head;
		p.data = info;
		if (head == null) {   //list empty
			head = tail = p;
			return;
		
		}else if (head == tail) {
			tail.next = p;
			tail = p;
			
		
		}else {
			p.next = t.next;
			p.prev = t;
			t.next = p;
			t.next.prev = p;
		}
		
	}
		
		
		public void insertFront(Item info) {
			Node<Item> p = new Node<Item>();
			p.data = info;
		
			p.next = head;
			p.prev = null;
			if (head == null) {
				head = tail= p;
				return;
			}
			
			head = p;
			
			
		}

		public void insertRear(Item info) {
			Node<Item> p = new Node<Item>();
			p.data = info;
			p.next = null;
			p.prev = tail;
			
			if (tail == null) {   //list is empty
				head = tail = p;
				return;
			}
			tail = p;
				
			
			
		}
		
		public void insertionSort(String info) {
			Node<Item> p = new Node<Item>();
			p.data = (Item)info;
			Node<Item> t = head;
			Node<Item> tprev = null;
			Node<Item> temp;
			
			if (head ==null) {
				head = tail = p;
				return;
			}
			
			while (t != null && info.compareTo((String)t.data) >=0){
				tprev = t;
				t = t.next;
			}
		
			if(tprev == null) {
				p.next = head;
				head.prev = p;
				head = p;
				return;
			}else if(t ==null) {
				p.prev = tprev;
				tprev.next = p;
				tail = p;
				return;
			}else
			p.next = tprev.next;
			p.prev = tprev;
			tprev.next = p;
			t.prev = p;

				
		}
		
		
		public void swapNodes() {     //method not completed, experimenting
			
			while (t!= null && t.data < t.prev.data) {   
				Node<Item> t = head;
				Node<Item> tprev = null;
				Node<Item> temp;
				
				temp = t.next;
				t.next = tprev;
				t.prev = tprev.prev;
				tprev.prev = t;
				tprev.next = temp;
				
				t = tprev;
				tprev = tprev.prev;
				
			}
			
		}
		
		
		public String printList() {
			String listString = "";
			Node<Item> t = head;
			while (t.next != null) {             // this loop looks through every node on the list until it gets to the last node and adds the data in that node to the sentence string 
				listString += ((String)t.data + " ");
				t = t.next;
			}
			Node<Item> p = tail;  // I create this reference variable p in order to make sure I'm including the very last node on the list. 
			listString += (String)p.data;  // append the last node on the list to the sentence String
			return listString;
			
		}
		
		
		public Item removeFront() {
			Node<Item> t = head;
			if (head == null)return null;
		
			head = t.next;
			if (head ==null)tail =null;
			head.prev = null;
			return t.data;
			
		}
		
		
		public Item removeRear() {  
			Node<Item> t = head;
			Node<Item> p = head;
			if (head.next == null) {
				head = null;
				tail = null;
				return t.data;
			}
			while (t.next.next != null) {
				t = t.next;
				p = t.next;
			}
			t.next = null;
			tail = t;
			return p.data;
			
		}
			
		
	
}
