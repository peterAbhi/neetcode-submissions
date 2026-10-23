class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sStr = s.toCharArray();
        char[] tStr = t.toCharArray();
        Arrays.sort(sStr);
        Arrays.sort(tStr);
        if(sStr.length!=tStr.length) return false;
        else {
            for(int i=0;i<sStr.length;i++){
                if(sStr[i]!=tStr[i]) return false;
            }
        }
        return true;
    }
}
