#include<iostream>
#include "girl.h"
#include"boy.h"
void gift_distribution(couple commited[],gift g[],int nofc,int nofg){
	int i,j;
	
	for(i=0;i<nofc;i++){
		int total_price = 0;
		int total_value = 0;
		int total_lux_price=0;
		
				for(j=0; j<nog ;j++){
					do {
						total_price += g[i].price;
						total_value += g[i].value;
						if(g[j].type == 1){
							total_lux_price = g[i].luxury_rating;
						}
						else if(g[j].type == 2){
							total_value += g[i].utility_value
						}
					}
					while(total_price < commited[i].c_girl.maintenance_budget)
				}	

		switch(commited[i].c_girl.type){
			case 1:
				commited[i].c_girl.happiness = log(total_price);
				break;
			case 2:
				commited[i].c_girl.happiness = total_price + 2*total_lux_price +total_value;
				break;
			case 3:
				commited[i].c_girl.happiness = total_price + total_value;
		}			
		switch(commited[i].c_boy.type){
			case 1:
				commited[i].c_boy.happiness = commited[i].c_boy.budget - total_price;
				break;
			case 2:
				commited[i].c_boy.happiness = commited[i].c_girl.happiness;
				break;
			case 3 :
				commited[i].c_boy.happiness = commited[i].c_girl.intelligence;
				break;
				 		
		}

	}
	
	for(i=0;i<nofc;i++){
		commited[i].total_happiness = commited[i].c_girl.happiness + commited[i].c_boy.happiness.
		commited[i].compatibility =  commited[i].c_boy.budget - commited[i].c_girl.maintenance_budget + abs(commited[i].c_girl.attractiveness - commited[i].c_boy.attractiveness) +  abs(commited[i].c_girl.intelligence - commited[i].c_boy.intelligence); 
	}	

	


}
