```java
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int flag=0,count=0;
        for(int i=0; i<words.length; i++)
            {
            flag = check(words[i],allowed); //function calling
            if(flag==0)
                {
                count++;
                }//count increases if the string is consistent, i.e, flag is 0
            }
        return(count);
    }
    //function to check if the string is consistent string or not
    int check(String s, String all)
        {
        int flag=0;
        for(int i=0; i<s.length(); i++)
            {
            if(!all.contains(String.valueOf(s.charAt(i))))
                {
                flag=1;
                break;
                }//checks if the characters are in allowed string or not
            }
        return(flag);
      }
}
```
