package linked_list;

public class Runner {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(10);
		ll.insert(20);
		ll.insert(21);
		ll.insert(41);
		ll.insertAtIndex(90,1);
		ll.getAllElements();
//		ll.deleteElementAtIndex(2);
//		ll.getAllElements();

	}

}
