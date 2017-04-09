
package ppl_q3;

import classes.*;
import java.util.ArrayList;

/**
 * <h1>Class Ppl_q3 </h1>
 * @author tanisha
 * @version 1.0
 * @since 2017-04-06
 */

public class Ppl_q3 {

    public static void main(String[] args) {
        Function f = new Function();// create object of type function
        ArrayList<Boy> boyArray ; // ArrayList of Boys
        
        ArrayList<Girl> girlArray ; // ArrayLIst of Girl
        ArrayList<Couple> coupleArray ; // Array list of Couple
        ArrayList<Gift> giftArray; // Array list of Gift
        ArrayList<ArrayList<Gift>> gift_basket; // 2d Array list of Gift
        
        boyArray = f.getBoys(); // Adds data to Array list of boys
        girlArray = f.getGirls(); // Adds data to Array list of girls 
        giftArray = f.getGifts(); // Adds data to Array list of gifts
        coupleArray = f.make_pair(girlArray, boyArray); // Adds data to Array list of couple
        
        
        int k =10;
        gift_basket = f.print_gift_basket(giftArray, coupleArray); // sets the gift basket
        f.print_basket(coupleArray,k);// prints k happiest ,k most compatiable couple and gift details of each couple
        
        
    }
    
}
