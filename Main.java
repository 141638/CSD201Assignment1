/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5.trainbooking;



import java.io.IOException;
import java.io.*;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        FileTrain ft = new FileTrain();
        CheckInput ci = new CheckInput();
        LinkedList list = new LinkedList();
        LinkedList2 list2 = new LinkedList2();
        LinkedList3 list3 = new LinkedList3();
        TrainList tr = new TrainList();
        CustomerList cs = new CustomerList();
        BookingList bl = new BookingList();
        File f = new File("D:\\TrainBooking\\trainlist.txt");
        Scanner sc = new Scanner(System.in);

        int n = 0;

        do{    
            System.out.println("-----Train Booking Menu-----");
            System.out.println("1. Train List");
            System.out.println("2. Customer List");
            System.out.println("3. Booking List");
            System.out.println("0. Exit");
            System.out.print("Option: ");
            n = ci.CheckInput1(n);

            switch(n){
               
                case 1:{
                    
                    System.out.println("----Train List----");
                    System.out.println("1. Load Data From File");
                    System.out.println("2. Input & Add To The End");
                    System.out.println("3. Display Data");
                    System.out.println("4. Save Train List Data");
                    System.out.println("5. Search By Tcode");
                    System.out.println("6. Delete By Tcode");
                    System.out.println("7. Sort By Tcode");
                    System.out.println("8. Add After Position x");
                    System.out.println("9. Delete The Node Before The Node Having Tcode = Xcode");
                    System.out.print("Your option: ");
                    n = ci.CheckInput1(n);
                    
                    switch(n){
                        
                        case 1:{
                            tr.Train1(list);
                            break;
                        }
                        
                        case 2:{
                            tr.Train2(list);
                            break;
                        }
                        
                        case 3:{
                            
                            tr.Train3(list);
                            break;
                        }
                        
                        case 4:{
                            tr.Train4(f, list);
                            break;
                        }
                        
                        case 5:{
                            tr.Train5(list);
                            break;
                        }
                        
                        case 6:{
                            tr.Train6(list);
                            break;
                        }
                        
                        case 7:{
                            tr.Train7(list);
                            break;
                        }
                        
                        case 8:{
                            tr.Train8(list);
                            break;
                        }
                        case 9:{
                            tr.Train9(list);
                            break;
                        }
                    }
                    break;
                    
                } 
            
                case 2:{
                    System.out.println("----Customer List----");
                    System.out.println("1. Load Data From File");
                    System.out.println("2. Input & Add To The End");
                    System.out.println("3. Display Data");
                    System.out.println("4. Save Customer List Data");
                    System.out.println("5. Search By Ccode");
                    System.out.println("6. Delete By Ccode");
                    System.out.print("Your option: ");
                    n = ci.CheckInput1(n);
                    
                    switch(n){
                        case 1:{
                            cs.CL1(list2);
                            break;
                        }
                        case 2:{
                            cs.CL2(list2);
                            break;
                        }
                        
                        case 3:{
                            cs.CL3(list2);
                            break;
                        }
                        
                        case 4:{
                            cs.CL4(list2);
                            break;
                        }
                        
                        case 5:{
                            cs.CL5(list2);
                            break;
                        }
                        
                        case 6:{
                            cs.CL6(list2);
                            break;
                        }
                    }
                    break;
                }
                
                case 3:{
                    System.out.println("----Booking List----");
                    System.out.println("1. Input Data");
                    System.out.println("2. Display Data Width Available Seat");
                    System.out.println("3. Sort By Tcode & Ccode");
                    n = ci.CheckInput1(n);
                    
                    switch(n){
                        case 1:{
                            bl.BL1(list, list2, list3);
                            break;
                        }
                        case 2:{
                            bl.BL2(list3);
                            break;
                        }
                        
                        case 3:{
                            try {
                                bl.BL3(list3);
                            } catch (Exception e) {
                                System.out.println("If this line appears, maybe there are some mistakes in my algorithm!?");
                            }
                            break;
                        }
                    }
                }
                
            }
        }
        while(n!=0);
    }    
    
}
