/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.bet;

import java.text.DecimalFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author j0ni
 */
@ManagedBean
@SessionScoped
public class Calculation {

    private double odd1;
    private double odd2;
    private double profit;
    private double lost;
    private double bet;
    private Date date;
    private BetLog betLog=new BetLog();
    
    /** Creates a new instance of Calculation */
    public Calculation() {
        //TODO lost will be taken by a file
        //TODO profit must be saved in a file
        this.odd1=0;
        this.odd2=0;
        this.profit=0;
        this.lost=0;
        this.date=new Date();
    }
    
       public double getBet() {
        return bet;
    }

    public void setBet(double bet) {
        this.bet = bet;
    }
    public double getLost() {
        return lost;
    }

    public void setLost(double lost) {
        this.lost = lost;
    }

    public double getOdd1() {
        return odd1;
    }

    public void setOdd1(double odd1) {
        this.odd1 = odd1;
    }

    public double getOdd2() {
        return odd2;
    }

    public void setOdd2(double odd2) {
        this.odd2 = odd2;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public String getDate() {
        return date.toString();
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BetLog getBetLog() {
        return betLog;
    }

    public void setBetLog(BetLog betLog) {
        this.betLog = betLog;
    }
    
    
//TODO add history facilities    

    public void execAlgorithm(double profit, double lost, double odd1, double odd2) {
        //Π= (Χ+Κ)/((Α1*Α2)-1)
         
         DecimalFormat dec=new DecimalFormat("0.00");
         
         Double fbet=this.bet=(profit+lost)/((odd1*odd2)-1);
         this.bet=Double.parseDouble(dec.format(fbet));
         betLog.addToList(this);
         this.lost+=this.bet;
         this.odd1=0f;
         this.odd2=0f;
    }
}
