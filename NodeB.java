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
public class NodeB extends Booking {
    NodeB next;
    int book;
    
    public NodeB(String tcode, String ccode, int n) {
        next = null;
        this.tcode = ccode;
        this.ccode = ccode;
        this.book = n;
    }

    public void setNext(NodeB next) {
        this.next = next;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public void setTcode(String tcode) {
        this.tcode = tcode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
    
    
    
}
