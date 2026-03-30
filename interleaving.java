import java.io.*;
import java.util.*;


class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s3.length() == 0) return true;
        int k = 0;
        ArrayList<Character> arr = new ArrayList<>();
        // int i = 0;
        int j = 0;
        for(int i= 0;i<Math.min(s1.length(),s2.length());i++){
            arr.add(s1.charAt(i));
            arr.add(s2.charAt(i));
        } 
        if(s1.length()!=s2.length() && s1.length()>s2.length()){
              k= s2.length();
            for(j = k;j<s1.length();j++){
                arr.add(s1.charAt(j));
            }
        }
        else if(s1.length() != s2.length() && s2.length()> s1.length()){
            k= s2.length();
            for(j = k;j<s2.length();j++){
                arr.add(s2.charAt(j));
            }
        }
        // int k= 0;
        int z = 0;
        System.out.println(arr);
        int a  =0;
        int b  = 1;
        while(k<s3.length()){
            if(s1.charAt(a) == s3.charAt(k)){
                a++;
                k++;
            }
            // else if()
        }
        
        return true;
    }
    private void swap(ArrayList<Integer> list, int x,int y){
        int temp = list.get(x);
        // list.set(y) = 
    }
}
        // while(k<s3.length()){
        //     // if(s3.charAt(k) == arr.get(z)){
        //     //     k++;z++;
        //     // }
        //     // else if()
        //     // char sOne = s1.charAt(i);
        //     // char sTwo = s2.charAt(j);
        //     // char sK = s3.charAt(k);
            
        //     // if(sOne == sK){
        //     //     while(i<s1.length() && s1.charAt(i) == s3.charAt(k)){
        //     //         i++;k++;
        //     //     }
        //     // }
        //     // else if(sTwo == sK){
        //     //     while(j<s2.length() && s2.charAt(i) == s3.charAt(k)){
        //     //         j++;k++;
        //     //     }
        //     // }
         
