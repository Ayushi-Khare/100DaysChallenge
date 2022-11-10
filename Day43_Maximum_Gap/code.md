```java
class Solution {
    public int maximumGap(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        if(nums.length>1)
        {
            for(int i=0; i<nums.length-1;i++)
            {
                if(max<(nums[i]-nums[i+1]))
                {
                    max=nums[i]-nums[i+1];
                }//if nums[i] is greater than nums[i+1] and max is less than difference of max[i]-max[i+1]
                else if(max<(nums[i+1]-nums[i]))
                {
                    max=nums[i+1]-nums[i];
                }//if nums[i+1] is greater than nums[i] and max is less than difference of max[i+1]-max[i]
            }
        }
        return(max);
    }
}
```
