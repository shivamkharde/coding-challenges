import java.io.*;
import java.util.*;
public class practice1{
    public static void main(String args[] ) throws Exception {

        int no_of_strings = 0;
        int vowel_count = 0;
        int consonant_count = 0;
        Scanner input = new Scanner(System.in);
        no_of_strings = input.nextInt();
        String[] strings = new String[no_of_strings];
	for(int i=0;i<no_of_strings;i++){
            strings[i]=input.next();
        }
        for(int i=0;i<no_of_strings;i++){
            String string = strings[i];
            for(int j=0;j<string.length();j++){
                if(string.charAt(j) == 'a' || string.charAt(j) == 'e' || string.charAt(j) == 'i' || string.charAt(j) == 'o' || string.charAt(j) == 'u' ){
                    vowel_count++;
                }else{
                    consonant_count++;
                }
            }
        System.out.print(vowel_count+"\t"+consonant_count+"\t"+(vowel_count*consonant_count));
vowel_count=0;
consonant_count=0;
System.out.println();
        }
        
   }
}