#include<iostream>

class girl{
	public:
		char name[20];
		int attractiveness;
		int maintenance_budget;
		int intelligence;
		int ceiterion;
		int status;
		
		bool check(int budget){
			if(budget < maintenance_budget){
				return false;
			}			
			else
				return true;
			
		}

		
};
