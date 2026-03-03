public class buyAndSell {
    public static int buy(int[] nums){
        int max = 0;
        int min = Integer.MAX_VALUE;
         for(int  i =0;i<nums.length;i++){
            if(min>nums[i]) min = nums[i];
            else max = Math.max(max,nums[i]-min);
            System.out.println("result"+max);
        }
        return max;
    }
    public static void main(String[] args){
        System.out.println(buy(new int[]{7,1,5,3,6,4}));
    }
}
