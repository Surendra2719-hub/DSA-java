class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<intervals.length;i++){
            list.add(intervals[i]);
        }
        list.add(newInterval);

        list.sort((a, b) -> a[0] - b[0]);
        List<int[]> ans = new ArrayList<>();
        int start = list.get(0)[0];
        int end = list.get(0)[1];

        for (int i=1; i<list.size(); i++) {
            if(end>=list.get(i)[0]){
                if(list.get(i)[1]>end){
                    end=list.get(i)[1];
                }
            }
            else{
                ans.add(new int[]{start, end});
                start = list.get(i)[0];
                end = list.get(i)[1];

            }
        }
        ans.add(new int[]{start, end});

        return ans.toArray(new int[ans.size()][]);
    }
}