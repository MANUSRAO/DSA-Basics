import java.util.*;
class Node{
    int value;
    Node next;
    Node(int v){
        this.value = v;
        next = null;
    }
}
public class MyLinkedList{

    static Node insertHead(Node head, Node now){
        if(head==null){
            head = now;
            return head;
        }
        now.next = head;
        return now;
    }

    static Node insertEnd(Node head,Node now){
        Node temp = head;
        while(temp.next!=null)
            temp = temp.next;
        temp.next = now;
        return head;
    }

    static void insertHere(Node here, Node now){
        now.next = here.next;
        here.next = now;
    }

    static int length(Node head){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    static int RLength(Node head,int count){
        if(head==null)  
            return count;
        return RLength(head.next,count+1);
    }

    static boolean search(Node head,int value){
        Node temp = head;
        while(temp!=null){
            if(temp.value==value)
                return true;
            temp = temp.next;
        }
        return false;
    }

    static boolean RSearch(Node head,int value){
        if(head!=null){
            if(head.value==value)
                return true;
            else 
                return RSearch(head.next,value);
        }
        return false;
    }

    static Node deleteHead(Node head){
        head = head.next;
        return head;
    }

    static void deleteEnd(Node head){
        Node temp = head;
        Node prev = null;
        while(temp.next!=null){
            prev = temp;
            prev = prev.next;
        }
        prev.next = null;
    }

    static Node deleteN(Node head, int pos){
        Node temp;
        Node prev = head;
        if(pos==1){
            head = head.next;
            return head;
        }
        int flag = 0;
        for(int i=0;i<pos-1;i++){
            if(prev.next!=null){
                prev = prev.next;
            }
            else{
                flag = 1;
                break;
            }
        }
        if(flag==1)
            return null;
        temp = prev.next;
        prev.next = temp.next;
        temp->next=null;
        return head;
    }

    static Node getLastN(Node head, int pos){
        int length = length(head);
        int rPos = length - pos + 1;
        int i = 0;
        Node temp = head;
        while(i<pos){
            if(temp.next!=null)
                temp = temp.next;
            i++;
        }
        return temp;
    }
}