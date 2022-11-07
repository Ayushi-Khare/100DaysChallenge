```java
class Solution {
    public boolean judgeCircle(String moves) {
      int ud[]=new int[4];
      for (int i=0; i<moves.length(); i++)
 {
 if(moves.charAt(i)=='U')
       {
           ud[0]+=1;
       }
else if(moves.charAt(i)=='D')
       {
           ud[1]+=1;
       }
else if(moves.charAt(i)=='L')
       {
           ud[2]+=1;
       }
else
       {
           ud[3]+=1;
       }
     }//the loop will count all the directions taken by the robot
   if (ud[0]==ud[1] && ud[2]==ud[3])
   {
        return (true);
    }//condition to check if the number of directions are equal
   else
   {
        return (false);
   }
   }
}
```
