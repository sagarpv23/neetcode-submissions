class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap();
        for(int number : nums){
            if(countMap.containsKey(number)){
                return true;
            }
            countMap.put(number, 1);
        }
        return false;
    }
}
