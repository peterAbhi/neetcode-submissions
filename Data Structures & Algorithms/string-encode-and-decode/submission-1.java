class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String stri:strs){
            str.append(stri.length()).append("#").append(stri);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<String>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#')j++;
            int length=Integer.valueOf(str.substring(i,j));
            i=j+1+length;
            decoded.add(str.substring(j+1,i));
        }
        return decoded;
    }
}
