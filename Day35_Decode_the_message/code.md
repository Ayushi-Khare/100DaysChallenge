```java
class Solution {
    public String decodeMessage(String key, String message) {
        String str=unique(key);
        String decode=findind(str,message);
        return(decode);
    }
    //function to create a unique character string from the given key
    String unique(String s)
    {
        String str="";
        for(int i=0; i<s.length(); i++)
        {
            if((!str.contains(String.valueOf(s.charAt(i)))) && s.charAt(i)!=' ')
          {
                str=str+s.charAt(i);
          }
        }
        return(str);
    }
    //function to decode the given message
    String findind(String str, String msg)
    {
        String s="";
        String alpha="abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<msg.length(); i++)
        {
            for(int j=0; j<str.length(); j++)
            {
               if(msg.charAt(i)==str.charAt(j))
               {
                   s=s+(alpha.charAt(j));
               }
                else if ((msg.charAt(i)==' ') && (j==str.length()-1))
              {
                    s=s+' ';
                }
            }
        }
        return(s);
    }
}
```
