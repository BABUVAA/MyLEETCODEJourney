package WaterBottles2;

public class waterBottlesII {
    
    private static int maxBottleDrunkBasic(int numBottles, int numExchange) {
        int max=0;
        int empty=0;
        while(numBottles>0||numExchange<empty)
        {
            max+=numBottles;
            empty+=numBottles;
            numBottles=0;
            while(empty>=numExchange)
            {
                numBottles++;
                empty-=numExchange;
                numExchange++;
            }          
        }
    return max;
    }
    public static void main(String[] args) {
        int FullBottles=19;
        int numExchange=6;
       System.out.println(maxBottleDrunkBasic(FullBottles,numExchange));
    }

    
}
