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
public class Report {
    private int driverid;
    private double taking;
    private double percentageDriver;
    private int jobsDone;
    
    public Report(int rdriverid, double rtaking, double rpercentageDriver, int rjobsDone){
        this.driverid = rdriverid;
        this.taking = rtaking;
        this.percentageDriver = rpercentageDriver;
        this.jobsDone = rjobsDone;
    }
    
    public int getdriverid(){
        return driverid;
    }
    
    public double getTaking(){
        return taking;
    }
    
    public double getPercentageDriver(){
        return percentageDriver;
    }
    public int getJobsDone(){
        return jobsDone;
    }

}
