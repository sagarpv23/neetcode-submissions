class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        TreeSet<Integer> set = new TreeSet<>();

        for(int num: nums){
            set.add(num);
        }

        if(set.size() == 1) return 1;

        int longest = 1;
        int currentLongest = 1;
        Integer prevValue = null;

        for(Integer value: set){
            if(prevValue != null) {
                if (value - prevValue == 1) {
                    currentLongest += 1;
                    if (currentLongest > longest) {
                        longest = currentLongest;
                    }
                } else {
                    currentLongest = 1;
                }
            }
            prevValue = value;


        }
        return longest;

    }
}
