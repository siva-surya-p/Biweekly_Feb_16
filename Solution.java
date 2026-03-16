import java.util.*;

class Solution {
    public int solve(ArrayList<String> words) {
        int max = Integer.MIN_VALUE;
        boolean flag = false;
        for(int i = 0;i<words.size();i++){
            HashSet<Character> set = new HashSet<>();
            for(char c: words.get(i).toCharArray()){
                set.add(c);
            } 
            for(int j = i+1;j<words.size();j++){
                flag = false;
                for(char c : words.get(j).toCharArray()){
                  if(set.contains(c)){
                    flag = true;
                   break;   
                  }  
                }
                if(!flag){
                max = Math.max(max, words.get(i).length() * words.get(j).length());
                System.out.println(i + " max" +  max); 
                }
            
            }
        }
        return max;
    }
}
