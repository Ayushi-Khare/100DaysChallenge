class Solution {
    public boolean areNumbersAscending(String s) {
        int digit=0;
        int flag=0;
        for(int i=0; i<s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                String str="";
                while(i<s.length() && s.charAt(i)!=' ' )
                {
                    if(Character.isDigit(s.charAt(i)))
                    {
                        str+=s.charAt(i)+"";
                    }
                    i++;
                }
                if(str.length()>0 && Integer.parseInt(str)>digit)
                {
                    digit = Integer.parseInt(str);
                    System.out.println(digit);
                }
                else
                {
                    flag = 1;
                    break;
                }
            }
        }
        if(flag==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
