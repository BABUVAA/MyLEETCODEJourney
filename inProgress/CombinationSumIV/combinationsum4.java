package CombinationSumIV;

public class combinationsum4 {


    //basic approach code;    
    public static int combinationSum4(int[] nums, int target) {
        //base case
        if(target == 0 || target < 0)
            return 0;
        

        //TOTAL WAYS TO  REACH TARGET SUM
        int ways=0;
        
        //SUBTRACTING EACH NUMBER FROM TARGET
        for(int num : nums)
        {

            int subTarget=target-num;

            // IF SUBTARGET GRATER THAN ZERO MEANS WE NEED TO CALL OUR FUNCTION AGAIN
            if(subTarget>0)
                   ways=ways+combinationSum4(nums,subTarget);
             
            //IF SUBTARGET BECOMES ZERO MEANS WE GOT ONE SOLUTION SO WEE ADD UP OUR WAYS       
            if(subTarget==0)
                    ways++;

        }
            return ways;
        
    }


//DRIVER CODE
    public static void main(String[] args) {
        

       int[] nums = {1,2,3};
       int target = 4;
        System.out.println(combinationSum4(nums,target));  
    }
    
}
