```java
class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==letter)
            {
                count++;
            }//counter increases if the ith character is equal to the letter 
        }
        return((count*100)/s.length()); //returns the percentage of the total number of target character found in the string
    }
}
```
