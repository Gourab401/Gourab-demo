class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int BoatCount = 0;
        int LiteWeightPeople = 0;
        int HeavyWeightPeople = people.length-1;
        
        while(LiteWeightPeople <= HeavyWeightPeople)
        {
            if(people[LiteWeightPeople] + people[HeavyWeightPeople] <= limit){
                ++LiteWeightPeople;
            }
            --HeavyWeightPeople;
            ++BoatCount;
        }
        return BoatCount;
    }

}