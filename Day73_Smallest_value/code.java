class Solution {
    public int smallestEqual(int[] nums) {
        int min=max(nums);
        int flag=0;
        for(int i=0; i<nums.length; i++)
        {
            if(i%10==nums[i])
            {
                flag=1;
                min = i;
                break;
            }
        }
        if(flag==0)
        {
            min=-1;
        }
        return min;
    }
    //to check the maximum value
    int max(int[] n)
    {
        int m=0;
        for(int j=0; j<n.length; j++)
        {
            if(n[j]>m)
            {
                m=n[j];
            }
        }
        return m;
    }
}
