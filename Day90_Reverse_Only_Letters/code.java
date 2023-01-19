class Solution {
    public String reverseOnlyLetters(String s) {
        String letter="";
        String s1="";
        letter=rev(s);
        int j=0;
        for(int i=0; i<s.length(); i++)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
            {
                s1+=letter.charAt(j);
                j++;
            }
            else
            {
                s1+=s.charAt(i);
            }
        }
        return s1;
    }
    String rev(String s)
    {
        String letter="";
        for(int i=s.length()-1; i>=0; i--)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
            {
                letter+=s.charAt(i);
            }
        }
        System.out.println(letter);
        return letter;
    }
}
