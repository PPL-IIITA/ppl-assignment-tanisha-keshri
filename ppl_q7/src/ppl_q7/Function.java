package ppl_q7;

import java.io.*;
import java.util.ArrayList;
import classes.Girl;
import classes.Boy;
import classes.*;

/**
 * <h1>Function Class </h1>
 * <p> It provides all the method for retrieving boy data,girl data , assigning gifts and breakups </p>
 * @author tanisha Keshri
 * @version 1.0
 * @since 2017-04-06
 */

public class Function {
    
    private String fName; // stores the file name for inputing the data from files regarding boys ,girls and gifts 
    private FileReader fReader; // a filereader
    private BufferedReader bufferedReader; // a bufferreader
    private String singleLineData; // takes a line as input from the file
    
    
    
    
    /**
     * <p>This method retrieves Boys information from boys.dat file and stores info in an ArrayList of Boys object</p>
     * @return ArrayList of Boys Object
     */
    public  ArrayList<Boy> getBoys() {
        ArrayList<Boy> boysArray = new ArrayList<>();
        fName = "boys.dat";
        String line;
        String [] dataArray;
        try {
            fReader = new FileReader(fName);
            bufferedReader = new BufferedReader (fReader);
            while ((line = bufferedReader.readLine()) != null) {
              
                dataArray = line.split("\\s+");
                Boy b ;
                switch (Integer.parseInt(dataArray[6])) {
                    case 1:
                        b = new Miser();
                        b.name = dataArray[0];
                        b.status = Integer.parseInt(dataArray[1]);
                        b.attractiveness = Integer.parseInt(dataArray[2]);
                        b.budget= Integer.parseInt(dataArray[3]);
                        b.min_attr_req = Integer.parseInt(dataArray[4]);
                        b.intelligence = Integer.parseInt(dataArray[5]);
                        b.type = Integer.parseInt(dataArray[6]);
                        break;
                    case 2:
                        b = new Generous();
                        b.name = dataArray[0];
                        b.status = Integer.parseInt(dataArray[1]);
                        b.attractiveness = Integer.parseInt(dataArray[2]);
                        b.budget= Integer.parseInt(dataArray[3]);
                        b.min_attr_req = Integer.parseInt(dataArray[4]);
                        b.intelligence = Integer.parseInt(dataArray[5]);
                        b.type = Integer.parseInt(dataArray[6]);
                        break;
                    default:
                        b = new Geeks();
                        b.name = dataArray[0];
                        b.status = Integer.parseInt(dataArray[1]);
                        b.attractiveness = Integer.parseInt(dataArray[2]);
                        b.budget= Integer.parseInt(dataArray[3]);
                        b.min_attr_req = Integer.parseInt(dataArray[4]);
                        b.intelligence = Integer.parseInt(dataArray[5]);
                        b.type = Integer.parseInt(dataArray[6]);
                        break;
                }
                boysArray.add(b);
                //boysArray.add(new boys (dataArray[0], Integer.parseInt(dataArray[1]), Integer.parseInt(dataArray[2]), Integer.parseInt(dataArray[3]), Integer.parseInt(dataArray[4]), Integer.parseInt(dataArray[5])));
            }
            
            bufferedReader.close();
        } catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fName + "'");                
        } catch(IOException ex) {
            System.out.println("Error reading file '"+ fName + "'");                  
        }
        
        return boysArray;
}
    
    /**
     * <p>This method retrieves Girls information from girls.dat file and stores info in an ArrayList of Girl object</p>
     * @return ArrayList of Boys Object
     */
    public  ArrayList<Girl> getGirls() {
        ArrayList<Girl> girlsArray = new ArrayList<>();
        fName = "girls.dat";
        String line;
        String [] dataArray;
        try {
            fReader = new FileReader(fName);
            bufferedReader = new BufferedReader (fReader);
            while ((line = bufferedReader.readLine()) != null) {
              
                dataArray = line.split("\\s+");
                Girl b;
                switch (Integer.parseInt(dataArray[5])) {
                    case 1:
                        b = new ChoosyGirl();
                        b.name = dataArray[0];
                        b.status = Integer.parseInt(dataArray[1]);
                        b.attraction = Integer.parseInt(dataArray[2]);
                        b.maint_budget= Integer.parseInt(dataArray[3]);
                        b.intelligence = Integer.parseInt(dataArray[4]);
                        b.type = Integer.parseInt(dataArray[5]);
                        b.criteria = Integer.parseInt(dataArray[6]);
                        break;
                    case 2:
                        b = new NormalGirl();
                        b.name = dataArray[0];
                        b.status = Integer.parseInt(dataArray[1]);
                        b.attraction = Integer.parseInt(dataArray[2]);
                        b.maint_budget= Integer.parseInt(dataArray[3]);
                        b.intelligence = Integer.parseInt(dataArray[4]);
                        b.type = Integer.parseInt(dataArray[5]);
                        b.criteria = Integer.parseInt(dataArray[6]);
                        break;
                    default:
                        b = new DesperateGirl();
                        b.name = dataArray[0];
                        b.status = Integer.parseInt(dataArray[1]);
                        b.attraction = Integer.parseInt(dataArray[2]);
                        b.maint_budget= Integer.parseInt(dataArray[3]);
                        b.intelligence = Integer.parseInt(dataArray[4]);
                        b.type = Integer.parseInt(dataArray[5]);
                        b.criteria = Integer.parseInt(dataArray[6]);
                        break;
                }
                girlsArray.add(b);
              
                //girlsArray.add(new Girl (dataArray[0], Integer.parseInt(dataArray[1]), Integer.parseInt(dataArray[2]), Integer.parseInt(dataArray[3]), Integer.parseInt(dataArray[4]), Integer.parseInt(dataArray[5])));
            }
            
            bufferedReader.close();
        } catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fName + "'");                
        } catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fName + "'");                  
        }
        
        return girlsArray;
    }
    
    /**
     * <p>This method retrieves Gifts information from Gifts.dat file and stores info in an ArrayList of Gift object</p>
     * @return ArrayList of Boys Object
     */
    
    public  ArrayList<Gift> getGifts() {
        ArrayList<Gift> giftsArray = new ArrayList<>();
        fName = "gifts.dat";
        String line;
        String [] dataArray;
        try {
            fReader = new FileReader(fName);
            bufferedReader = new BufferedReader (fReader);
            while ((line = bufferedReader.readLine()) != null) {
              
                dataArray = line.split("\\s+");
                Gift b;
                switch (Integer.parseInt(dataArray[2])) {
                    case 1:
                        b = new Gift();
                        b.price = Integer.parseInt(dataArray[0]);
                        b.value = Integer.parseInt(dataArray[1]);
                        b.type = Integer.parseInt(dataArray[2]);
                        break;
                    case 2:
                        b = new LuxuryGift();
                        b.price = Integer.parseInt(dataArray[0]);
                        b.value = Integer.parseInt(dataArray[1]);
                        b.type = Integer.parseInt(dataArray[2]);
                        break;
                    default:
                        b = new UtilityGift();
                        b.price = Integer.parseInt(dataArray[0]);
                        b.value = Integer.parseInt(dataArray[1]);
                        b.type = Integer.parseInt(dataArray[2]);
                        break; 
                }
                giftsArray.add(b);
              
                //girlsArray.add(new Girl (dataArray[0], Integer.parseInt(dataArray[1]), Integer.parseInt(dataArray[2]), Integer.parseInt(dataArray[3]), Integer.parseInt(dataArray[4]), Integer.parseInt(dataArray[5])));
            }
            
            bufferedReader.close();
        } catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fName + "'");                
        } catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fName + "'");                  
        }
        
        return giftsArray;
    }
    /**
     * <p>This method takes array of Boy Object and array of girl object and assign girlfriend and boyfriend and stores that into array of couple object</p>
     * @param g an ArrayList of Girl object
     * @param b an ArrayList of Boy object
     * @return ArrayList of Couple Object
     */
    
    public ArrayList<Couple> make_pair(ArrayList<Girl> g,ArrayList<Boy> b){
        int i;
	int j;
	int max;
	int ind;
        ArrayList<Couple> coupleArray = new ArrayList<>();
	for(i=0;i< g.size();i++){
		if(g.get(i).status == -1){
			max = 0;
			ind = -1;
			switch(g.get(i).criteria){
				case 0 ://att
					for(j=0;j<b.size();j++){
                                            
						if(max < b.get(j).attractiveness && g.get(i).check(b.get(j))==1 && b.get(j).status ==-1 && b.get(j).check(g.get(i))==1){
							max = b.get(j).attractiveness;
							ind = j;
						}
					}
					break;
				case 1 ://rich
					for(j=0;j<b.size();j++){
						if(max < b.get(j).budget && g.get(i).check(b.get(j))==1 && b.get(j).status ==-1 && b.get(j).check(g.get(i))==1){
							max = b.get(j).budget;
							ind = j;
						}
					}
					break;
				case 2 ://inteligent
					for(j=0;j<b.size();j++){
						if(max < b.get(j).intelligence && g.get(i).check(b.get(j))==1 && b.get(j).status ==-1 && b.get(j).check(g.get(i))==1){
							max = b.get(j).intelligence;
							ind = j;
						}
					}
					break;
			}
			
			if(ind != -1){
				g.get(i).status = ind;
				b.get(ind).status = i;
                                Couple c = new Couple();
                                c.b = b.get(ind);
                                c.g = g.get(i);
                                c.final_comptibility(c.g, c.b);
                                coupleArray.add(c);
			}
		}
        }
        return coupleArray;
    }
    
    
    
    /**
     * <p>sorts the array of couple object accordingly</p>
     * @param c Array list of couple object
     * @param type int value if 1 sort according to happiness else according to compatibility 
     */
    public void sort(ArrayList<Couple> c ,int type){
        int i,j;
        int n = c.size();
        Couple temp;
        if(type == 1){
            for(i=0;i< n-1;i++){
                for(j=0;j< n-i-1;j++){
                    if(c.get(j).happiness < c.get(j).happiness ){
                       temp = c.get(j);
                       c.add(j, c.get(j+1));
                       c.add(j+1, temp);

                    }
                }
            }
        }else{
            for(i=0;i< n-1;i++){
                for(j=0;j< n-i-1;j++){
                    if(c.get(j).compatibility < c.get(j).compatibility ){
                       temp = c.get(j);
                       c.add(j, c.get(j+1));
                       c.add(j+1, temp);

                    }
                }
            }
        }
         
    }
    
    
}
