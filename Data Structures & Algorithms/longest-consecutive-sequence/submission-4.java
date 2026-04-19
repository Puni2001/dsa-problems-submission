class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n: nums){
            set.add(n);
        }
        int longest = 0;
        for (int num : set){
            if (!set.contains(num-1)){
                int curr = num;
                int streak = 1;
                while (set.contains(curr+1)){
                    curr++;
                    streak++;
                }
                longest = Math.max(streak, longest);
            }
        }
        return longest;
    }
}
