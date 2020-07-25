public class Kangaroo{

public static void main(String ar[]){

int x1 = 43 , v1=2, x2=70, v2=2;
        String ans = "";
        while(true){
            x1 = x1+v1;
            x2 = x2+v2;
            if((x2>x1 && v2>v1) || (x1>x2 && v1>v2)){
                ans="NO";
                break;
            }else if(x1==x2){
                ans = "YES";
                break;
            }else if((x1>x2 && v1==v2) || (x2>x1 && v2==v1)){
                ans="NO";
                break;
            }

        }
System.out.println(ans);


}

}