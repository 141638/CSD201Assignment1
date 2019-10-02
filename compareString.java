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
public class compareString implements Comparable<Train> {

    private String s1;
    private String s2;
    public compareString(String s1,String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public String getS1() {
        return s1;
    }
    public String getS2() {
        return s2;
    }

    @Override
    public int compareTo(Train x) {
         return this.s1.compareTo(x.tcode);
    }
    public int compareTo(Customer y){
        return this.s2.compareTo(y.ccode);
    }
    
}
