```java
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=0, rem=0;
        if(s.length()%k==0)
        {
            n=s.length()/k;
            rem=0;
        } //to check if length is divisible by k
        else
        {
            n=(s.length()/k)+1;
            rem=s.length()%k;
        } //if not, the remainder is added to the length of array
        String arr[]=new String[n];
        String str = "";
        int pos=0;
        for(int i=0; i<s.length(); i++)
        {
            str+=s.charAt(i);
            if(str.length()==k)
            {
                arr[pos]=str;
                str="";
                pos++;
            }//elements are added when the string length is equal to k
            else if(i==s.length()-1 && str.length()!=k)
            {
                for(int j=str.length(); j<k; j++)
                {
                    str+=fill;
                }
                arr[pos]=str;
            }//the remaining string will be added to the last index of array
        }
        return arr;
    }
}
```
