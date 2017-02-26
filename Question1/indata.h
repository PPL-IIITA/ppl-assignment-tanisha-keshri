#include<iostream>
#include<stdlib.h>
#include<stdio.h>
void fill_data(int nob,int nog){
		char *name;
		int a;
		int b;
		int c;
		int d;
		char data;
		name = (char*)malloc(11*sizeof(char));
		
		int no_of_girls = nog;
		int no_of_boys = nob;
		FILE *fp1,*fp2;
		fp1 = fopen("girl_data.txt","w");
		int i,j;
		for(i=0;i<no_of_girls;i++){
			//name = (char*)malloc(10*sizeof(char));
			for(j=0;j<10;j++){
			name[j] = rand()%26 + 65;
				
			}
			name[j] = '\0';
			a = rand()%10 ;
			b = rand()%4000 + 6000;
			c = rand()%10;
			d = rand()%3;
	
			fprintf(fp1,"%s %d %d %d %d \n",name,a,b,c,d);
		
		
		}
		fclose(fp1);
		fp2 = fopen("boy_data.txt","w");
		for(i=0;i<no_of_boys;i++){
		//name = (char*)malloc(10*sizeof(char));
			for(j=0;j<10;j++){
				name[j] = rand()%26 + 65;
			
			}
			name[j] = '\0';
			a = rand()%10 ;
			c = rand()%10;
			b = rand()%5000 + 9000;
			int e = rand()%5;
	
			fprintf(fp2,"%s %d %d %d %d\n",name,a,c,b,e);
		
			
		}
		fclose(fp2);
}
	

