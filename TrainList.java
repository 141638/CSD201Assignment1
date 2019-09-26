/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5.trainbooking;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TrainList {
   
    Scanner sc = new Scanner(System.in);    
    String tcode;
    String trainName;
    int seat;
    int booked;
    double departTime;
    String departPlace;

    void Train1(File f) throws IOException {
        String s = new String(Files.readAllBytes(Paths.get(f.getPath())));
        System.out.println(s);
        System.out.println("Do you want to keep the existing data?");
        System.out.println("Y/N");
        String o = sc.nextLine();
        if("n".equals(o)) {
            f.delete();
            f.createNewFile();
        }
        
    }
    
   
    
    
}

    


    

