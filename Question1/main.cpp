#include<iostream>
#include<stdlib.h>
#include"indata.h"
#include"setdata.h"

using namespace std;

int main(){

	
	int i ;
	int nog = rand() %100 + 25;
	int nob = rand()%100 +200;
	//int nog = rand() %5 +4;
	//int nob = rand()%5 +14;
	
	girl g[nog];
	boy b[nob];

	fill_data(nob,nog);
	set_data(g,b,nob,nog);	
	
	jodi_maker(g,b,nob,nog);
	
	for(i=0;i<nog;i++){
		//printf("hii");
		if(g[i].status != -1){
			cout << g[i].name << "  " << b[g[i].status].name <<endl;
		}
	}

	
}
