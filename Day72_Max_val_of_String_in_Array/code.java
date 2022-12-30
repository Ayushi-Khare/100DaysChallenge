class Solution {
    public int maximumValue(String[] strs) {
        int val=0;
        for(int i=0; i<strs.length; i++)
        {
            if(check(strs[i])==0)
            {
                if(val<Integer.parseInt(strs[i])) 
                {
                    val = Integer.parseInt(strs[i]);
                }//to check if val is less than the numerical digit in index of strs array
            }
            else
            {
                if(strs[i].length()>val)
                {
                    val = strs[i].length();
                }//to check if val is less than the string in strs index
            }
        }
        return val;
    }
    //to check if the string is all digit or not
    int check(String str)
    {
        int flag=0;
        for(int i=0; i<str.length(); i++)
        {
            if(!Character.isDigit(str.charAt(i)))
            {
                flag=1;
                break;
            }
        }
        return flag;
    }
}
