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
public class NodeC extends Customer {
    
    NodeC next;

    public NodeC(String ccode, String cusName, String phone) {
        next = null;
        this.ccode = ccode;
        this.cusName = cusName;
        this.phone = phone;
    }

    public void setNext(NodeC next) {
        this.next = next;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
}
