import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*

Date -> 07-08-2020

link to question ->https://www.hackerrank.com/challenges/bon-appetit/problem
*/

public class BonAppetit {

    public static void main(String []src){

        // custome input
        Integer ar[] = new Integer[]{3,10,2,9};
        List<Integer> bill = new ArrayList<Integer>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);


        int k = 1;//item that did not eaten
        int n = 4;//total item eaten
        int b = 12;//total bill calculated 

        // first calculate the sum of integers of bill without the item that did not eaten
        int sum = 0;
        for(int i=0;i<bill.size();i++){
            if(i == k){
                continue;
            }
            sum = sum + bill.get(i);
        }
        // System.out.println(sum);
        if((sum/2) == b){
            System.out.println("Bon Appetit");
        }else {
            System.out.println((b-(sum/2)));
        }
    }
}