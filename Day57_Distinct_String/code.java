class Solution {
    public String kthDistinct(String[] arr, int k) {
        String str="";
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            int loc=search(arr, i, arr[i]);
            if(loc==arr.length)
            {
                count++;
            }
            
            if(count==k)
            {
                str=arr[i];
                break;
            }
        }
        return(str);
    }
    int search(String[] arr, int pos, String ch)
    {
        int i=0;
        for(i=0; i<arr.length; i++)
        {
            if(arr[i].equals(ch) && i!=pos)
            {
                break;
            }
        }
        return(i);
    }
}
