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
    public static void main(String[] args) {
       // int [] nums={9,6,4,2,3,5,7,0,1};
       int [] nums={0,1}; 
       int missing=missingNumberBruteforce(nums);
        System.out.println(missing);
    }

    
}
