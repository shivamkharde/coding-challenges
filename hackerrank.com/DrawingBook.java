/*

Date -> 11-08-2020

link to question ->https://www.hackerrank.com/challenges/drawing-book/problem
*/

/**
 * DrawingBook
 */
public class DrawingBook {

    public static void main(String[] args) {
        
        // custom input
        int n = 7; //no. of pages
        int p = 4; //page no to find 
        
        int fromFront = 0;
        int fromBack = 0;

        if(n==p){
            // return 0;//this is to handle corner case;
        }
        fromFront= (p/2);
        //if n is even and p is odd then ans should be 0 from back 
        //ps: dont freak out just do the math and figure it out
        if(n%2 == 0 && p%2==1){
            fromBack = ((n-p)/2)+1;
        }else{
            fromBack = ((n-p)/2);
        }


        System.out.println("fromBack :"+fromBack);
        System.out.println("fromFront :"+fromFront);
        System.out.println("final min page count : "+((fromFront<fromBack)?fromFront:fromBack));
        // return ((fromFront<fromBack)?fromFront:fromBack);
    }
}