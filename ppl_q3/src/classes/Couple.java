
package classes;
import java.util.ArrayList;
import java.lang.Math.*;
/**
 * <h1>Couple Class</h1>
 * <p> Contains the basic information about couple<p>
 * @author tanisha Keshri
 * @version 1.0
 * @since 2017-04-06
 */
public class Couple {
    public Boy b;// Boy object stores the information of the boy in this relation ship
    public Girl g; // Girl object stores the information of the Girl in this relation ship
    public float happiness; // happines of the couple
    public float compatibility; // compatibility of the couple
    public ArrayList<Gift> gifts; // the Gifts that the boy gives to her girlfriend it is an ArrayList of gift object 

    /**
     * <p>To initialize happiness and compatibility.</p>
     */
    public Couple() {
        compatibility = 0;
        happiness =0;
    }
    
    /**
     * <p>the function calculate the compatibility of the couple</p>
     * @param g1 of type Girl
     * @param b1 of type boy
     */
    public void final_comptibility(Girl g1,Boy b1){
        this.compatibility = Math.abs(b1.budget-g1.maint_budget) +Math.abs(g1.intelligence-b1.intelligence)+Math.abs(g1.attraction-b1.attractiveness);
    }
    /**
     * <p> Calculate the happiness of couple
     * @param h1 happiness of boy
     * @param h2 happiness of girl
     */
    
 
    public void final_happiness(float h1,float h2){
        this.happiness = h1+h2;
    }
    
}
