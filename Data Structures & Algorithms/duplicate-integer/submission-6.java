class Solution {
    public boolean hasDuplicate(int[] nums) {
           
           Set<Integer> set = new HashSet<>();

            for (int number = 0; number < nums.length; number++){
            
            if(!set.contains(nums[number])){
               set.add(nums[number]);
            }else
            if (set.contains(nums[number])){
                return true;
            }
        }
        
        return false;
       
    }
}