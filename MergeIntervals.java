import java.util.*;

public class MergeIntervals {

    public static void main(String[] args) {

        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int[] current=intervals[0];

        for(int i=1;i<intervals.length;i++){

            if(intervals[i][0]<=current[1])
                current[1]=Math.max(current[1],intervals[i][1]);
            else{
                System.out.println(Arrays.toString(current));
                current=intervals[i];
            }
        }

        System.out.println(Arrays.toString(current));
    }
}