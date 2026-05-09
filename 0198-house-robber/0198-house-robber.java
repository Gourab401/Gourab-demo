class Solution {
    public int rob(int[] nums) {
        int[] track=new int[nums.length];
        if(nums.length==1){
            return nums[0];
        }
        track[0]=nums[0];
        track[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;++i){
            track[i]=Math.max(nums[i]+track[i-2],track[i-1]);
        }
        return track[track.length-1];
    }
}