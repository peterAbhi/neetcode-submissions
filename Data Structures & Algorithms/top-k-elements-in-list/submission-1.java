class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Integer val=0;
        Map<Integer,Integer> counterMap = new HashMap<Integer,Integer>();
        for(Integer num:nums){
            if(!counterMap.containsKey(num)){
                counterMap.put(num,1);
            }else{
                val=counterMap.get(num)+1;
                counterMap.put(num,val);
            }
        }
        List<Integer>[] frequency = new List[nums.length+1];
        for(int i=0;i<frequency.length;i++){
            frequency[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry:counterMap.entrySet()){
            frequency[entry.getValue()].add(entry.getKey());
        }
        int[] sol = new int[k];
        int index=0;
        for(int i=frequency.length-1;i>0 && index<k;i--){
            for(int n:frequency[i]){
                sol[index++]=n;
                if(index==k){
                    return sol;
                }
            }
        }
        return sol;
    }
}
