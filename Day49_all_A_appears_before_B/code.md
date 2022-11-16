```java
class Solution
{
    public boolean checkString(String s)
    {
        boolean check=false;
        if(s.length()==1 || (!s.contains(String.valueOf('b'))) || (!s.contains(String.valueOf('a'))))
        {
            check=true;
        }//check if length is 1
        else
        {
            int count_a=counta(s);
            int count_b=countb(s);
            if(count_a<count_b)
            {
                check=true;
            }//if A's last position is less than B then true, else false 
        }
        return(check);
    }
    //function to check last position of A
    int counta(String str)
    {
        int pos=0;
        for(int i=str.length()-1; i>=0; i--)
        {
            if(str.charAt(i)=='a')
            {
                pos=i;
                break;
            }
        }
        return(pos);
    }
    //function to check last position of B
    int countb(String str)
    {
        int pos=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='b')
            {
                pos=i;
                break;
            }
        }
        return(pos);
    }
}
```
