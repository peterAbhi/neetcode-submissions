class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }else{
            List<Character> s1 = new ArrayList<>();
            List<Character> t1 = new ArrayList<>();
            for(int i=0;i<s.length();i++){
                s1.add(s.charAt(i));
            }
            for(int i=0;i<t.length();i++){
                t1.add(t.charAt(i));
            }
            Collections.sort(s1);
            Collections.sort(t1);
            for(int i=0;i<s1.size();i++){
                if(s1.get(i)!=t1.get(i)){
                    return false;
                }
            }
            return true;
        }

    }
}
