class Node{
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
    }
}

public class ReverseLinkedList {

    public static Node reverse(Node head){

        Node prev=null;
        Node curr=head;

        while(curr!=null){

            Node next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }

        return prev;
    }
}