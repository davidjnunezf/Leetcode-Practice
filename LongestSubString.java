//Given a string, find the length of the longest substring without repeating characters.

class LongestSubString{
    public int lengthOfLongestSubstring(String s) {
     int max=0;
     int [] repeat= new int[256];    
     String subString="";

        for(int i=1; i<=s.length(); i++){
           repeat=resetRepeat(repeat);
            subString=s.substring(0,i);
            boolean key=true;
            for(int x=0; x<subString.length(); x++){
                repeat[subString.charAt(x)]++;
                if(repeat[subString.charAt(x)]>1){
                 key=false;
                 break;   
                }
            }
            if(subString.length()>max && key){
                max=subString.length();
            }
        }
        return max;
        }
        
        
        
        
        
        public int [] resetRepeat(int array[]){
        for(int i=0; i<array.length; i++){
            array[i]=0;
        }
            return array;
        }
    }
    
