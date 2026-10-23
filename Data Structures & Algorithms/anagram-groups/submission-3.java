class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strMap = new HashMap<>();
        for(String str:strs){
            String key = getCanonicalKey(str);
            // System.out.println(str + " -> " + key);
            strMap.putIfAbsent(key, new ArrayList<String>());
            strMap.get(key).add(str);
        }
        
        return new ArrayList<>(strMap.values());
    }

    public String getCanonicalKey(String str){
        int[] freq = new int[26];
        char[] ch = str.toCharArray();
        for(char c:ch){
            freq[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int num:freq){
            sb.append(num).append('#');
        }
        return sb.toString();
    }
}
