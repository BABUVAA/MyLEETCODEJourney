package ContainerWithMostWater;

public class containerWithMostWater {
    public static int containerWithMostWaterBrute(int[] height) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<height.length-1;i++)
        {
            for(int j=i+1;j<height.length;j++)
            {
                if(height[i]<=height[j])
                {
                    max=Integer.max(max,height[i]*(j-i));
                }
                else
                {
                     max=Integer.max(max,height[j]*(j-i));
                }
                
            }
        }
        return max;
    }
    public static int containerWithMostWaterOptimal(int[] height) {
        int max=Integer.MIN_VALUE;
        int start=0,end=height.length-1;
        while(start<end)
        {
            if(height[start]<=height[end])
            {
                max=Integer.max(max,height[start]*(end-start));
                start++;
            }
            else
                {
                    max=Integer.max(max,height[end]*(end-start));
                    end--;
                }
          
        }
        return max;
    }

    public static void main(String[] args) {
        int []nums={1,1};
        int area=containerWithMostWaterBrute(nums);
        int area1=containerWithMostWaterOptimal(nums);
        System.out.println(area1);
    }
    
}
