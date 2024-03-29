package leetcode.TWOSUM;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static int[] twoSumBruteForce(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(i==j)
                    continue;
                if((nums[i]+nums[j])==target)
                    return new int[]{i,j};
            }
        }
        return null;        
    }

    public static int[] twoSumOptimal(int[] nums, int target) {
        Map<Integer,Integer>complementIndex=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {       
            int complement=target-nums[i];
            if(complementIndex.containsKey(complement))
            {
                return new int[]{complementIndex.get(complement),i};
            }           
           complementIndex.put(nums[i],i);         
        }
        return null;        
    }

    public static void main(String[] args) {
        int[] nums={3,5,8,6,7};
        //int []solution=twoSumOptimal(nums, 14);
        int []solution=twoSumOptimal(nums, 14);
        for (int i : solution) {
            System.out.print(i+" ");
        }


    }
}
