
package classes;

/**
 * <h1>Class Miser </h1>
 * <p>sub class of boy<p>
 * @author tanisha
 * @version 1.0
 * @since 2017-04-06
 */
public class Miser extends Boy{
    private float happiness; // happiness of Miser boy
    private float money_spent; // money spent in gifting

    /**
     * <p>constructor</p>
     */
    public Miser() {
        happiness = 0;
        money_spent = 0;
    }
    
    
    /**
     * <p>Checks whither the boy can give the gift or not</p>
     * @param g // Girl object
     * @param gift // Gift object
     * @return 0 or 1
     */
    public int check_gift(Girl g,Gift gift){
        if(g.maint_budget < money_spent ){
            money_spent += gift.price;
            return 1;
        }
        return 0;
        
    }
    
    /**
     * @return happiness of miser boy 
     */
    public float final_happiness(){
        happiness = budget - money_spent;
        return happiness;
    }
}
