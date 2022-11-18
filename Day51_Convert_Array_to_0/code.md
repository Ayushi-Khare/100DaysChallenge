```java
class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        while(count(nums)!=0)
        {
            int min1 = min(nums);
            for(int i=0; i<nums.length; i++)
            {
                if(nums[i]!=0)
                {
                    nums[i]-=min1;                
                }
            }
            c++;
        }
        return(c);
    }
    int min(int nums[])
    {
        int min=nums[0];
        for(int i=1; i<nums.length; i++)
        {
            if((min>nums[i] && nums[i]!=0) || (min==0 && nums[i]>0))
            {
                min=nums[i];
            }
        }
        return(min);
    }
    int count(int nums[])
    {
        int flag=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>0)
            {
                flag=1;
                break;
            }
        }
        return(flag);
    }
}
```
