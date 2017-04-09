
package classes;
/**
 * <h1>Girl Class</h1>
 * <p>This class contains all the basic information about girls</p>
 * @author tanisha Keshri
 * @version 1.0
 * @since 2017-04-06
 */

public class Girl {
    public String name; // name of girl
    public int status; // Stores the status -1 for single and non -ve value for commited
    public int attraction; // stores attraction of the girl ranges from 1-10
    public int maint_budget; // maintanence budget of the girl
    public int intelligence; // intelligence of the girl
    public int type;//which type of girl 1 for choosy 2 for Normal and 3 for desperate
    public int criteria;//criteria for selection of boyfriend 1,2 or 3 attractive ,rich or intelligant for selection
    
    
    /**
     * <p>the function checks whither the boy passes the criteria for being the boyfriend of the girl</p>
     * @param b of type Boy 
     * @return int value 1 if the boy can become his boyfriend or 0 otherwise
     */
    public int check(Boy b){
        if(b.budget > maint_budget)
            return 1;
        else
            return 0;
    }
}
