/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.bet;

import java.util.Date;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author j0ni
 */
@ManagedBean
@RequestScoped
public class Calculation {

    private double odd1;
    private double odd2;
    private double profit;
    private static double lost=0;
    private double bet;
    private Date date;
    BetLog blog=new BetLog();

    public BetLog getBlog() {
        return blog;
    }

    public void setBlog(BetLog blog) {
        this.blog = blog;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    private DateBean dt;

    public DateBean getDt() {
        return dt;
    }

    public void setDt(DateBean dt) {
        this.dt = dt;
    }
    
    
    /** Creates a new instance of Calculation */
    public Calculation() {
        //TODO lost will be taken by a file
        //TODO profit must be saved in a file
        this.odd1=0;
        this.odd2=0;
        this.profit=0;
        
        DateBean dt=new DateBean();
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
        Calculation.lost = lost;
        
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
    
//TODO add history facilities    

    public void execAlgorithm(double profit, double lost, double odd1, double odd2) {
        //Π= (Χ+Κ)/((Α1*Α2)-1)
         
         Double res=(profit+lost)/((odd1*odd2)-1);
         Calculation.lost+=res;
         this.bet=res;
         blog.addToList(this);
         
    }
}
