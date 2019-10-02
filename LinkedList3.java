/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5.trainbooking;

/**
 *
 * @author admin
 */
public class LinkedList3 {
    NodeB head,tail;
    int size;
    int check3 = 0;
    
        boolean isEmpty(){
        return (head==null);
    }
    
    void clear(){
        head = tail = null;
    } 
    
    void addToTail(String tcode, String ccode, int book){
        NodeB p = new NodeB(tcode, ccode,book);
        if(isEmpty()){
            head = p;
            tail = head;
        }
        else{
            tail.next = p;
            tail = p;
        }
    }
    
    void printList(LinkedList3 list){ 
        NodeB currNode = list.head;  
  
        System.out.printf("%4s %s %4s %2s %20s","tcode","|","ccode","|","amount_seats_booked");
        System.out.println("\n----------------------------------------------------");
        while (currNode != null) { 
                
            System.out.printf("%4s %2s %4s %2s %10d ",currNode.tcode,"|", currNode.ccode,"|", currNode.book);
            System.out.println("");
            currNode = currNode.next;
        } 
            
    }
    
    NodeB divideList(NodeB a, NodeB b){
        NodeB r = null;
        if(a==null)
            return b;
        if(b==null)
            return a;
        compareBooking cb = new compareBooking();
        
        if(cb.compare(a, b)== -1){
            r = a;
            r.next = divideList(a.next,b);
        }
        else{
            r = b;
            r.next = divideList(a, b.next);
        }
        
        return r;
    }
    NodeB mergeSort(NodeB head) 
    { 
        // Base case : if head is null 
        if (head == null || head.next == null) { 
            return head; 
        } 
  
        // get the middle of the list 
        NodeB mid = getMiddle(head); 
        NodeB nextMid = mid.next; 
  
        // set the next of middle node to null 
        mid.next = null; 
  
        // Apply mergeSort on left list 
        NodeB left = mergeSort(head); 
  
        // Apply mergeSort on right list 
        NodeB right = mergeSort(nextMid); 
  
        // Merge the left and right lists 
        NodeB sortedList = divideList(left, right); 
        return sortedList; 
    } 
        NodeB getMiddle(NodeB head){
        NodeB mid = null;
        NodeB after = null;
        mid = after = head;
        while(after.next!=null && after.next.next != null){
            mid = mid.next;
            after = after.next.next;
        }
        return mid;
    }
        
    NodeB NodeSearch(String x_tcode,String x_ccode, LinkedList3 l){
        
        check3 = 0;
        NodeB curr = l.head;
        
        while(curr!=null){
            if(x_ccode.equals(curr.ccode)&& x_tcode.equals(curr.tcode)){
                check3++;
                break;
            }
            else curr = curr.next;
        }
        return curr;
    }
    
    boolean search(){
        return check3>0;
    }    
}
