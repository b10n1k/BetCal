/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.bet;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author j0ni
 */
@ManagedBean
@RequestScoped
public class DateBean {

    /** Creates a new instance of DateBean */
    public DateBean() {
        
    }
    
    public Date getToday() {
        return new Date();
    }
}
