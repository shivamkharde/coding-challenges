/*

Date -> 28-07-2020

link to question -> https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

*/

/**
 * BreakingTheRecords
 */
public class BreakingTheRecords {
    public static void main(String[] args) {
        int scores[] = new int[]{3,4,21,36,10,28,35,5,24,42};
        int lengthOfScores = scores.length;
        int highest=scores[0],lowest=scores[0];
        int max=0,low=0;
        for (int i = 1; i <lengthOfScores; i++) {

            if(scores[i]>highest){
                highest = scores[i];
                max++;
            }else if(scores[i]<lowest){
                lowest = scores[i];
                low++;
            }
        }

        System.out.println(max + " " +low);
        // return new int[]{max,low};
    }
}