class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int min=salary[0];
        int max=salary[salary.length-1];
        double sum=0;
        int i=0;
        for(i=1; i<salary.length-1; i++)
        {
            if(salary[i]!=min && salary[i]!=max)
            {
                sum+=salary[i];
            }
        }
        return(sum/(i-1));
    }
}
