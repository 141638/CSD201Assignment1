/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5.trainbooking;

class  LinkedList {
    
    NodeTrain head,tail;
    int size;
    int check =0;
    
    String tcode;
    String trainName;
    int seat;
    int booked;
    double departTime;
    String departPlace;
     
    LinkedList(){
        head = tail = null;
        size =0;
    }
    
    boolean isEmpty(){
        return (head==null);
    }
    
    void clear(){
        head = tail = null;
    }    
   //For Train 
   LinkedList addToHead(LinkedList list, String t_code, String train_Name, int _seat, int _booked,double depart_Time, String depart_Place){
        NodeTrain p = new NodeTrain(t_code,train_Name,_seat,_booked,depart_Time,depart_Place);
        p.next = null;
        size++;
        if(isEmpty()){
            head = p;
            tail = head;
        }
        else{
            p.next = head;
            head = p;
        }
        return list;
    }
    void addToEnd(LinkedList list,String t_code, String train_Name, int _seat, int _booked,double depart_Time, String depart_Place){
        NodeTrain p = new NodeTrain(t_code,train_Name,_seat,_booked,depart_Time,depart_Place);
        p.next = null;
        size++;
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

    void addAfter(int index, NodeTrain head, String t_code, String train_Name, int _seat, int _booked,double depart_Time, String depart_Place){
        int counter;
        NodeTrain curr = head;
        for(counter = 1;counter<index;counter++){
            curr = curr.next;
        }
        NodeTrain q = new NodeTrain(t_code,train_Name,_seat,_booked,depart_Time,depart_Place);
        q.next = curr.next; 
        curr.next = q;
    }
    
    
    void printList(LinkedList list){ 
        
        NodeTrain currNode = list.head; 
 
        System.out.printf("%4s %s %9s %s %4s %s %6s %s %11s %s %12s %s %14s","tcode","|"," Train_name","|"," Seat","|"," booked","|"," depart_time","|"," depart_place","|"," available_seat");
        System.out.println("\n-------------------------------------------------------------------------------------");
        while (currNode != null) { 
                
            System.out.printf("%4s %2s %6s %6s %4d %2s %4d %4s %7s %6s %7s %7s %7s",currNode.tcode,"|", currNode.trainName,"|", currNode.seat,"|", currNode.booked,"|", currNode.departTime,"|", currNode.departPlace,"|", (currNode.seat-currNode.booked));
            System.out.println("");
            currNode = currNode.next;
            
        } 
    }
    
    NodeTrain NodeSearch(String xcode, LinkedList l){
        
        check = 0;
        NodeTrain curr = l.head;
        while(curr!=null){
            if(xcode == null ? curr.tcode == null : xcode.equals(curr.tcode)){
                check++;
                break;
            }
            else curr = curr.next;
        }
        return curr;
    }
    boolean search(){
        return check>0;
    }
    
    NodeTrain divideList(NodeTrain a, NodeTrain b){
        NodeTrain r = null;
        if(a==null)
            return b;
        if(b==null)
            return a;
        
        if(a.tcode.compareTo(b.tcode)<=0){
            r = a;
            r.next = divideList(a.next,b);
        }
        else{
            r = b;
            r.next = divideList(a, b.next);
        }
        
        return r;
    }
    NodeTrain mergeSort(NodeTrain head) 
    { 
        // Base case : if head is null 
        if (head == null || head.next == null) { 
            return head; 
        } 
  
        // get the middle of the list 
        NodeTrain mid = getMiddle(head); 
        NodeTrain nextMid = mid.next; 
  
        // set the next of middle node to null 
        mid.next = null; 
  
        // Apply mergeSort on left list 
        NodeTrain left = mergeSort(head); 
  
        // Apply mergeSort on right list 
        NodeTrain right = mergeSort(nextMid); 
  
        // Merge the left and right lists 
        NodeTrain sortedList = divideList(left, right); 
        return sortedList; 
    } 
        NodeTrain getMiddle(NodeTrain head){
        NodeTrain mid = null;
        NodeTrain after = null;
        mid = after = head;
        while(after.next!=null && after.next.next != null){
            mid = mid.next;
            after = after.next.next;
        }
        return mid;
    }

}
