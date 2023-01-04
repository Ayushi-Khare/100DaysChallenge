class Solution {
    public int findGCD(int[] nums) {
      int max = maxval(nums);
      int min = minval(max,nums);
      int gcd=0;
      for(int i=1; i<=max; i++)
      {
          if(min%i==0 && max%i==0)
          {
              gcd=i;
          }
      } 
      return gcd;
    }
    int maxval(int n[])
    {
        int max=0;
        for(int i=0; i<n.length; i++)
        {
            if(max < n[i])
            {
                max = n[i];
            }
        }
        return max;
    }
    int minval (int m, int n[])
    {
        for(int i=0; i<n.length; i++)
        {
            if(m>n[i])
            {
                m=n[i];
            }
        }
        return m;
    }
}
