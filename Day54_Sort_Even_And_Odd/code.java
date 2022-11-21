class Solution {
    public int[] sortEvenOdd(int[] nums) {
        nums = sort(nums, 0, nums.length-2);
        nums = sort(nums, 1, nums.length-1);
        return(nums);
    }
    int[] sort(int[] nums, int pos, int end)
    {
        for(int i=pos; i<end; i+=2)
        {
            int min=i;
            for(int j=i+2; j<nums.length; j+=2)
            {
                if(pos == 0)
                {
                    if(nums[min]>nums[j])
                    {
                        min=j;
                    }
                }
                else
                {
                   if(nums[min]<nums[j])
                    {
                        min=j;
                    } 
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        return(nums);
    }
}
