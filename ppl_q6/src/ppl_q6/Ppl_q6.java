
package ppl_q6;
import classes.Boy;
import classes.Couple;
import classes.Gift;
import classes.Girl;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author tanisha
 */
public class Ppl_q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] year = new int[365];
        int t =0 ;
        int i;
        Random rand = new Random();
        for(i=0;i<year.length;i++){
            year[i] = rand.nextInt(1+1)+0;
            if(year[i] == 1){
                t++;
            }
        }
        
        for(i=0;i<year.length;i++){
            // TODO code application logic here
            if(year[i]==1){
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

                gift_basket = f.print_gift_basket(giftArray, coupleArray); // sets the gift basket

                f.assignNew(coupleArray,boyArray,girlArray,t);// assigns new boyfriend to 
        
            }
        }
    }
    
}
