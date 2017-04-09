/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_q5;

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
public class Ppl_q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           Function f = new Function();// create object of type function
        ArrayList<Boy> boyArray ; // ArrayList of Boys
        
        ArrayList<Girl> girlArray ; // ArrayLIst of Girl
        ArrayList<Couple> coupleArray ; // Array list of Couple
        
        
        
        boyArray = f.getBoys(); // Adds data to Array list of boys
        girlArray = f.getGirls(); // Adds data to Array list of girls 
         // Adds data to Array list of gifts
        coupleArray = f.make_pair(girlArray, boyArray); // Adds data to Array list of couple
        System.out.println("Boy        Girl");
        for(int i=0;i<coupleArray.size();i++){
            System.out.println(coupleArray.get(i).b.name+"    "+coupleArray.get(i).g.name);
        }
        
    }
    
}
