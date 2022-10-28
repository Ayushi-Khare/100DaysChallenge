```java
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        List<Boolean>extra=new ArrayList<>();
        int max=maxcandy(candies);
        for(int i=0; i<candies.length; i++)
        {
            if(candies[i]+extraCandies>=max)
            {
                extra.add(true); //adding true in list 
            }//condition to check if the sum of value and the extra number is greater than or equal to max
            else
            {
               extra.add(false); //adding false in list
            }
        }
        return(extra);
    }
  //Function to calculate the maximum number
    int maxcandy(int[] candy)
    {
        int max=0;
        for(int i=0; i<candy.length; i++)
        {
            if(candy[i]>max)
            {
                max=candy[i];
            }
        }
        return(max);
    }
}
```
