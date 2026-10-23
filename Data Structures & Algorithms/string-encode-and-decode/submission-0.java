class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        Integer len = 0;
        for(String str:strs){
            len = str.length();
            encoded.append(len.toString()).append("#").append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<String>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#')
                j++;
            int length = Integer.valueOf(str.substring(i,j));
            i=j+1+length;
            decoded.add(str.substring(j+1,i));
        }
        return decoded;
    }
}