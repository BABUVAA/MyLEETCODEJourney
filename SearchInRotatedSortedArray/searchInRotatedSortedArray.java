package SearchInRotatedSortedArray;

public class searchInRotatedSortedArray {
    private static int searchInRotatedSortedArrayBruteForce(int[] nums, int target) {
        int result=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                result=i;
        }
        return result;
    }
    private static int searchInRotatedSortedArrayOptimal(int[] nums, int target) {
        int result=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            System.out.println(low+" : "+high);
            int mid=(low+high)/2;
            if(nums[mid]==target)
            return mid;
            if(nums[low]<=nums[mid])
            {   
                    if(target>=nums[low]&&target<nums[mid])
                    high=mid-1;
                    else
                    low=mid+1;
            }
            else
            {
                    if(target>nums[mid]&&target<=nums[high])
                    low=mid+1;
                    else
                    high=mid-1;
            }           
        }
        return result;
    }
    public static void main(String[] args) {
        int[]nums={6,7,0,1,2,3,4,5};
        int target=2;
        int index=searchInRotatedSortedArrayBruteForce(nums,target);
        int index1=searchInRotatedSortedArrayOptimal(nums,target);
        System.out.println(index);
        System.out.println(index1);
    }
    
}
