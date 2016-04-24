#include <stdio.h>

void moveZeros(int* nums, int numsSize)
{
	int* p1 = nums;
	int* p2 = p1 + 1;
	while(p2 - nums < numsSize)
	{
		if(*p1 == 0 && nums[p2] != 0){
        		int tmp = nums[p2];
        		nums[p2] = nums[p1];
        		nums[p1] = tmp;
        	}else if(nums[p1] != 0 && nums[p2] == 0){
        		p1++; p2++;
        	}else if(nums[p1] != 0 && nums[p2] != 0){
        		p1 += 2; p2 += 2;
        	}else{
        		p2++;
        	}
	}
}

int main()
{
	
}
