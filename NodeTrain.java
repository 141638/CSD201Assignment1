/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5.trainbooking;


public class NodeTrain extends Train{
    NodeTrain next;

   
    NodeTrain(String t_code, String train_Name, int _seat, int _booked,double depart_Time, String depart_Place){
        tcode = t_code;
        trainName = train_Name;
        seat = _seat;
        booked = _booked;
        departTime = depart_Time;
        departPlace = depart_Place;
        next = null;
    }

    public void setTcode(String tcode) {
        this.tcode = tcode;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void setBooked(int booked) {
        this.booked = booked;
    }

    public void setDepartTime(double departTime) {
        this.departTime = departTime;
    }

    public void setDepartPlace(String departPlace) {
        this.departPlace = departPlace;
    }
    


    
/*
    public Node getNext() {
        return next;
    }

    public int getI() {
        return i;
    }
*/

    @Override
    public String toString() {
        String c = String.format("%4s %2s %6s %6s %4d %2s %4d %4s %7s %6s %7s %7s %7s",tcode,"|", trainName,"|", seat,"|", booked,"|", departTime,"|", departPlace,"|", (seat-booked));
        return c;
    }
   
    
    
}
