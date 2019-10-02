/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5.trainbooking;

import static assignment5.trainbooking.FileTrain.sc;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class FileCustomer {
    
    static Scanner sc = new Scanner(System.in);
        
    public static void outputFile(LinkedList2 list,String path) throws IOException{
        java.io.File listFile = new java.io.File(path);
        Scanner readList = new Scanner(listFile);
        FileWriter out;
        out = new FileWriter(path);
        NodeC p = list.head;

        while(p != null){

            String ccode = p.ccode.toString();
            out.write(ccode+"|");
            String cusName = p.cusName.toString();
            out.write(cusName+"|");
            String phone = p.phone.toString();
            out.write(phone+"|");
            
            p = p.next;
        }
        out.flush();
        out.close();
        System.err.println("Saved successfully !");

    }

    public static void saveDataToFile(LinkedList2 l) throws IOException{
        while(true){
            System.err.println("Do you want to create a new save file?(Y/N)");
            boolean answer;
            String c = sc.nextLine();
            if("y".equals(c)||"Y".equals(c)) answer = true;
            else answer = false;
            System.out.print("Enter the file name to save data : ");
            String nameFile = sc.nextLine().trim();
            if(answer == true){
                    File file2 = new File(nameFile);
                    file2.createNewFile();
                    if (file2.exists()){
                        System.err.println("<File is created>");
                        FileCustomer.outputFile(l ,nameFile);
                        break;
                    }
                    else{
                        System.err.println("<File already exists!>");
                    }
            }
            else{
                try{
                    FileCustomer.outputFile(l,nameFile);
                    break;
                }
                catch(Exception e){}System.err.println("<Your file doesn't exist. Please re-input!>");
        }
    }
    }
}
