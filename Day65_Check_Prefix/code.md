```java
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String str[] = sentence.split(" ");
        int flag=-1;
        for(int i=0; i<str.length; i++)
        {
            if(str[i].contains(searchWord))
            {
                String s="";
                for(int j=0; j<searchWord.length(); j++)
                {
                    s+=str[i].charAt(j);
                }//loop to extract prefix string
                if(s.equals(searchWord))
                {
                    flag=i+1;
                    break; 
                }//to check if extracted prefix is equal to the target prefix
            }//to check if the array element consists of the target string
        } 
        return flag;
    }
}
```
