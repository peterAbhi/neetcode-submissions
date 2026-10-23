class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numCount = new HashSet<Integer>();
        for(Integer num:nums){
            numCount.add(num);
        }
        if(nums.length>numCount.size()){
            return true;
        }
        return false;
    }
}
