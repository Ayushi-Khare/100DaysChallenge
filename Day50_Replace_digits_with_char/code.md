```java
class Solution {
    public String replaceDigits(String s) {
        String str="";
        for(int i=0; i<s.length(); i++)
        {
            int num=0;
            if(Character.isDigit(s.charAt(i))==true)
            {
                num=((int)s.charAt(i-1)) + Integer.parseInt(String.valueOf(s.charAt(i)));
                str=str+(char)num;
            }//condition to check if the character is a digit, the respective character will be printed
            else
            {
                str=str+s.charAt(i);
            }
        }
        return(str);
    }
}
```
