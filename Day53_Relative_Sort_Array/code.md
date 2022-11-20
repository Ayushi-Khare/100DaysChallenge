```java
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int pos=0;
        for(int i=0; i<arr2.length; i++)
        {
            for(int j=0; j<arr1.length; j++)
            {
                if(arr1[j]==arr2[i])
                {
                    int temp=arr1[pos];
                    arr1[pos]=arr1[j];
                    arr1[j]=temp;
                    pos++;
                }
            }
        }
        if(pos!=arr1.length-1)
        {
            arr1=sort(arr1,pos);
        }
        return(arr1);
    }
    int[] sort(int arr[],int pos)
    {
        for(int i=pos; i<arr.length-1; i++)
        {
            int min=i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return(arr);
    }
}
```
