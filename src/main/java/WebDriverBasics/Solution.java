package WebDriverBasics;

import java.util.Arrays;

public class Solution {
	
	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	
	    public int solution(int[] A) {
	    	        Arrays.sort(A);     
	    	        int min = 1; 
	    	        int cap = A.length; //for efficiency — no need to calculate or access the array object’s length property per iteration 

	    	        for (int i = 0; i < cap; i++){
	    	            if(A[i] == min){
	    	                min++;
	    	            }
	    	        }   
	    	        //min = ( min <= 0 ) ? 1:min; //this means: if (min <= 0 ){min =1}else{min = min} you can also do: if min <1 for better efficiency/less jumps
	    	        return min;    
	    	    }
	    		public static void main(String[] args) {
	    		int b[] = {1 ,4 ,5, 2,  7} ;
		Solution sol = new Solution();
		System.out.println(sol.solution(b));
	}

}
