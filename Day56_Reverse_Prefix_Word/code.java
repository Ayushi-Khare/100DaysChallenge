class Solution {
    public String reversePrefix(String word, char ch) {
        String str=word;
       int loc=findloc(word,ch);
       if (loc<word.length())
       {
           str="";
           for(int i=loc; i>=0; i--)
           {
            str+=word.charAt(i);
           }
           for(int j=loc+1; j<word.length(); j++)
            {
             str+=word.charAt(j);
            }
       }
        return(str);
    }
    int findloc(String word, char c)
    {
        int i=0;
        for(i=0; i<word.length(); i++)
        {
            if(word.charAt(i) == c)
            {
                break;
            }
        }
      return (i);
    }
}
