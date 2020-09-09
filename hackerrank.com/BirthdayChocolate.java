import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*

Date -> 28-07-2020

link to question ->https://www.hackerrank.com/challenges/the-birthday-bar/problem

*/

/**
 * BirthdayChocolate
 */
public class BirthdayChocolate {

    public static void main(String[] args) {
        
        // my own input
        int birthDay = 3;
        int month = 2;
        int count =0;
        Integer [] list = new Integer[] {1,2,1,3,2};
        List<Integer> input = new ArrayList<Integer>();

        input.addAll(Arrays.asList(list));

        int sum = 0;
        // for to iterate over array
        for(int i=0;i<input.size()-month+1;i++){
            
            for(int j=0;j<month;j++){
                sum = sum + input.get(i+j);
            }
            if(sum == birthDay){
                count++;
            }
            sum = 0;
        }
        System.out.println(count);

        // return count;
    }
}