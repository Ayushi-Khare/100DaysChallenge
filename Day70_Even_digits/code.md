```java
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++)
        {
            if(countn(nums[i])%2==0)
            {
                count++;
            }//calling count function and checking if the size of the digit is even or not
        }
        return count;
    }
    int countn(int n)
    {
        int count=0;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        return count;
    }//function to count the size of digit
}
```
