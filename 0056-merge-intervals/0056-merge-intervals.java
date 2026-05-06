class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(a-> a[0])); //sorting interval assending order respect to start time

        int CurrentStart=intervals[0][0];
        int CurrentEnd=intervals[0][1];
        List<int[]> MergeInterval=new ArrayList<>();

        for(int i=1;i<intervals.length;++i){
            int NextStart=intervals[i][0];
            int NextEnd=intervals[i][1];
            if(CurrentEnd<NextStart){
                MergeInterval.add(new int[]{CurrentStart,CurrentEnd});
                CurrentStart=NextStart;
                CurrentEnd=NextEnd;
            }
            else{
                CurrentEnd=Math.max(CurrentEnd,NextEnd);
            }
        }
            MergeInterval.add(new int[]{CurrentStart,CurrentEnd});
            
        
        return MergeInterval.toArray(new int[MergeInterval.size()][]);
    }
}