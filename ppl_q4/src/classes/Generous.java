/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *<h1>Class Generous</h1>
 * <p> extends Class Boy</p> 
 * @author tanisha
 * @author tanisha Keshri
 * @version 1.0
 * @since 2017-04-06
 */
public class Generous extends Boy{
    private float happiness;
    private float money_spent;

    public Generous() {
        happiness = 0;
        money_spent = 0;
    }
    
    /**
     * <p>Checks whither the boy can give the gift or not</p>
     * @param gift // Gift object
     * @return 0 or 1
     */
    public int check_gift(Gift gift){
        if(budget > money_spent + gift.price ){
            money_spent += gift.price;
            return 1;
        }
        return 0;
        
    }
    /**
     * @param h happiness of girl which is also happiness of boy  
     */
    public void final_happiness(float h){
        happiness = h;
        
    }
}
