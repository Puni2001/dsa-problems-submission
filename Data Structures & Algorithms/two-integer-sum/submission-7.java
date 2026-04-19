class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> seen = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int cmp = target - nums[i];
            if (seen.containsKey(cmp)){
                return new int[] {seen.get(cmp),i};
            }
            seen.put(nums[i],i);
        }
        return new int[]{};
    }
}
