#include<iostream>
#include"girl.h"
#include"boy.h"
void jodi_maker(girl g[],boy  b[],int nob,int nog){
	int i;
	int j;
	int max;
	int ind;
	for(i=0;i<nog;i++){
		if(g[i].status == -1){
			max = 0;
			ind = -1;
			switch(g[i].ceiterion){
				case 0 ://att
					for(j=0;j<nob;j++){
						if(max < b[j].attractiveness && g[i].check(b[j].budget) && b[j].status ==-1 && b[j].check(g[i].attractiveness)){
							max = b[j].attractiveness;
							ind = j;
						}
					}
					break;
				case 1 ://rich
					for(j=0;j<nob;j++){
						if(max < b[j].budget && g[i].check(b[j].budget) && b[j].status ==-1 && b[j].check(g[i].attractiveness)){
							max = b[j].budget;
							ind = j;
						}
					}
					break;
				case 2 ://inteligent
					for(j=0;j<nob;j++){
						if(max < b[j].intelligence && g[i].check(b[j].budget) && b[j].status ==-1 && b[j].check(g[i].attractiveness)){
							max = b[j].intelligence;
							ind = j;
						}
					}
					break;
			}
			
			if(ind != -1){
				g[i].status = ind;
				b[ind].status = i;
			}
		}
	}
}
