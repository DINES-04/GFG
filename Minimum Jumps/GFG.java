//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr, size));
        }
    }
}

// } Driver Code Ends


class Solution {
    static int minJumps(int[] arr, int n) {
        if (n == 1) return 0; // No jumps needed if the array has only one element
        
        int jump = 0;
        int currstart = 0;
        int currend = 0;

        for (int i = 0; i < n - 1; i++) {
            if (i + arr[i] > currstart) {
                currstart = i + arr[i];
            }
            if (i == currend) {
                jump++;
                currend = currstart;
                
                if (currend >= n - 1) {
                    break; // We have reached or passed the last index
                }
            }
            if (currend == i && arr[i] == 0) {
                return -1; // Current index has a 0, and it's the current end, so we can't proceed further
            }
        }
        
        return currend >= n - 1 ? jump : -1; // If currend reaches or exceeds the last index, return the jumps, otherwise -1
    }
}
