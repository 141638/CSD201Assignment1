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
public class LinkedList2 {
    
    NodeC head,tail;
    int size;   
    int check2 = 0;
    
    LinkedList2(){
        head = tail = null;
        size =0;
    }
    
    boolean isEmpty(){
        return (head==null);
    }
    
    void clear(){
        head = tail = null;
    }  
    
    void addToTail(String ccode, String cusName, String phone){
        NodeC p = new NodeC(ccode, cusName,phone);
        if(isEmpty()){
            head = p;
            tail = head;
        }
        else{
            tail = head;
            while(tail.next!=null)
                tail = tail.next;
            tail.next = p;
        }
    }
    
    void printList(LinkedList2 list){ 
        NodeC currNode = list.head;  
  
        System.out.printf("%4s %s %13s %s %5s","ccode","|","Customer_Name","|","Phone");
        System.out.println("\n--------------------------------------------");
        while (currNode != null) { 
                
            System.out.printf("%4s %2s %6s %8s %4s ",currNode.ccode,"|", currNode.cusName,"|", currNode.phone);
            System.out.println("");
            currNode = currNode.next;
            
        } 
    }
    
    NodeC NodeSearch(String xcode, LinkedList2 l){
        
        check2 = 0;
        NodeC curr = l.head;
        
        while(curr!=null){
            if(xcode == null ? curr.ccode == null : xcode.equals(curr.ccode)){
                check2++;
                break;
            }
            else curr = curr.next;
        }
        return curr;
    }
    
    boolean search(){
        return check2>0;
    }
    
}
