class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++)
        {
            int flag=0;
            for(int j=0; j<nums.length; j++)
            {
                if(j!=i && nums[j]==nums[i])
                {
                    flag=1;
                    break;
                }//unique elements checking
            }
            if(flag==0)
            {
                sum+=nums[i];
            }//Adding the unique elements
        }
        return sum;
    }
}
