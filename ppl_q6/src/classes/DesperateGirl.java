
package classes;

/**
 * 
 * @author tanisha
 * @author tanisha Keshri
 * @version 1.0
 * @since 2017-04-06
 */
public class DesperateGirl extends Girl {
     private float happiness;

    public DesperateGirl() {
        happiness = 0;
    }
    
    /**
     * <p> calculate happiness</p>
     * @param a prive of gifts used to calculate happiness
     */
    public void Calculate_happiness(float a){
        happiness += a;
    }
    /**
     * 
     * @return final happiness
     */
    public float final_happiness(){
        return (happiness*happiness);
    }
}
