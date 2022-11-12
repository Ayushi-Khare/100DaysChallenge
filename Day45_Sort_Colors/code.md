```java
class Solution {
    public void sortColors(int[] nums) {
        for(int i=0; i<nums.length-1; i++)
        {
            int pos=i;
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[pos]>nums[j])
                {
                    pos=j;
                }//checks the minimum value
            }
            int temp=nums[pos];
            nums[pos]=nums[i];
            nums[i]=temp;
        }
    }
}
```
