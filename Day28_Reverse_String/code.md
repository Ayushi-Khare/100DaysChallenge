```Java
class Solution {
    public void reverseString(char[] s) {
        for(int i=0,j=s.length-1; i<s.length/2; i++)
        {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
        }//i loop iterating from first index, j loop iterating from last index, where ith and jth index elements are swapping
    }
    
}
```
