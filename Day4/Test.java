class Test{
	public static void main(String[] args){

		LinkedList ll=new LinkedList(10);
		
		ll.add(15);
		ll.add(25);
		ll.add(30);
		ll.add(35);
		
		ll.show();
		
		ll.add(100,ll.head,6);
		System.out.println();
		ll.show();
		
		ll.reverse();
		System.out.println();
		ll.show();
		
		ll.head=ll.rev(ll.head);
		System.out.println();
		ll.show();
		
	}
}

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}

class LinkedList{
	Node head;
	LinkedList(int data){
		Node head=new Node(data);
		this.head=head;
	}
	
	void add(int data){
		Node node=new Node(data);
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=node;
	}
	
	void show(){
		Node temp=head;
		
		while(temp.next!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print(temp.data+"->");
	}
	
	void add(int data, Node head, int index){
		if(head==null)		return;
		if(index==0){
			Node node=new Node(data);
			node.next=head;
			this.head=node;
			return;
		}
		
		if(index<=1){
			Node node=new Node(data);
			node.next=head.next;
			head.next=node;
			return;
		}
		
		add(data, head.next, --index);
	}
	
	void reverse(){
		Node prev=null;
		Node curr=head;
		Node next=null;
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	
	Node rev(Node head){
		
		if(head.next==null){
			return head;
		}
		
		Node temp=rev(head.next);
		
		head.next.next=head;
		head.next=null;
		return temp;
		
	}
	
}

/*
if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head=null;
        ListNode temp=null;
        if(l1.val<l2.val){
            head=l1;
            temp=head;
            l1=l1.next;
        }else{
            head=l2;
            temp=head;
            l2=l2.next;
        }
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next=l1;
                l1=l1.next;
                temp=temp.next;
            }else{
                temp.next=l2;
                l2=l2.next;
                temp=temp.next;
            }
        }
        if(l1==null){
            temp.next=l2;
        }
        if(l2==null){
            temp.next=l1;
        }
        return head;
*/