/*

Date -> 11-08-2020

link to question ->https://www.hackerrank.com/challenges/counting-valleys/problem
*/

/**
 * CountingValleys
 */
public class CountingValleys {

    public static void main(String[] args) {
        // custom input

        int n = 8;//no of steps he hike
        String s = "DDUUDDUDUUUD"; //how he hike 

        int altitude=0;
        int count=0;
        // here we just have to count how many times we are at the sea level
        for(char c : s.toCharArray()) {
            // Step up
            if(c == 'U') {
                if(altitude == -1) {
                    count++;
                }
                altitude++;
            }
            // Step down
            else {
                altitude--;
            }
        }

        System.out.println(count);
        // return count;
    }
}