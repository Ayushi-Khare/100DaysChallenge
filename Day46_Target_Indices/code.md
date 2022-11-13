```java
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> newlist = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++)
        {
            if(target>=nums[i])
            {
                if(nums[i]==target)
                {
                    newlist.add(i); //adding elements in list
                }
            }
            else
            {
                break;
            }
        }
        return(newlist);
    }
}
```
