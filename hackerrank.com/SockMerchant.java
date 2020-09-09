
import java.util.*;

/*

Date -> 07-08-2020

link to question ->https://www.hackerrank.com/challenges/sock-merchant/problem
*/

public class SockMerchant {

    public static void main (String []src){

        // custom input
        int ar[] = new int[]{1,2,1,2,1,3,2};//array of colors
        int n = 9;//size of array

        // starts here
        List<Integer> parsable = new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            if(parsable.contains(ar[i])){
                continue;
            }else {
                parsable.add(ar[i]);
            }
        }
        System.out.println(parsable);
        int count =0;
        int totalPairs = 0;
        for (int i = 0; i < parsable.size(); i++) {
            int val = parsable.get(i);
            for (int j = 0; j < ar.length; j++) {
                
                if(val == ar[j]){
                    count++;
                }
            
            }
            // System.out.println(count);
            if(count < 2){
                
            }else if(count % 2 == 0){
                // System.out.println(totalPairs);
                totalPairs = totalPairs + (count/2);
            }else if((count-1) % 2 == 0){
                // System.out.println(totalPairs);
                totalPairs = totalPairs + ((count-1)/2);
            }
            count =0;
        }
        System.out.println(totalPairs);
        // return totalPairs;
    }
}