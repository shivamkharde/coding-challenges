public class isogram {
    public static void main(String []st) {
      String str = "moOse".toLowerCase(); 
       if(str.equals("")){
         //return true;
	System.out.println("isogram");
       }
      int flag = 0;
      for(int i=0;i<str.length();i++){
        for(int j=i+1;j<str.length()-1;j++){
          if(str.charAt(i) == str.charAt(j)){
            flag=1;
            break;
          }
        }
	if(flag==1)
{break;}
      }
      
      if(flag == 0){
	System.out.println("isogram");
	}else{
System.out.println("not isogram");
}
    } 
}