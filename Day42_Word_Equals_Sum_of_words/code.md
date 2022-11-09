```java
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        if((count(firstWord))+(count(secondWord)) == (count(targetWord)))
        {
            return(true);
        }//condition to check if the string is equal to sum of the given 2 strings
        else
        {
            return(false);
        }
    }
    //function to return the numerical value of the string
    int count(String word)
    {
        String str="";
        for(int i=0;i<word.length();i++)
        {
            str=str+(((int)word.charAt(i))-97); //converts the string to ascii code and adds into new string
        }
        int x = Integer.valueOf(str); //converting new string to integer value
        return(x);
    }
}
```
