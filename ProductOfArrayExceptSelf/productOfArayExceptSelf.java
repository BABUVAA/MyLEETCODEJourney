package ProductOfArrayExceptSelf;

public class productOfArayExceptSelf {
    public static int[] productExceptSelfBruteForce(int[] nums) {
        int[]answer=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int product=1;
            for(int j=0;j<nums.length;j++)
            {
                if(i==j)
                    continue;
                product*=nums[j];
            }
            answer[i]=product;
        }
            return answer;
    }

    public static int[] productExceptSelfOptimal(int[] nums) {
        int[]suffix=new int[nums.length];
        int[]prefix=new int[nums.length];
        int[]solution=new int[nums.length];
      //prefix part
        prefix[0]=1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i]=prefix[i-1]*nums[i-1];
        }
      //suffix part  
        suffix[nums.length-1]=1;
        for (int i = nums.length-2; i >=0; i--) {
            suffix[i]=nums[i+1]*suffix[i+1];
        }
       //solution part
       for (int i = 0; i < solution.length; i++) {
        solution[i]=suffix[i]*prefix[i];
       }
        return solution;
    }

    public static int[] productExceptSelfMoreOptimal(int[] nums) {
      
        int[]solution=new int[nums.length];
       
      //prefix part
        solution[0]=1;
        for (int i = 1; i < nums.length; i++) {
            solution[i]=solution[i-1]*nums[i-1];
        }
      //suffix part  
        int suffix=1;
        for (int i = nums.length-2; i >=0; i--) {
            suffix=nums[i+1]*suffix;
            solution[i]=solution[i]*suffix;
            }
      
        return solution;
    }    
    public static void main(String[] args) {
        productExceptSelfMoreOptimal(new int[]{1,2,3,4,5});
    }
}
/*
 * {1,2,3,4,5}
 * [1,1,2,6,24] prefix
 * [120,60,20,5,1] suffix
 * [120,60,40,30,24] p*s
 */