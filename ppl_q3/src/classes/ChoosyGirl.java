
package classes;

/**
 * 
 * @author tanisha
 * @author tanisha Keshri
 * @version 1.0
 * @since 2017-04-06
 */
public class ChoosyGirl extends Girl{
    public float happiness;

    public ChoosyGirl() {
        happiness = 0;
    }
    /**
     * <p>calculate happiness
     * @param a float price 
     */
    
    public void Calculate_happiness(float a){
        happiness += a;
    }
    /**
     * 
     * @return happiness
     */
    public float final_happiness(){
        return happiness;
    }
}
