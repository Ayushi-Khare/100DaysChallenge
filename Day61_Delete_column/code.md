```java
class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        for(int i=0; i<strs[0].length(); i++) //column index loop
        {
            int flag=0;
            for(int j=0; j<strs.length-1; j++)  //row loop
            {
                for(int k=j+1; k<strs.length; k++)   //row loop
                {
                    if((int)strs[j].charAt(i) > (int)strs[k].charAt(i)) //condition to check if the columns are sorted or not
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag==1)
                {
                    break;
                }
            }
            if(flag==1)
            {
                count++;
            }
        }
        return(count);
    }
}
```
