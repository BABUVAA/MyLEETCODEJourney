package ThreeSum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class threeSum {
      private static List<List<Integer>> threeSumBrute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    if((nums[i]+nums[j]+nums[k])==0)
                    {
                      List<Integer> ls=new ArrayList<>();
                      ls.add(nums[i]);
                      ls.add(nums[j]);
                      ls.add(nums[k]);
                      Collections.sort(ls);
                        if(!result.contains(ls))
                        {
                          result.add(ls);
                        }
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {   
      List<List<Integer>> result=  threeSumBrute(new int[]{-1,1,2,4,-2,-2,3,-3,-4}); 
      for (List<Integer> list : result) {
        for (int k : list) {
          System.out.print(k+",");
        }System.out.println();
      }
    }
}
