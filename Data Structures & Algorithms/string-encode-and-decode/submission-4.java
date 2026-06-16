class Solution {

    public String encode(List<String> strs) {
        String encodedString = "";
        for(String item: strs){
            encodedString += item.length()+"#"+item;
        }
        return encodedString;
    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            result.add(str.substring(j + 1, i));
            

        }
        return result;
    }
}
