import java.util.*;

class Solution {
    int solve(ArrayList<Integer> nums) {
        if(nums.size()<2) return 1;
        int k  =0;boolean flag= false;int  i = 0;int j =1;int n = nums.size();
         while(i<n && j<n){
             System.out.println(nums + " "+ i+ " "+ j);
            if(!flag && nums.get(i) == nums.get(j)){
                flag =true;i++;j++;
                 
            }
            else if(flag && nums.get(i) == nums.get(j)){
                nums.remove(j);
                n--;
                 
            }
            else if(!flag && nums.get(i) != nums.get(j)){
                flag = false;
                i++;
                j++;
            }
            else{
                flag = false;
                i++;
                j++;
            }
            
        }return j;
    }
}
