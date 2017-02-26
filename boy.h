#include<iostream>
class boy{
	public:
		char name[20];
		int attractiveness;
		int intelligence;
		int budget;
		int min_attractiveness;
		int status;

		bool check(int a){
			if(a < min_attractiveness)
				return false;
			else 
				return true;
		}

};
