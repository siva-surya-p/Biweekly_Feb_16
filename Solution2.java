import java.util.*;

class Solution2 {
    int solve(ArrayList<Integer> nums, int k) {
      PriorityQueue<Integer> q = new PriorityQueue<>();
      for(int i = 0;i<nums.size();i++){
          q.add(nums.get(i));
          while(q.size() > k){
              q.poll();
          }
      }
      return q.poll();
    }
}
