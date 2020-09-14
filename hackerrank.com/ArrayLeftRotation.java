/*

Date -> 14-09-2020

link to question ->https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

*/

/**
 * ArrayLeftRotation
 */
public class ArrayLeftRotation {

    public static void main(String[] args) {
        
        // custom input
        int a[] =new int[]{1,2,3,4,5};
        int d=10;

        // solution ot the problem
        int start = (d%a.length);

        int myArr[] = new int[a.length];

        // System.out.println(start);
        myArr[0] = a[start];

        int p = 1;
        for(int i = start+1; i<a.length;i++){
            myArr[p] = a[i];
            p++;
        }
        // System.out.println(p);
        for (int i = 0; i <=start-1 ; i++) {
           myArr[p] = a[i];
           p++;
        }

        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }
    }
}