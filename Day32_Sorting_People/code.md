```java
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int h[]=new int[heights.length];
        System.arraycopy(heights,0,h,0,h.length);//copying elements of height array in h
        Arrays.sort(h);
        int p=0,pos=0;
        for(int i=h.length-1; i>=0; i--)
        {
            pos=findp(h[i],heights);
            String temp = names[p];
            names[p]=names[pos];
            names[pos]=temp; //sorting the names array
            
            int temp1=heights[p];
            heights[p]=heights[pos];
            heights[pos]=temp1; //sorting the heights array
            p++;
        }
        return(names);
    }
    //function to find the position of the element
    int findp(int num, int h[])
    {
        for(int i=0; i<h.length; i++)
        {
            if(num==h[i])
            {
                num=i;
                break;
            }
            
        }
        return(num);
    }
}
```
