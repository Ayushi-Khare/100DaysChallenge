class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(int i=0; i<words.length; i++)
        {
            int flag=0;
            String str="";
            for(int j=0; j<words[i].length(); j++)
            {
                if(j<s.length())
                {
                    if(words[i].charAt(j)!= s.charAt(j))
                    {
                        flag=1;
                        str="";
                        break;
                    }
                }
                str=str+words[i].charAt(j);
            }
            if(flag==0 && words[i].length()<=s.length())
            {
                System.out.println(str);
                count++;
            }
        }
        return count;
    }
}
