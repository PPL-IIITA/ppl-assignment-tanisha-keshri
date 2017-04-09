/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_q4;

import classes.Boy;
import classes.Couple;
import classes.Gift;
import classes.Girl;
import java.util.ArrayList;

/**
 * <h1>Class Ppl_q4 </h1>
 * @author tanisha
 * @version 1.0
 * @since 2017-04-06
 */
public class Ppl_q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        
        f.assignNew(coupleArray,boyArray,girlArray,k);// assigns new boyfriend to 
    }
     
    }
    
