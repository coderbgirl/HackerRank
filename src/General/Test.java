package General;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test {
	
	
	
	 public static int reverse(int x) {
	        if(x < 0){
	        	System.out.println(Math.pow(2,-31));
	            if(x < Math.pow(2,-31)){
	                return 0;
	            }
	        }else{
	            if(x > (Math.pow(2,31)-1)){
	                return 0;
	            }
	        }
	        
	        int divident = Math.abs(x);
	        int reminder = 0;
	        int quotient = 0; 
	        int newNumber = 0;
	        int length = String.valueOf(Math.abs(x)).length() -1;
	        
	        while(divident != 0){
	            quotient = divident/10;
	            reminder = divident%10;
	            newNumber = (int) (newNumber+  reminder * (Math.pow(10,length)));
	            
	             divident = quotient;
	            length --;
	            
	        }
	        if(x < 0){
	            return newNumber*(-1);
	        }
	        
	        return newNumber;
	        
	    }
	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		int end = height.length -2;
        int minS = height[0];
        int minE = height[end +1];
        int areaR = minS;
        int maxR=0;
        int areaL = minE;
        int maxL =0;
        
        for(int start = 1; start< height.length; start++){
            
            if(height[start] <= minS){
                areaR = areaR + minS; 
            }else{
                if(areaR > maxR){
                    maxR = areaR;
                }
                areaR = height[start];
            }
            
            if(height[end] <= minE){
                areaL = areaL + minE; 
            }else{
                if(areaL > maxL){
                    maxL = areaL;
                }
                areaL = height[end];
            }
            end --;
            
        }
        
        int result = Math.max(maxR, maxL);
		

        System.out.println("result"+ result);
		
	}
}