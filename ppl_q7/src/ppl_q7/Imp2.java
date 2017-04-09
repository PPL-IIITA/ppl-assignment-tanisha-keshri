/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_q7;

import classes.Boy;
import classes.Couple;
import java.util.ArrayList;

/**
 *
 * @author tanisha
 */
public class Imp2 extends Implementation {

    public Imp2(ArrayList<Couple> B) {
        super(B);
    }
    
    public String method2(Boy b){
        for(int i=0;i<c.size();i++){
            if(c.get(i).b == b){
                return c.get(i).g.name;
            }
        }
        return "Don't have a girlfriend";
    }
    
}
