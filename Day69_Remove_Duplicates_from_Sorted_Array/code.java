class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int count=0; 
        for(int i=0; i<nums.length; i++)
        {
            if(!list.contains(nums[i]))
            {
                list.add(nums[i]);
                count++;
            }
        }
        int x=0;
        for(int j: list)
        {
            nums[x]=j;
            x++;
        }
        return(count);
    }
}
