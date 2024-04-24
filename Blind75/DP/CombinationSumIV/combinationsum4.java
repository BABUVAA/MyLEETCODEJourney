package Blind75.DP.CombinationSumIV;

import java.util.HashMap;

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

//SECOND APPROACH USING MEMOIZATION
public static int combinationSumIV(int nums[],int target)
{
    return combinationSum4Opt(nums,target,new HashMap<>());
}


    public static int combinationSum4Opt(int[] nums, int target,HashMap<Integer,Integer> hashMap) {

        //BASE CASES
        if(target == 0 || target < 0)
        {
            return 0;
        }

        //RETURN BASE CASE FOR REPETETION
        if(hashMap.containsKey(target))
        {
            return hashMap.get(target);
        }

        //TOTAL WAYS TO  REACH TARGET SUM
        int ways=0;
        for(int num : nums)
        {        
            int subTarget=target-num;
              // IF SUBTARGET GRATER THAN ZERO MEANS WE NEED TO CALL OUR FUNCTION AGAIN
            if(subTarget>0)
                   ways=ways+combinationSum4Opt(nums,subTarget,hashMap);
                
                  //IF SUBTARGET BECOMES ZERO MEANS WE GOT ONE SOLUTION SO WEE ADD UP OUR WAYS    
           if(subTarget==0)
            ways++;
        }

    //STORING WAYS FOR A TARGET CASE SO NEXT TIME WE DONT HAVE TO REPEAT SAME PROCESS
    hashMap.put(target,ways);
    return hashMap.get(target);
        
    }


//DRIVER CODE
    public static void main(String[] args) {
        

       int[] nums = {1,2,3};
       int target = 4;
        System.out.println(combinationSum4(nums,target)+ " - "+System.currentTimeMillis());  
        System.out.println(combinationSumIV(nums,target)+ " - "+System.currentTimeMillis());
    }
    
}
