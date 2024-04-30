package LongestIncreasingSubSequence;

public class liss {
    
    private static int max(int a, int b){return a>b?a:b;}
private static int longestIncreasingSubSequenceLISS(int []nums,int length,int start,int prev)
{
int longest=1;

for(int i =0;i<nums.length;i++)
    {
        int index=i;
        int prevIndex=i;
        int longe=1;
        for(int j=i;j<nums.length;j++)
        {
            if(nums[j]>nums[index])
             {
                longe++;
                prevIndex=index;
                index=j;
                System.out.print(nums[j]+",");
             }               
            if(nums[j]<nums[index]&&nums[j]>nums[prevIndex])
            {
                index=j;
            }
           
        }
       
    }

    return longest;
}
    public static int lengthOfLIS(int[] nums) {
       int []T= new int[nums.length];
    
       //Start main pointer
       for (int i = 1; i < nums.length; i++) {
        
            //Start second pointer
            for (int j = 0; j < nums.length; j++) {
                
                if(nums[i]>nums[j])
                    if(T[j]+1 > T[i])
                        T[i]=T[j]+1;
            }
       }
       
       int maxIndex=0;
       for (int i = 0; i < T.length; i++) {
        if(T[i]>T[maxIndex])
            maxIndex=i;
       }

       return T[maxIndex]+1;
    }


    public static void main(String[] args) {
       int[] nums ={5,7,-24,12,13,2,3,12,5,6,35};

       System.out.println(lengthOfLIS(nums));
    }
}
