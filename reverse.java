import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the word ");
    String a=sc.nextLine();
    String rev="";
    for(int i=a.length()-1;i >=0;i--){
        rev+=a.charAt(i);
    }
    System.out.println("the reverse string is " + rev);
    
    }
}
