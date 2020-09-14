// this is an example of pallindrom string detection

/**
 * Pallindrom
 */
public class Pallindrom {

    public static void main(String[] args) {
        
        // custom input
    String string = "bob";
    // using recursion
    int isPallindrom = pallindromFromRcursion(string, 0, string.length()-1);

    // using brute force method
    // int isPallindrom = pallindromeUsingBruteForce(string);

    // optimum way
    // int isPallindrom = pallindromUsingOptimumWay(string);

    if(isPallindrom == 1){
        System.out.println("Pallindrome");
    }else{
        System.out.println("Not Pallindrome");
    }
    }

    // using recursion
    public static int pallindromFromRcursion(String  string,int start, int end){

        if(start == end){
            return 1;
        }else if(string.charAt(start) == string.charAt(end)){
            pallindromFromRcursion(string, start+1, end-1);
            return 1;
        }else{
            return 0;
        }
    }

    // using brute force
    public static int pallindromeUsingBruteForce(String string){
        String reverse = "";
        // if(string.charAt(0) != string.charAt(string.length()-1)){
        //     return 0;
        // }
        for (int i = string.length()-1;i>=0; i--) {
            reverse+=string.charAt(i);
        }
        System.out.println(reverse);
        System.out.println(string);

        if (string.equals(reverse)) {
            return 1;            
        }else{
            return 0;
        }

    }

    // using optimum way
    public static int pallindromUsingOptimumWay(String string){

        // using while loop

        int start = 0;
        int end = string.length()-1;
        int status = 0;
        if(string.length() % 2 == 0){
            while (start < end) {
                
                if(string.charAt(start) == string.charAt(end)){
                    status = 1;
                }
                ++start;
                --end;
            }
        }else{
            while (start != end) {
                
                if(string.charAt(start) == string.charAt(end)){
                    status = 1;
                }
                ++start;
                --end;
            }
        }

        return status;
    }
}