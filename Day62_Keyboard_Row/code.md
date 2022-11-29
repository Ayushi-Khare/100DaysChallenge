```java
class Solution {
    public String[] findWords(String[] words) {
        String kb[] = new String[]{"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
        String f = "";
        for(int i=0; i<words.length; i++)
        {
            int flag=0;
            int pos = check(words[i].charAt(0), kb); //calling function check that returns the array index of kb in which the character appears
            if(pos>-1)
            {
                for(int j=0; j<words[i].length(); j++)
                {
                    if(!kb[pos].contains(String.valueOf(words[i].charAt(j)).toUpperCase()))
                    {
                        flag=1;
                        break;
                    }//condition to check if all the characters appear in the same index or not
                }
                if(flag==0)
                {
                    f = f+words[i] + "-";
                }   
            }
        }
        if(f.length()>0)
        {
            String out[] = f.split("-");
            return(out);
        }
        else
        {
            String out[] = new String[0];
            return(out);
        }
        
    }
    //Function to check index in which the character appears
    int check(char ch, String kb[])
    {
        int pos=-1;
        for(int i=0; i<kb.length; i++)
        {
            if(kb[i].contains(String.valueOf(ch).toUpperCase()))
            {
                pos=i;
                break;
            }
        }
        return pos;
    }
}
```
