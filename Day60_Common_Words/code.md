```java
class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count=0;
        for(int i=0; i<words1.length; i++)
        {
            if(check1(words1, i, words1[i])==0) //returns 0 when word is distinct in words1 array
            {
                for(int j=0; j<words2.length; j++)
                {
                    if(words1[i].equals(words2[j])) //to check if the distinct string exists in words2 array
                    {
                        if(check1(words2, j, words2[j])==0) //returns 0 when the string is distinct in words2 array
                        {
                            count++;
                        }
                    }
                }
            }
        }
        return(count);
    }
    //function to check if the word is dstinct in the given array
    int check1(String[] word, int pos, String s)
    {
        for(int i=0; i<word.length; i++)
        {
            if(s.equals(word[i]) && i!=pos)
            {
                return 1;
            }
        }
        return 0;
    }
}
```
