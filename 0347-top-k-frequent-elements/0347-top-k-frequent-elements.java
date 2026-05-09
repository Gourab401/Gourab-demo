import java.util.Map;
class Solution {
    
    public int[] topKFrequent(int[] nums, int k) {
		Map<Integer,Integer> Frequency=new HashMap<>();
		for(int data:nums) {
			Frequency.put(data,Frequency.getOrDefault(data, 0) +1);
		}
        List<int[]> frest= new ArrayList<>();
        for(Map.Entry<Integer,Integer>x:Frequency.entrySet()){
            frest.add(new int[]{x.getKey(),x.getValue()});
        }
        frest.sort((a,b)->b[1]-a[1]); //sorting in decending order
        int[] output=new int[k];
        for(int i=0;i<k;++i){
            output[i]=frest.get(i)[0];
        }

		return output;
    }
}