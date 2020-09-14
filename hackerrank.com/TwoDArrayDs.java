/*

Date -> 12-09-2020

link to question ->https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

*/                                  

/**
 * 2DArrayDs
 */
public class TwoDArrayDs {

    public static void main(String[] args) {

        // custom input 
        int row =6;
        int col=6;
        // int arr[][]= new int[][]{
        //     {1,1,1,0,0,0},
        //     {0,1,0,0,0,0},
        //     {1,1,1,0,0,0},
        //     {0,0,2,4,4,0},
        //     {0,0,0,2,0,0},
        //     {0,0,1,2,4,0},
        // };

        int arr[][]= new int[][]{
            {-1,-1,0,-9,-2,-2},
            {-2,-1,-6,-8,-2,-5},
            {-1,-1,-1,-2,-3,-4},
            {-1,-9,-2,-4,-4,-5},
            {-7,-3,-3,-2,-9,-9},
            {-1,-3,-1,-2,-4,-5},
        };
        int sum=Integer.MIN_VALUE;
        for(int i=0; i< arr.length-2; i++){
            for (int j = 0; j < arr.length-2; j++) {
                int sum2 = arr[i][j]+arr[i][j+1]+arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sum < sum2 ){
                    sum = sum2;
                }
            }
        }

        System.out.println(sum);
    }
}