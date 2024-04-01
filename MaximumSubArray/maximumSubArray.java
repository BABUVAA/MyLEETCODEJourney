package MaximumSubArray;

public class maximumSubArray {
    
    static int approach1(int[]nums)
    {   int n=0;
        for (int i = 0; i <= nums.length; i++) {
            n+=i;
        }
        int[][]subArr=new int[n][nums.length];
            for (int k = 0; k < nums.length; k++) {
               
                for (int i = 0; i<nums.length; i++) {
                    for (int j = k; j <=i; j++) {
                        subArr[k][j]=nums[j];
                        System.out.print(nums[j]+",");
                    }System.out.println();
        
                }        
               
            }
           

         
        for (int i = 0; i < subArr.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print("0-");
            }System.out.println();
        }

        return 0;  
    }
    



    public static void main(String[] args) {
       //int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
       int[] nums = {-2,1,-3};

       approach1(nums);
    }

}