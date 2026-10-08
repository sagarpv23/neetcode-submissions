class Solution {
public:
    std::unordered_map<char, int> map;
    bool isAnagram(string s, string t) {
        if (s.length() != t.length()) return false;

        for(char ch : s) {
            map[ch]++;
        }

        for(char ch : t) {
            map[ch]--;
            if (map[ch] < 0) return false;    
        }
        return true;
    }
};
