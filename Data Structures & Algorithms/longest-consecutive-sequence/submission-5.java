class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for(int num: nums){
            set.add(num);
        }

        if(set.isEmpty()) return 0;
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
