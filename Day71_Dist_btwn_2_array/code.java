class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) 
    {
        int count=0;
        for(int i=0; i<arr1.length; i++)
        {
            int flag=0;
            for(int j=0; j<arr2.length; j++)
            {
                int x=arr1[i]-arr2[j]; 
                if(x<0)
                {
                    x=x*(-1);
                }

                if(x<=d)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                count++;
            }
        }
        return(count);   
    }
}
