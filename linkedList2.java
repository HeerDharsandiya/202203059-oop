/*Q-2) Write a program to implement linked list in Java/Python.
Note: Create three classes:
Node: to define a node of the Linked List,
LinkedList: It uses Node class to create a Linked List using various methods (addNode, deleteNode,
Display,...),
MainClass: it creates the linked list using LinkedList class methods.*/

class linkedList2{
    
    Node head;
    
    class Node{
    
        String data;
        Node next;
        
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    
    public void addFirst(String data){
        
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    
    public void addLast(String data){
        
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    
    public void removeFirst(){
        
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        head=head.next;
    }
    
    public void removeLast(){
        
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node prev=head;
        Node curr=head.next;
        while(curr.next!=null){
            prev=prev.next;
            curr=curr.next;
        }
        prev.next=null;
    }
    public void addMiddle(String data,int n){
        
        Node curr=head;
        Node newNode=new Node(data);
        int i=1;
        if(n==1) addFirst(data);
        while(i<n-1){
            curr=curr.next;
            i++;
        }
        newNode.next=curr.next;
        curr.next=newNode;
    }
    
    public void removeMiddle(int n){
        
        int i=1;
        Node prev=head;
        Node curr=head.next;
        while(i<n-1){
            curr=curr.next;
            prev=prev.next;
            i++;
        }
        prev.next=curr.next;
        
    }
    
    public void printList(){
        
        Node curr=head;
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }

	public static void main(String[] args) {
	    
		linkedList2 ll = new linkedList2();
		ll.addFirst("an");
		ll.addFirst("is");
		System.out.println("The linked list: ");
		ll.printList();
		System.out.println("\nA node added in the beginning: ");
		ll.addFirst("This");
		ll.printList();
		System.out.println("\nA node added at the end: ");
		ll.addLast("apple");
		ll.printList();
		System.out.println("\nA node removed from the beginning: ");
		ll.removeFirst();
		ll.printList();
		System.out.println("\nA node removed from the end: ");
		ll.removeLast();
		ll.printList();
		ll.addFirst("This");
		ll.addLast("apple");
		System.out.println("\nThe linked list: ");
		ll.printList();
		System.out.println("\nA word inserted in the between: ");
		ll.addMiddle("ordinary",4);
		ll.printList();
		System.out.println("\nA word removed from between: ");
		ll.removeMiddle(4);
		ll.printList();
		
	}
}
