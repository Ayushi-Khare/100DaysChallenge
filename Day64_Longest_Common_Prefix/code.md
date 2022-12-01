```java
class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        int l = 1, min=strs[0].length();
        String str="";
        int flag=0;
        while(l<strs.length)
        {
            if (strs[l].length()<min)
            {
                min=strs[l].length();
            }
            l++;
        }//to find the minimum length
        
        for(int i=0;i<min;i++)
        {
            for(int j=0;j<strs.length-1;j++)
            {
                if (strs[j].charAt(i)!=strs[j+1].charAt(i))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                str=str+strs[0].charAt(i);
            }
        }//loop to check the prefix of the elements in array
        return str;
    }
}
```
