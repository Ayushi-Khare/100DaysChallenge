```java
class Solution {
    public boolean halvesAreAlike(String s) {
        int count1=0,count2=0;
        for(int i=0; i<s.length(); i++)
        {
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
           {
              if(i<s.length()/2)
              {
                  count1++;
              }//condition will count the vowels of the first half of the String
              else 
              {
                  count2++;
              }//condition to count the vowels of the second half of the String
           }
        }
        if(count1==count2)
            return true;
        else 
            return false;
    }
}
```
