```java
class Solution {
    public boolean digitCount(String num) {
        String str=Count(num);
        if(num.equals(str))
        {
             return true;
        }//if num and str are equal, this implies the number of occurence of index number is same as given in the string
        else 
        {
           return false;
        }
    }
    String Count(String str)
    {
        String str1="";
        for(int i=0; i<str.length(); i++)
        {
            int count=0;
            for (int j=0; j<str.length(); j++)
            {
                if (i==Integer.parseInt(String.valueOf(str.charAt(j))))
                {
                    count++;
                }//function to check if the index has the same number of occurence as given in the string num 
            }
            str1=str1+count;
        }
     return (str1);
    }
}
```
