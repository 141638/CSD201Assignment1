/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5.trainbooking;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class FileTrain {

    static Scanner sc = new Scanner(System.in);
    

    public static void outputFile(LinkedList list,String path) throws IOException{
        java.io.File listFile = new java.io.File(path);
        Scanner readList = new Scanner(listFile);
        FileWriter out;
        out = new FileWriter(path);
        NodeTrain p = list.head;

        while(p != null){

            String tcode = p.tcode.toString();
            out.write(tcode+"|");
            String trainName = p.trainName.toString();
            out.write(trainName+"|");
            String seat = String.valueOf(p.seat);
            out.write(seat+"|");
            String booked = String.valueOf(p.booked);
            out.write(booked+"|");
            String departTime = String.valueOf(p.departTime);
            out.write(departTime+"|");
            String departPlace = p.departPlace.toString();
            out.write(departPlace+"|");
            
            p = p.next;
        }
        out.flush();
        out.close();
        System.err.println("<Tax payer is successfully saved>");

    }

    public static void saveDataToFile(LinkedList list) throws IOException{
        while(true){
            System.err.println("Do you want to create a new save file?(Y/N)");
            boolean answer;
            String c = sc.nextLine();
            if("y".equals(c)||"Y".equals(c)) answer = true;
            else answer = false;
            System.out.print("Enter the file name to save data : ");
            String nameFile = sc.nextLine().trim();
            if(answer == true){
                    File file = new File(nameFile);
                    file.createNewFile();
                    if (file.exists()){
                        System.err.println("<File is created>");
                        FileTrain.outputFile(list,nameFile);
                        break;
                    }
                    else{
                        System.err.println("<File already exists!>");
                    }
            }
            else{
                try{
                    FileTrain.outputFile(list,nameFile);
                    break;
                }
                catch(Exception e){}System.err.println("<Your file doesn't exist. Please re-input!>");
        }
    }
    }
}
