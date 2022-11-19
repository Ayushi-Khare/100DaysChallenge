```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++)
        {
            nums[i]=nums[i]*nums[i]; //Square of each element
        }
        Arrays.sort(nums); //sorting the array
        return(nums);
    }
}
```
