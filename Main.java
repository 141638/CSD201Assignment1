/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5.trainbooking;



import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        File f = new File("D:\\NewBeansProject/trainlist.txt");
        /*
        FileWriter fw = new FileWriter(f,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello");
        bw.newLine();
        bw.write("con cu");
        bw.close();
        */
        Scanner sc = new Scanner(System.in);
        int n = 0;
        
        do{    
            System.out.println("-----Train Booking Menu-----");
            System.out.println("1. Train List");
            System.out.println("2. Customer List");
            System.out.println("3. Booking List");
            System.out.println("4. Exit");
            System.out.print("Option: ");
            n = sc.nextInt();
        
            switch(n){
                
                case 1:{
                    TrainList tr = new TrainList();
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
                    n = sc.nextInt();
                    
                    switch(n){
                        case 1:{
                            tr.Train1(f);
                            break;
                        }
                        case 2:{
                            
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
                    break;
                }
                
                case 3:{
                    System.out.println("1. Input Data");
                    System.out.println("2. Display Data Width Available Seat");
                    System.out.println("3. Sort By Tcode & Ccode");
                    break;
                }
            }
        }
        while(n!=4);
    }    
    
}
