public class Removingwhitespacefromastring
{
    public static void main(String[] args) {
            String str = " Gu s tu i r  j e ri c a";
          
            String str1 = str.replaceAll("\\s", "");
            System.out.println(str1);
                  
    }
                   
 }
