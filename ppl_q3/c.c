#include<stdio.h>
int main(){
	FILE * fp;
	int r1,r,i;
	fp = fopen("gifts.dat","w");
	for(i=0;i<100;i++){
		r = rand();
		r1 = rand();
		//fprintf(fp,"%s%d %d %d %d %d %d %d\n","girl",i,-1,(i+25)%10+1,r%2000+2000,r1%10+10,r1%3+1,r%3+1);
		fprintf(fp,"%d %d %d\n",r%100+300,r1%100+200,r%3+1);
	}
	fclose(fp);
	return 0;
}
