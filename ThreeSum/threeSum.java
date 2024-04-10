package ThreeSum;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


//still in progress not solved
public class threeSum {
      private static List<List<Integer>> threeSumBrute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        HashSet<List<Integer>> res=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    if((nums[i]+nums[j]+nums[k])==0)
                    {
                      System.out.println("["+nums[i]+","+nums[j]+","+nums[k]+"]");
                        res.add(List.of(nums[i],nums[j],nums[k]));
                        
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {    
      threeSumBrute(new int[]{-1,1,2,4,-2,-2,3,-3,-4}); 

    }
}
