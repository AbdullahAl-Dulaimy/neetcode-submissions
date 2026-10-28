class Solution {
    public boolean hasDuplicate(int[] nums) {
           
           Set<Integer> set = new HashSet<>();

            for (int number = 0; number < nums.length; number++){
            
            if (set.contains(nums[number])){
                return true;
            }
            set.add(nums[number]);
        }
        
        return false;
       
    }
}