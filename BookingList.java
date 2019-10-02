/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5.trainbooking;

import java.util.Scanner;


public class BookingList {
    Scanner sc = new Scanner(System.in);
    CheckInput ci = new CheckInput();
    
    void BL1(LinkedList l, LinkedList2 l2,LinkedList3 l3){
        String s,s2;
        int m = 0;
        NodeTrain n;
        NodeC n2;
        
        System.out.println("---- Input data ----");
        System.out.print("Enter train code: ");
        s = sc.next();
        System.out.print("Enter customer code: ");
        s2 = sc.next();
        System.out.print("Enter number of seats to be booked: ");
        m = ci.CheckInput1(m);
        
        n = l.NodeSearch(s, l);
        n2 = l2.NodeSearch(s2, l2);
        
        if(!l.search()||!l2.search()){
            System.err.println("Data not accepted!!");
        }
        if(l3.search()) System.out.println("Data not accepted!");
        if(l.search() && l2.search()){
            if(n.booked == n.seat)
                System.err.println("The train is exhausted!!");
            else if(n.booked<n.seat){
                if(m<=(n.seat-n.booked)){
                    System.err.println("Data accepted!"); 
                    l3.addToTail(s, s2, m);
                }
            }
                
        }
    }
        
    void BL2(LinkedList3 l){
        System.out.println("---- Display Data ----");
        l.printList(l);
    } 
    
    void BL3(LinkedList3 l){
        System.out.println("---- Sort by tcode and ccode ----");
        l.mergeSort(l.head);
        System.err.println("Sort Completed!!");
    }
        
}
