package linked_list;

public class LinkedList {
	//insert(int data)     or insertAtEnd(int data)
	//insertAtBeginning(int data)
	//insertAtIndex(int data, int index)
	//getAllElements()
	//getElementAtIndex(int index)
	//deleteElementAtIndex(int index)
	
	// Wherever index are involved we will use for loop, else while loop
	
	Node refHead = null;

	public void insert(int data) {// To insert at the end by default
		Node refNew = new Node();
		refNew.data = data;
		refNew.refNext = null;

		if(refHead!=null) {
			Node refIter = refHead;
			while(refIter.refNext!=null) {
				refIter = refIter.refNext;
			}
			refIter.refNext = refNew;
		}
		else {
			refHead=refNew; // To insert first element because list is empty in this case
		}
	}

	// Insert can happen at:
	// 1) First Element
	// 2) Middle Element
	// 3) Last Element
	public void insertAtIndex(int data, int index) {
		Node refNew = new Node();
		refNew.data = data;
		refNew.refNext = null;
		
		
		Node refIter = refHead;

		if(index==0) { // Insertion as First Element
			refHead=refNew;
			refNew.refNext = refIter;
			return;
		}
		
		if(refHead!=null) { // Insertion in Middle or as Last element
			for(int i=0; i<index-1; i++) { //Because at index-2, retIter will point to node at index-1, hence we will go till index-1 only in loop 
				if(refIter.refNext == null) {
					throw new RuntimeException("Index provided is more than the size of linked list");
				}
				refIter = refIter.refNext;
			}
			refNew.refNext = refIter.refNext;
			refIter.refNext = refNew;			
		}
		else {
			throw new RuntimeException("Linked List is Empty. Insert some elements to begin with");
		}
	}

	public void getElementAtIndex(int index) {
		if(refHead!=null) {
			Node refIter = refHead;
			for(int i=0; i<index; i++) {
				if(refIter.refNext == null) {
					throw new RuntimeException("Index provided is more than the size of linked list");
				}
				refIter = refIter.refNext;
			}
			System.out.println("Element at index " + index + " = " + refIter.data);		
		}
		else {
			throw new RuntimeException("Linked List is Empty. Insert some elements to begin with");
		}
	}

	public void getAllElements() {
		if(refHead!=null) {
			Node refIter = refHead;
			while(refIter.refNext!=null) {
				System.out.println(refIter.data);
				refIter = refIter.refNext;
			}
			System.out.println(refIter.data);
		}

		else {
			throw new RuntimeException("Linked List is Empty. Insert some elements to begin with");
		}
	}

	// Deletion can happen at:
	// 1) First Element
	// 2) Middle Element
	// 3) Last Element
	public void deleteElementAtIndex(int index) {
		if(refHead!=null) {
			Node refIter = refHead;
			int itemDeleted = 0;
			
			if(index==0) { // Deletion of First Element
				refHead= refHead.refNext;
				refIter.refNext=null;
				System.out.println("Element DELETED at index " + index + " = " + refIter.data);
				return;
			}
			
			for(int i=0; i<index; i++) { // Deletion of Middle and Last Element
				if(refIter.refNext == null) {
					throw new RuntimeException("Index provided is more than the size of linked list");

				}
				if(i==index-1) {
					Node refTemp = refIter.refNext;					
					refIter.refNext = refTemp.refNext;
					itemDeleted = refTemp.data;
					refTemp.refNext=null;					
				}
				else {
					refIter = refIter.refNext;
				}
			}
			System.out.println("Element DELETED at index " + index + " = " + itemDeleted);		
		}
		else {
			throw new RuntimeException("Linked List is Empty. Insert some elements to begin with");
		}
	}

}
