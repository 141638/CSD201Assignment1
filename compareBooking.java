/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5.trainbooking;

import java.util.Comparator;

/**
 *
 * @author admin
 */
public class compareBooking implements Comparator {
    int kq;
    public int compare(Booking x, Booking y) {
        if((((Booking)x)).ccode!=((Booking)y).ccode)  kq = -compare(((Booking)x).ccode, ((Booking)y).ccode);
        else if((((Booking)x)).tcode!=((Booking)y).tcode)  kq = -compare(((Booking)x).tcode, ((Booking)y).tcode);
        return kq;
    }

    @Override
    public int compare(Object t, Object t1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
