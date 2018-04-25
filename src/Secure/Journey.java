/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;

/**
 *
 * @author Mercyck
 */
public class Journey {
    private int journeyId;
    private int driverId;
    private String startTime;
    private String pickupPoint;
    private String destination;
    private String passengername;
    private double fare;
    private double optTip;
    private boolean account;
    private String nameAccount;
    private String telephone;
    private String dateOfJourney;
    
    public Journey(int jid, int jdriverid, String jstartTime, String jpickupPoint, String jdestination, String jpassengername, double jfare, double joptTip, boolean jaccount, String jnameAccount, String jtelephone, String jdate){
    this.journeyId = jid;
    this.driverId= jdriverid;
    this.startTime = jstartTime;
    this.pickupPoint = jpickupPoint;
    this.destination = jdestination;
    this.passengername = jpassengername;
    this.fare = jfare;
    this.optTip = joptTip;
    this.account = jaccount;
    this.nameAccount = jnameAccount;
    this.telephone = jtelephone;
    this.dateOfJourney = jdate; 
    }
    
    public int getJid(){
        return journeyId;
    }
    
    public int getDriverId(){
        return driverId;
    }
    
    public String getStartTime(){
        return startTime;
    }
    
    public String getPickupPoint(){
        return pickupPoint;
    }
    
    public String getDestination(){
        return destination;
    }
        
    public String getPassengerName(){
        return passengername;
    }
    
    public double getFare(){
        return fare;
    }
    public double getTip(){
        return optTip;
    }
    
    public boolean getAccount(){
        return account;
    }
    
    public String getNameAccount(){
        return nameAccount;
    }
    
    public String getTel(){
        return telephone;
    }
    public String getDateOfJourney(){
        return dateOfJourney;
    }
}
