class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int [nums1.length];
        for(int i=0; i<nums1.length; i++)
        {
            int flag=-1;
            for(int j=0; j<nums2.length-1; j++)
            {
                if(nums2[j]==nums1[i])
                {
                    int k=j+1;
                    while(k<nums2.length && flag==-1)
                    {
                        if(nums1[i]<nums2[k])
                        {
                            flag=nums2[k];
                        }
                        k++;
                    }
                    break;
                }
            }
            arr[i]=flag;
        }
        return arr;
    }
}
