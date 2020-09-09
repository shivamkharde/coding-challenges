/*

Date -> 09-09-2020

link to question ->https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

*/

/**
 * RepeatedString
 */
public class RepeatedString {

    public static void main(String[] args) {
        // custom input 
        String s = "aba";
        long n = 10;
        String newString = s;
        long repeated = 0;
        long totalOcurrence = 0;
        
        if(s.length() == 1 && s.charAt(0) == 'a'){
            totalOcurrence = n;
        }else if(s.length() > n){
            int count = 0;
            for (int i = 0; i < n; i++) {
                if(s.charAt(i) == 'a'){
                    count++;
                }
            }
            totalOcurrence = count;
        }else if(s.length()>1){
            long repeatLen = (n-s.length());
            long noOfTimesToRepeatDiv = (repeatLen / s.length());
            long noOfTimesToRepeatRem = (repeatLen % s.length());
            // find occurrence of a in given string
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'a'){
                    repeated++;
                }
            }
            // assign totalOcurrnce with 'a' ocuurence count of given string 
           
            totalOcurrence = repeated + noOfTimesToRepeatDiv * repeated;
    
            long remOcurrenceCount = 0;
            // count occurence of 'a' in remainder part of string
            for (int i = 0; i < noOfTimesToRepeatRem; i++) {
                if(s.charAt(i) == 'a'){
                    remOcurrenceCount ++;
                }
            }
            totalOcurrence = totalOcurrence+remOcurrenceCount;
        }else{
            totalOcurrence = 0;
        }
        System.out.println(totalOcurrence);
    }
}