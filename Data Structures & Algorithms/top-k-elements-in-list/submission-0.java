class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int value: nums){
            map.put(value, map.getOrDefault(value, 0)+1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = entries.get(i).getKey();
        }

        return result;
    }
}
