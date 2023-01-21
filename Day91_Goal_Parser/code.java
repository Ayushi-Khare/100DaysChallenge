class Solution {
    public String interpret(String command) {
        String str="";
        for(int i=0; i<command.length(); i++)
        {
            if(command.charAt(i)=='(' && command.charAt(i+1)==')')
            {
                str+="o";
                i++;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)=='a' && command.charAt(i+2)=='l' && command.charAt(i+3)==')')
            {
                str+="al";
                i+=3;
            }
            else
            {
                str+=command.charAt(i);
            }
        }
        return str;
    }
}
