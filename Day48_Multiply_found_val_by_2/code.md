```java
class Solution {
    public int findFinalValue(int[] nums, int original) {
        int flag=0;
        Arrays.sort(nums);
        while(flag==0)
        {
            if(find(nums,original)==0)
            {
                flag=1;               
            }//to check if the number is present in the given array or not
            else
            {
                original*=2;
            }//multiply the number by 2
        }
        return(original);
    }
    //function to find the element iin array
    int find(int n[], int target)
    {
        int flag=0;
        for(int i=0; i<n.length; i++)
        {
            if(n[i]==target)
            {
                flag=1;
            }
        }
        return(flag);
    }
}
```
