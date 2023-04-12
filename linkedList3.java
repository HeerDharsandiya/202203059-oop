//Q-3)Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

class linkedList3
{
    static Node head;
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
    
    public static int nodeIndex(int n){
        
        Node curr=head;
        int count=0;
        while(curr!=null){
            if(curr.data==7) return count;
            curr=curr.next;
            count++;
        }
        return -1;
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
		
		linkedList3 ll= new linkedList3();
		ll.addLast(1);
		ll.addLast(5);
		ll.addLast(7);
		ll.addLast(3);
		ll.addLast(8);
		ll.addLast(2);
		ll.addLast(3);
		System.out.println("The Linked List: ");
		ll.printList();
		System.out.println("\nThe index of the given element = "+ nodeIndex(7));
	}
}
