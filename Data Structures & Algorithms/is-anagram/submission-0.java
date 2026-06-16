class Solution {
    public boolean isAnagram(String s, String t) {
        char stringArray1[] = s.toCharArray();
        char stringArray2[] = t.toCharArray();
        Arrays.sort(stringArray1);
        Arrays.sort(stringArray2);
        return Arrays.equals(stringArray1, stringArray2);
    }
}
