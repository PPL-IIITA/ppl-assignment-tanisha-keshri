
package classes;
/**
 *<h1>Utility Boy</h1>
 * <p>This class contains the basic information about boys</p>
 * @author tanisha
 * @version 1.0
 * @since 2017-04-06
 */

public class Boy {
    public String name; // Stores the name of boy as boy0,boy1...
    public int status; // Stores the information weither the boy is single or commited a -1 value represents single initialy and non -ve (index of his girlfriend in the object array of type Girl) value represents commited
    public int attractiveness; // Stores attractiveness of the boy ranges from 1 to 10. 
    public int budget; // Stores budget of boy ranges from 3000 to 6000
    public int min_attr_req;// minimum amount of attraction thatthe boy want from his girlfriend 
    public int intelligence; // Intelligence of boy
    public int type; // stores the typr of the boy 1 for Miser 2 for Generous and 3 for Geeks
    
    /**
     * <p>checks whither the girl possesses the minimum attraction required by the boy or not</p>
     * @param g for checking whither girl is perfect for the boy or not
     * @return int 1 if girl can be his girlfriend or 0 other wise
     */
    public int check(Girl g){
        if(g.attraction > min_attr_req && g.maint_budget < budget)
                return 1;
        else
            return 0;
    }
}
