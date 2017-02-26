#include<iostream>
#include<stdlib.h>
#include"indata.h"
#include "gift.h"
#include"setdata.h"
#include "gift_distribution.h"


using namespace std;

int main(){

	
	int i,j,k ;
	//int nog = rand() %100 +200;
	//int nob = rand()%100 +600;
	int nog = rand() %5 +4;
	int nob = rand()%5 +14;
	
	girl g[nog];
	boy b[nob];

	fill_data(nob,nog);
	set_data(g,b,nob,nog);	
	
	jodi_maker(g,b,nob,nog);
	int nofc = 0;
	for(i=0;i<nog;i++){
		//printf("hii");
		if(g[i].status != -1){
			nofc++;
		}
	}

	couple commited[nofc+1];
	int z = 0;
	for(i=0;i<nog;i++){
		//printf("hii");
		if(g[i].status != -1){
			commited[z].c_girl = g[i];
			commited[z].c_boy = b[i];
			commited[z].c_girl.happiness = 0;
			commited[z].c_boy.happiness = 0;
			commited[z].compatibility = 0;
			commited[z].compatibility = 0;
			commited[z].total_happiness = 0;
			z++;
			
		}
	}

	gift Gift[2*nog];
	for(i=0;i<2*nog;i++){
		Gift[i].type = rand()%3;
		if(Gift[i].type == 0){
			Gift[i].price = rand()%1000 +50;
			Gift[i].price = rand()%100 + 500;
			Gift[i].luxury_rating = -1;
			Gift[i].diff_to_obt = -1;
			Gift[i].utility_value = -1;
			Gift[i].utility_class = -1;
			
		}
		if(Gift[i].type == 1){
			Gift[i].price = rand()%1000 +50;
			Gift[i].price = rand()%100 + 500;
			Gift[i].luxury_rating = rand()%1000 + 100;
			Gift[i].diff_to_obt = rand()%10;
			Gift[i].utility_value = -1;
			Gift[i].utility_class = -1;
			
		}
		if(Gift[i].type == 2){
			Gift[i].price = rand()%1000 +50;
			Gift[i].price = rand()%100 + 500;
			Gift[i].luxury_rating = -1;
			Gift[i].diff_to_obt = -1;
			Gift[i].utility_value = rand()%1000 +100;
			Gift[i].utility_class = rand()%1000+100;
			
		}
	
	}

	for(i=0;i<nofc;i++){
		cout << commited[i].c_girl.name << " " << commited[i].c_boy.name<<endl;
	}

	gift_distribution(commited,Gift,nofc,2*nog);

	int k = rand()%(nofc/2) +2;	
	for(i=0;i<k;i++){
		int max = 0;
		int ind = -1;
		for(j = 0;j<nofc;j++){
			if(max < commited[j].total_happines){
				max = commited[j].total_happines;
				ind = j;		
			}
		}
		cout << commited[ind].c_girl.name << " "  << commited[ind].c_boy.name << endl;
		commited[ind].total_happiness = -1;
	}	
	
	
}
