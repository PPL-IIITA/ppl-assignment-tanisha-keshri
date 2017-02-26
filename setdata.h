#include<iostream>
#include<fstream>
#include<string>
#include "jodi_maker.h"

void set_data(girl g[],boy  b[],int nob,int nog){
	int i;
	int a,b1,c,d;
	char name[20];
	FILE *fp1;
	fp1 = fopen("girl_data.txt","r");
	for(i=0;i<nog;i++){
		fscanf(fp1,"%s %d %d %d %d",g[i].name,&a,&b1,&c,&d);
		g[i].attractiveness = a;
		g[i].maintenance_budget = b1;
		g[i].intelligence = c ;
		g[i].ceiterion = d;
		g[i].status = -1;
		
	}
	fclose(fp1);

	fp1 = fopen("boy_data.txt","r");
	for(i=0;i<nob;i++){
		fscanf(fp1,"%s %d %d %d %d",b[i].name,&a,&b1,&c,&d);
		b[i].attractiveness = a;
		b[i].intelligence = b1 ;
		b[i].budget = c;
		b[i].status = -1;
		b[i].min_attractiveness = d;
		
	}
	fclose(fp1);
	
}
