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

    private ArrayList<Calculation> betList; 
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
        this.betList=new ArrayList<Calculation>();
    }

    public ArrayList<Calculation> getBetList() {
        return betList;
    }

    public void setBetList(ArrayList<Calculation> betList) {
        this.betList = betList;
    }

    public void addToList(Calculation cal){
        betList.add(cal);
    }
    
    @Override
    public String toString() {
        return "BetLog{" + " betList=" + betList + "}";
    }
    
    public void addNewBetProperties(Calculation obj){
        for(Calculation c:this.betList){
            log.concat(c.getDate()+": "+c.getOdd1()+" "+c.getOdd2()+" "+c.getLost()+" "+c.getProfit()+"\n");
        }
    }
    
    public String reportList(){
        String report="";
        for(Calculation c:this.betList){
            report=log.concat(c.getDate()+": "+c.getOdd1()+" "+c.getOdd2()+" "+c.getLost()+" "+c.getProfit()+"\n");
        }
        return report;
    }
}
