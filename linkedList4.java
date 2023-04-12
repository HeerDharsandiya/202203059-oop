//Q-4)Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.

class linkedList4
{
    Node head;
    class Node{
        
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public void addLast(int data){
        
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
    public void lessThan(int n){
        
        Node prev=head;
        Node curr=head.next;
        while(curr.next!=null){
            if(prev.data>n && prev==head) head=head.next;
            else if(curr.data>n){
                
                    prev.next=curr.next;
                    curr=prev.next;
                    continue;
            }
            prev=prev.next;
            curr=curr.next;
        }
        if(curr.next==null && curr.data>25) prev.next=null;
        
    }

	public static void main(String[] args) {
		
		linkedList4 ll= new linkedList4();
		int i;
		for(i=1;i<51;i++) ll.addLast(i);
		System.out.println("The Linked List: ");
		ll.printList();
		System.out.println("\nAll numbers less than or equal to 25 are: ");
		ll.lessThan(25);
		ll.printList();
	}
}
