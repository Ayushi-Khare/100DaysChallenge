'''java
class Solution {
    public char repeatedCharacter(String s) {
        String str1="";
        int min = s.length()-1;  //min stores the index of duplicate letter
        for(int i=0; i<s.length(); i++)
      {
          if(!str1.contains(String.valueOf(s.charAt(i))))
         {
             for(int j=i+1; j<s.length(); j++)
             {
                 if(s.charAt(i)==s.charAt(j))
               {
                  if(j<min)
                  {
                      min = j;
                  }//if the location of duplicate character is earlier than the previous redundant character, value of min will change 
               }
             }
             str1= str1+s.charAt(i); //str1 stores all the unique characters of string s
         }//condition to check if str1 contains character of s, if yes, that means the character is repeated, else str1 will update and store the newly appeared character
      }
        return(s.charAt(min));
    }
}
'''
