class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> entries = new HashMap<>();
        for(String str:strs){
            int count[] = new int[26];
            for(char c:str.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            if(!entries.containsKey(key)){
                entries.put(key,new ArrayList<>());
            }
            entries.get(key).add(str);
        }
        return new ArrayList<>(entries.values());
    }
}
