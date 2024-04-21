package OtherProblem.CountAlternatingSubArray;

public class countAlternatingSubArray {
    static int countAlternatingSubarrays(int[] nums) {
        
        int altSubArrays=nums.length;
        int plusArray=0;
        int plus=0;
        for(int i=0;i<nums.length-1;i++)
        {
            System.out.println(altSubArrays+"   :    "+plusArray+"  :  "+plus);
           if(nums[i]!=nums[i+1])
           {
               altSubArrays++;
               plusArray+=plus;    
               plus++;
           }
            if(nums[i]==nums[i+1])
            {
                altSubArrays+=plusArray;
                plusArray=0;
            }
        }
        altSubArrays+=(plusArray+plus);
        return altSubArrays;
    
        }
public static void main(String[] args) {
    
    countAlternatingSubarrays(new int[]{1,0,1,0});
}
}
