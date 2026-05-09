class Solution {
    public int rob(int[] nums) {

        int[] Tracker1 = new int[nums.length-1];
        int[] Tracker2 = new int[nums.length-1];
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }

        int round1 = 0;
        int round2 = 0;

        Tracker1[0] = nums[0];
        Tracker1[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length - 1; ++i){
            Tracker1[i] = Math.max(nums[i] + Tracker1[i-2],Tracker1[i-1]);
        }
        round1 = Tracker1[nums.length - 2];

        Tracker2[0] = nums[1];
        Tracker2[1] = Math.max(nums[1], nums[2]);

        for(int i = 2; i < nums.length-1; ++i){
            Tracker2[i] = Math.max(nums[i+1] + Tracker2[i-2], Tracker2[i-1]);
        }

        round2 = Tracker2[nums.length - 2];


        return Math.max(round1, round2);

    }
}