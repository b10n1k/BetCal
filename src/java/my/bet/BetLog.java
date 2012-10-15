/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.bet;

import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author j0ni
 */
@ManagedBean
@ApplicationScoped
public class BetLog {

    private static ArrayList<Calculation> arrLogs; 
    private Calculation cal;
    private String log="";

    public String getLog() {
       // for(Calculation c:this.betList){
           // txt+=c.getDate()+": ";
           // txt+=c.getOdd1()+" ";
           // txt+=c.getOdd2()+" ";
            //txt+=c.getLost()+" ";
          //  txt+=c.getProfit()+"\n";
        //}
        
        return this.log;
    }

    public void setLog(String txt) {
        this.log = txt;
    }
    
    /**
     * Creates a new instance of BetLog
     */
    public BetLog() {
        this.arrLogs=new ArrayList<Calculation>();
    }

    public ArrayList<Calculation> getBetList() {
        return arrLogs;
    }

    public void setBetList(ArrayList<Calculation> betList) {
        this.arrLogs = betList;
    }

    public void addToList(Calculation cal){
        arrLogs.add(cal);
    }
    
    @Override
    public String toString() {
        return "BetLog{" + " betList=" + arrLogs + "}";
    }
    
    public void addNewBetProperties(Calculation obj){
        for(Calculation c:this.arrLogs){
            this.log.concat(c.getDate().toString()+": "+c.getOdd1()+" "+c.getOdd2()+" "+c.getLost()+" "+c.getProfit()+"\n");
        }
    }
    
    public String reportList(){
        String report="";
        for(Calculation c:this.arrLogs){
            report=log.concat(c.getDate().toString()+": "+c.getOdd1()+" "+c.getOdd2()+" "+c.getLost()+" "+c.getProfit()+"\n");
        }
        return report;
    }
}
