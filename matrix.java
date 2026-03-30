import java.io.*;
import java.util.*;

class Solution {
    public int solve(ArrayList<ArrayList<Integer>> arr) {
        int m = arr.size();int n = arr.get(0).size();int i  =0,j = 0;int primary = 0, secondary = 0;
        while(i<m && j<n){
            // System.out.println(primary);
            primary+=arr.get(i++).get(j++);
        }
        System.out.println(primary);
        i = 0;j = n-1;
        while(i>=0 && j>=0){
            // System.out.println(secondary);
            secondary+=arr.get(i++).get(j--);
        }
        System.out.println(secondary);
        return Math.abs(primary-secondary);
    }
}
