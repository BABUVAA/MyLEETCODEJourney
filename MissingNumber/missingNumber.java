package MissingNumber;



public class missingNumber {
    private static int missingNumberBruteforce(int[] nums) {
      for (int i = 0; i <=nums.length; i++) {
        for (int j = 0; j <nums.length; j++) {
                if(nums[j]==i)
                break;
                if(j==nums.length-1)
                return i;         
              }
      }
      return 0;
    }
    private static int missingNumberBetter(int[] nums) {
    int sum=(nums.length*(nums.length+1))/2;

    System.out.println();
    for (int i = 0; i < nums.length; i++) {
        sum-=nums[i];     
    } 
    return sum;
    }

    private static int missingNumberOptimal(int[] nums){
        int sum=0;
                for (int i = 0; i <=nums.length; i++) {
                sum^=i;
                }  
                for (int num : nums) {
                    sum^=num;
                }
        return sum;
    }

    public static void main(String[] args) {
        int [] nums={9,6,4,2,3,5,7,0,1};
      // int [] nums={0,1}; 
       int missing=missingNumberBruteforce(nums);
       int missing1=missingNumberBetter(nums);
       int missing2=missingNumberOptimal(nums);
        System.out.println(missing);
        System.out.println(missing1);
        System.out.println(missing2);
    }
   



   

    
}
