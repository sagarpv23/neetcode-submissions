class Solution {
public:
    std::unordered_map<int, int> map;
    vector<int> twoSum(vector<int>& nums, int target) {
        for (int i =0; i < nums.size(); i++) {
            int compliment = target - nums[i];

            if(map.find(compliment) != map.end()) {
                return {map[compliment], i};
            }

            map[nums[i]] = i;
        }
        return{};
    }
};
