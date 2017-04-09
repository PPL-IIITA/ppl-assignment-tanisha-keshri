
package ppl_q7;

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
public class Ppl_q7 {

    /**
     * @param args the command line arguments
     */
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
                Random r = new Random();
                int j;
                for(int i=0;i<boyArray.size();i++){
                    j = r.nextInt(3);
                    switch(j){
                        case 0:
                            Imp1 m = new Imp1(coupleArray);
                            System.out.println(m.method1(boyArray.get(i)));
                            break;
                        case 1 :
                            Imp2 m1 = new Imp2(coupleArray);
                            System.out.println(m1.method2(boyArray.get(i)));
                            break;
                        case 2 :
                            Imp3 m2 = new Imp3(coupleArray);
                            System.out.println(m2.method3(boyArray.get(i)));
                            break;
                    }
                }
    }
    
}
