
class rotate {
    public void rotatenum(int[] nums, int k) {
        int n=nums.length;
        int num[] = new int[n];
        for(int i=0;i<n;i++)
        {
            num[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=num[i];
        }
    }
}