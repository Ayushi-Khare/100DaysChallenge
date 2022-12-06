class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums1.length; i++)
        {
            if(check(nums2, nums1[i], list)==true || check(nums3, nums1[i], list)==true)
            {
                list.add(nums1[i]);
            }
        }
        for(int j=0; j<nums2.length; j++)
        {
            if(check(nums3,nums2[j],list)==true)
            {
                list.add(nums2[j]);
            }
        }
        return list;
    }
    boolean check(int n[], int x, List<Integer> l)
    {
        for(int i=0; i<n.length; i++)
        {
            if(x==n[i] && (!l.contains(x)))
                return true;
        }
        return false;
    }
}
