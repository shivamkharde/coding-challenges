
// date -> 11/08/2020
// url -> https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java

/**
 * ConvertStringToCamelCase
 */
public class ConvertStringToCamelCase {

    public static void main(String s[]){

        // custom input
        String string = "the_stealth_warrior";

        // printing the result
        System.out.println(toCamelCase(string));

    }

    public static String toCamelCase(String s){
        String splitted[] = s.split((s.contains("-")?"-":"_"));
        String newString = "";
        String lastTwo = "";
        for (int i = 1; i < splitted.length; i++) {
            // getting second word from splitted array
            String word = splitted[i];
            for (int j = 0; j < word.length(); j++) {
                // if j == 0 means words first character..then uppercase it
                if(j == 0)
                    lastTwo +=word.substring(0,1).toUpperCase();
                else
                    lastTwo +=word.charAt(j);
            }
        }
       
        // returning the result by appending the first word of splitted array
        return newString= splitted[0]+lastTwo;
    }
        
}












