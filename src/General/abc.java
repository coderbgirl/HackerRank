package General;

import java.util.HashMap;

public class abc {
    public static void main(String[] args) {

    	int [][] input = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
    	System.out.println(highFive(input));
        
    }
    
    public static int[][] highFive(int[][] items) {
        
        HashMap<Integer, student> map = new HashMap<>();
        
        for(int i = 0 ; i< items.length; i++){
            
        	if(map.containsKey(items[i][0])) {
        		student s = map.get(items[i][0]);
        		
        		if(s.count < 5) {
        			s.totalScore = s.totalScore + items[i][1];
            		s.count = s.count + 1;
            		if(s.min > items[i][1])
            			s.min = items[i][1];
            		map.put(items[i][0], s);
        		}else {
        			if(s.min < items[i][1]) {
        				s.totalScore = s.totalScore + items[i][1] - s.min;
        				s.min = items[i][1];
                		map.put(items[i][0], s);
        			}
        		}
        		
        		
        		
        	}else {
        		map.put(items[i][0], new student(items[i][1],items[i][1],1));
        	}
            
        }
        
        int[][] out = new int [map.size()][2];
        int ind = 0;
        for(int key: map.keySet()) {
        	student s = map.get(key);
        	out[ind][0] = key;
        	out[ind][1] = s.totalScore/s.count;
        	ind++;
        }
        return out;
    }
    
}
class student {
    
    int totalScore;
    int min;
    int count;
    
    public student (int totalScore,int min,int count ) {
    	
    	this.totalScore = totalScore;
    	this.min = min;
    	this.count = count;
    }
    
}