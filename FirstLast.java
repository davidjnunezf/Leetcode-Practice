//Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

//Your algorithm's runtime complexity must be in the order of O(log n).

//If the target is not found in the array, return [-1, -1].

class FirstLast {
    public int[] searchRange(int[] nums, int target) {
      int counter=0;
      int start=-99;
      int end=-99;
      int [] array= new int[2];
        for(int i=0;i<nums.length; i++){
          if(nums[i]==target){
              if(counter==0){
                start=i;  
                counter++;
              }
              else if(counter>0){
                    end=i;
                    counter++;
                }
              
          }
          
      }
        
        if(end==-99 && start==-99){
            array[0]=-1;
            array[1]=-1;
        }
        else if(start!=-99 & end==-99){
              array[0]=start;
            array[1]=start;
        }
        else{
              array[0]=start;
            array[1]=end;
        }
            return array;
        
    }
}
