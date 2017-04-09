package ppl_q4;

import java.io.*;
import java.util.ArrayList;
import classes.Girl;
import classes.Boy;
import classes.*;

/**
 * <h1>Function Class </h1>
 * <p> It provides all the method for calculation of happiness,gift distribution assigning new boyfriend </p>
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
     * <p>This method assigns gift basket to couples and calculate happiness of girl, boys and of the couple and also compatibility of couple</p>
     * @param gifts ArrayList of Gifts object
     * @param couple Array list of couple object
     * @return 2d ArrayList of Gift Object
     */
    public ArrayList<ArrayList<Gift>> print_gift_basket(ArrayList<Gift> gifts,ArrayList<Couple> couple){
        int i;
        int j;
        ArrayList<ArrayList<Gift>> gift_basket = new ArrayList<>();
        ArrayList<Gift> gif = new ArrayList<>();
        for(i=0;i<couple.size();i++){
            Couple c = couple.get(i);
            switch(c.b.type ){
                case 1:
                    switch (c.g.type) {
                        case 1:
                        {
                            gif.clear();
                            Miser b1 = (Miser)c.b;
                            ChoosyGirl g1 = (ChoosyGirl)c.g; 
                           for(j=0;j<gifts.size() && b1.check_gift(g1, gifts.get(j))==1;j++){
                                g1.Calculate_happiness(gifts.get(j).price);
                                gif.add(gifts.get(j));
                                //gift_basket.get(i).add(gifts.get(j));
                            }
                            gift_basket.add(gif);
                            c.gifts = gif;
                            c.happiness = g1.final_happiness()+b1.final_happiness();
                            break;
                        }
                        case 2:
                            {
                                gif.clear();
                                Miser b1 = (Miser)c.b;
                                NormalGirl g1 = (NormalGirl)c.g; 
                                for(j=0;j<gifts.size() && b1.check_gift(g1, gifts.get(j))==1;j++){
                                    g1.Calculate_happiness(gifts.get(j).price);
                                    gif.add(gifts.get(j));
                                }
                                gift_basket.add(gif);  
                                c.gifts = gif;
                                c.happiness = g1.final_happiness()+b1.final_happiness();
                                break;
                            }
                        case 3:
                            {
                                gif.clear();
                                Miser b1 = (Miser)c.b;
                                DesperateGirl g1 = (DesperateGirl)c.g; 
                                for(j=0;j<gifts.size() && b1.check_gift(g1, gifts.get(j))==1;j++){
                                    g1.Calculate_happiness(gifts.get(j).price);
                                    gif.add(gifts.get(j));
                                }
                                gift_basket.add(gif);
                                c.gifts = gif;
                                c.happiness = g1.final_happiness()+b1.final_happiness();
                                break;
                            }
                        default:
                            break;
                    }
                    break;
                case 2:
                    Generous b1 = (Generous)c.b;
                     switch (c.g.type) {
                        case 1: 
                            gif.clear();
                            ChoosyGirl g1 = (ChoosyGirl)c.g;
                            for(j=0;j<gifts.size() && b1.check_gift(gifts.get(j))==1;j++){
                                g1.Calculate_happiness(gifts.get(j).price);
                                gif.add(gifts.get(j));
                            }
                            gift_basket.add(gif);
                            c.gifts = gif;
                            c.happiness = 2*g1.final_happiness();
                            break;
                        case 2:
                            
                            NormalGirl g2 = (NormalGirl)c.g; 
                            gif.clear();
                            for(j=0;j<gifts.size() ;j++){
                                if( b1.check_gift(gifts.get(j))==1){
                                    g2.Calculate_happiness(gifts.get(j).price);
                                     
                                    gif.add(gifts.get(j));
                                }
                            }
                            gift_basket.add(gif);
                            c.gifts = gif;
                            
                            c.happiness = 2*g2.final_happiness();
                            break;
                    
                        case 3:
                            gif.clear();
                            DesperateGirl g3 = (DesperateGirl)c.g; 
                            for(j=0;j<gifts.size() && b1.check_gift(gifts.get(j))==1;j++){
                                g3.Calculate_happiness(gifts.get(j).price);
                                gif.add(gifts.get(j));
                            }
                            gift_basket.add(gif);
                            c.gifts = gif;
                            c.happiness = 2*g3.final_happiness();
                            break;
                    
                        default:
                            break;
                    }
                    break;
                case 3:
                    Geeks b3 = (Geeks)c.b;
                     switch (c.g.type) {
                        case 1: 
                            gif.clear();
                            ChoosyGirl g1 = (ChoosyGirl)c.g;
                            for(j=0;j<gifts.size() && b3.check_gift(gifts.get(j))==1;j++){
                                g1.Calculate_happiness(gifts.get(j).price);
                                gif.add(gifts.get(j));
                            }
                            
                            for(;j<gifts.size();j++){
                                if(gifts.get(j).type==2 && b3.check_luxury(gifts.get(j))==1){
                                    g1.Calculate_happiness(gifts.get(j).price);
                                    gif.add(gifts.get(j));
                                    break;
                                }
                            }
                            gift_basket.add(gif);
                            c.gifts = gif;
                            c.happiness = g1.final_happiness()+b3.final_happiness(g1);
                            break;
                        case 2:
                            gif.clear();
                            NormalGirl g2 = (NormalGirl)c.g; 
                            for(j=0;j<gifts.size() && b3.check_gift(gifts.get(j))==1;j++){
                                g2.Calculate_happiness(gifts.get(j).price);
                                gif.add(gifts.get(j));
                            }
                            for(;j<gifts.size();j++){
                                if(gifts.get(j).type==2 && b3.check_luxury(gifts.get(j))==1){
                                    g2.Calculate_happiness(gifts.get(j).price);
                                    gif.add(gifts.get(j));
                                    break;
                                }
                            }
                            gift_basket.add(gif);
                            c.gifts = gif;
                            c.happiness = g2.final_happiness()+b3.final_happiness(g2);
                            break;
                    
                        case 3:
                            gif.clear();
                            DesperateGirl g3 = (DesperateGirl)c.g; 
                            for(j=0;j<gifts.size() && b3.check_gift(gifts.get(j))==1;j++){
                                g3.Calculate_happiness(gifts.get(j).price);
                                gif.add(gifts.get(j));
                            }
                            for(;j<gifts.size();j++){
                                if(gifts.get(j).type==2 && b3.check_luxury(gifts.get(j))==1){
                                    g3.Calculate_happiness(gifts.get(j).price);
                                    gif.add(gifts.get(j));
                                    break;
                                }
                            }
                            gift_basket.add(gif);
                            c.gifts = gif;
                            c.happiness = g3.final_happiness()+b3.final_happiness(g3);
                            break;
                    
                        default:
                            break;
                    }
                    
            }
            
        }
        return gift_basket;
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

    /**
     * <p>Assigns new boyfriend to the girls of k least happy couple </p>
     * @param coupleArray ArrayList of Couple object 
     * @param boyArray ArrayList of Boy object
     * @param giftArray ArrayList of Girl object
     * @param k number of couple who are going throw break up 
     */
    public void assignNew(ArrayList<Couple> coupleArray, ArrayList<Boy> boyArray, ArrayList<Girl> giftArray, int k) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        sort(coupleArray,1);
        System.out.println("OLD BF     NEW BF ");
        int n = coupleArray.size();
        int i,max,ind,j;
        Girl g ;
        Boy b;
        for(i=n-1;i>= n-1-k;i--){
            ind = -1;
            g = coupleArray.get(i).g;
            g.status = -1;
            b = coupleArray.get(i).b;
            System.out.printf("%s\t",b.name);
            b.status = -2;
        
		if(g.status == -1){
			max = 0;
			ind = -1;
			switch(g.criteria){
				case 0 ://att
					for(j=0;j<boyArray.size();j++){
                                            
						if(max < boyArray.get(j).attractiveness && g.check(boyArray.get(j))==1 && boyArray.get(j).status ==-1 && boyArray.get(j).check(g)==1){
							max = boyArray.get(j).attractiveness;
							ind = j;
						}
					}
					break;
				case 1 ://rich
					for(j=0;j<boyArray.size();j++){
						if(max < boyArray.get(j).budget && g.check(boyArray.get(j))==1 && boyArray.get(j).status ==-1 && boyArray.get(j).check(g)==1){
							max = boyArray.get(j).budget;
							ind = j;
						}
					}
					break;
				case 2 ://inteligent
					for(j=0;j<boyArray.size();j++){
						if(max < boyArray.get(j).intelligence && g.check(boyArray.get(j))==1 && boyArray.get(j).status ==-1 && boyArray.get(j).check(g)==1){
							max = boyArray.get(j).intelligence;
							ind = j;
						}
					}
					break;
			}
                }
			
			if(ind != -1){
                            Couple c = new Couple();
                            c.g = coupleArray.get(i).g;
                            c.b = boyArray.get(ind);
                            c.g.status = 100;
                            c.b.status = 100;
                            coupleArray.get(i).b = boyArray.get(ind);
                            c.final_comptibility(c.g, c.b);
                            coupleArray.add(i,c);
			}
                System.out.println(coupleArray.get(i).b.name);
         
        }
  
    }
    
    
}
