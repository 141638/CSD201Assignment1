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
import sun.security.util.Length;

/**
 *
 * @author admin
 */
public class TrainList extends Train {
   
    CheckInput ci = new CheckInput();
    Scanner sc = new Scanner(System.in);    

    private static BufferedReader openFile(String nameFile) throws IOException {
        try {
            return new BufferedReader(new FileReader(nameFile));
        } catch (FileNotFoundException e) {
            throw new IOException("File [" + nameFile + "] not found.", e);
        }
    }
    private static String readFile(BufferedReader reader) throws IOException {
        StringBuffer sb = new StringBuffer();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
    }
    
    private static void readObjects(String fileContents, LinkedList l ) {
        
        
        String[] parts = fileContents.split("\\|");
        for(int i = 0, length = parts.length;i<length; i+=6){               
            
            String tc = parts[i];
            String tn = ((i+1) < length ? parts[i+1] : "");
            int s = ((i+2) < length ? Integer.parseInt(parts[i+2]) : -1);
            int b = ((i+3) < length ? Integer.parseInt(parts[i+3]) : -1);
            double dt = ((i+4) < length ? Double.parseDouble(parts[i+4]) : -1);
            String dp = ((i+5) < length ? parts[i+5] : "");
            l.addToEnd(l, tc, tn, s, b, dt, dp);
        }
    }
    void Train1(LinkedList list) throws FileNotFoundException{
        System.out.println("---- Load data from file ----");
        while(true){
            System.out.print("Enter the file name to load data : ");
            Scanner sc = new Scanner(System.in);
            String nameFile = sc.nextLine().trim();

            BufferedReader reader;
            try {
                reader = openFile(nameFile);
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return;
            }

            String fileContents;
            try {
                fileContents = readFile(reader);
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
                return;
            }
                readObjects(fileContents,list);
                break;
        }
        System.err.println("Data input completed!");
    }
    
    void Train2(LinkedList list){
        
        System.out.println("----Input & Add to the head ----");
        System.out.print("Enter train code: ");
        tcode = sc.next();
        System.out.print("Enter train name: ");
        trainName = sc.next();
        System.out.print("Enter seat: ");
        seat = ci.CheckInput1(seat);
        System.out.print("Enter booked seat: ");
        booked = ci.CheckInput1(booked);
        System.out.print("Enter depart time: ");
        departTime = ci.CheckInput2(departTime);
        System.out.print("Enter depart place: ");
        departPlace = sc.next();
        
        list.addToHead(list, tcode, trainName, seat, booked, departTime, departPlace);
    }
    
    void Train3(LinkedList list) throws IOException {

        System.out.println("---- Display Data ----");
        list.printList(list);
        
    }
    
    void Train4(File f, LinkedList list) throws IOException{
        System.out.println("---- Save train list to file ----");
        FileTrain.saveDataToFile(list);
    }
    
    void Train5(LinkedList list){
        String c;
        System.out.println("---- Search by tcode ----");
        System.out.println("Enter the tcode you want to search: ");
        c = sc.next();
        list.NodeSearch(c, list);
        if(list.search()) System.err.println("Found!");
        else System.err.println("Data not found!");
        
    }
    
    @SuppressWarnings("null")
    void Train6(LinkedList list){
        
        NodeTrain curr = list.head;
        NodeTrain prev = null;
        
        System.out.println("---- Delete by tcode ----");
        String c = sc.next();
        
        if(curr!= null && (curr.tcode == null ? c == null : curr.tcode.equals(c))){
            list.head = curr.next;
            System.err.println("Found and Deleted!!");
        }
        else{
            
            while(curr!=null && (curr.tcode == null ? c == null : !curr.tcode.equals(c))){
                    prev = curr;
                    curr = curr.next;
                }

            if(curr!=null){
                prev.next = curr.next;
                System.err.println("Found and Deleted!!");
            }

            if(curr == null){
                System.err.println("tcode not found!!");
            }
        }
    }
    
    void Train7(LinkedList list){
        list.head = list.mergeSort(list.head);
        System.err.println("Sort Completed!!");
        
    }
    
    void Train8(LinkedList list){
        int k = 0;
        System.out.println("---- Add after position k ----");
        System.out.println("Enter position: ");
        k = ci.CheckInput1(k);
        System.out.print("Enter train code: ");
        tcode = sc.next();
        System.out.print("Enter train name: ");
        trainName = sc.next();
        System.out.print("Enter seat: ");
        seat = ci.CheckInput1(seat);
        System.out.print("Enter booked seat: ");
        booked = ci.CheckInput1(booked);
        System.out.print("Enter depart time: ");
        departTime = ci.CheckInput2(departTime);
        System.out.print("Enter depart place: ");
        departPlace = sc.next();
        list.addAfter(k,list.head, tcode, trainName, seat, booked, departTime, departPlace);
        System.err.println("Add completed!");
    }
    
    void Train9(LinkedList list){
        
        NodeTrain curr = list.head;
        NodeTrain prev = null;
        System.out.println("---- Delete before tcode ----");
        String c = sc.next();
        
        if(curr!= null && (curr.tcode == null ? c == null : curr.tcode.equals(c))){
            System.err.println(curr.tcode+"is the first tcode in list!");
        }
        else{
            while(curr!=null ){
                prev = curr;
                curr = curr.next;
                if((curr.tcode == null ? c == null : !curr.tcode.equals(c)))
                {
                    prev = curr;
                    curr = curr.next;
                    break;
                }
            }
            if(curr!=null){
                prev.next = curr.next;
                System.err.println("Found and Deleted!!");
            }

            if(curr == null){
                System.err.println("tcode not found!!");
            }
            
        }
    }
}

    


    

