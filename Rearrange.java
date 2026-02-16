// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
 

class Rearrange {
    public static void main(String[] args) {
        System.out.println(rev("Leetcode makes me happy"));
    }
    
    public static String rev(String s){
        TreeMap<Integer,List<String>> map  = new TreeMap<>();

        for(String str : s.split(" ")){
            int length = str.length();
            if(!map.containsKey(length)){
                map.put(length, new ArrayList<>());
            }
            map.get(length).add(str.toLowerCase());
        }

        StringBuilder result = new StringBuilder();

        for(Map.Entry<Integer,List<String>> entry : map.entrySet()){   
            for(String st : entry.getValue()){
                result.append(st).append(" ");
            }
        }
        String res  =result.toString().trim();
        if(res.length() > 0){
            res = Character.toUpperCase(res.charAt(0)) + res.substring(1);
        }
        return res;
    }
}
