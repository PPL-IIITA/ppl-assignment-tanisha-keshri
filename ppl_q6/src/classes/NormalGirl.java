
package classes;

/**
 *<h1> Class NormalGirl</h1>
 * <p>Subclass of Girl</p>
 * @author tanisha
 */
public class NormalGirl extends Girl{
    private float happiness;
    
    /**
     * <p>Constructor for setting happiness </p>
     * 
     */
    public NormalGirl() {
        happiness = 0;
    }
    
    /**
     * <p>calculate happiness adds price of each gift </p>
     * @param a 
     */
    public void Calculate_happiness(float a){
        happiness += a;
    }
    
    /**
     * 
     * @return float final happiness 
     */
    public float final_happiness(){
        return (happiness*happiness);
    }
}
