/*

Date -> 28-07-2020

link to question ->https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?h_r=next-challenge&h_v=zen

*/

/**
 * DivisibleSumPairs
 */
public class DivisibleSumPairs {

    public static void main(String[] args) {
        // custom input
        int n = 6;//array size
        int divisor = 3;//divisor
        int array[] = new int[]{1,3,2,6,1,2};//array to check
        int count = 0;//how many pairs are divisible by divisor
        // iterate over an array
        for(int i=0;i<array.length;i++){
            for(int j=1;j<=array.length-1;j++){
                // check if i<j and sum of ar[i]+ar[j] is divisible by divisor that is given
                if((i<j) && (array[i]+array[j])%divisor == 0){
                    count++;
                }
            }
        }
        System.out.println(count);

        // return count;
    }
}