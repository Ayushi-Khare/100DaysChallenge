```java
class Solution {
    public int heightChecker(int[] heights) {
        int sort[]=heights.clone();
        heights=sorting(heights);
        int count=0;
        for(int i=0; i<heights.length; i++)
        {
            if(sort[i]!=heights[i])
            {
                count++;
            }//if the elements of both arrays are not matching the counter increases
        }
        return(count);
    }
    //sorting the array in increasing order
    int [] sorting(int[] h)
    {
        for(int i=0; i<h.length-1; i++)
        {
            int pos=i;
            for(int j=i+1; j<h.length; j++)
            {
                if(h[j]<h[pos])
                {
                    pos=j;
                }
            }
            int temp=h[pos];
            h[pos]=h[i];
            h[i]=temp;
        }
        return(h);
    }
}
```
