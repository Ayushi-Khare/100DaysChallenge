```java
class Solution {
    public String sortSentence(String s) {
        String arr[] = new String[count(s)];
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if ((Character.getNumericValue(s.charAt(i)) >= 0) && ((Character.getNumericValue(s.charAt(i)) <= 9))) {
                arr[Character.getNumericValue(s.charAt(i)) - 1] = str;
                str = "";
                i++;
            } else {
                str = str + s.charAt(i);
            }
        }
        s = convert(arr);
        return (s);
    }

    int count(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                c++;
            }
        }
        return (c + 1);
    }

    String convert(String a[])
    {
        String s="";
        for(int i=0; i<a.length; i++)
        {
            s=s+a[i]+" ";
        }
        return(s.trim());
    }
}

```
