import java.util.Scanner;

public class great{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number1:");
    int n1=sc.nextInt();
    System.out.println("enter a number2:");
    int n2=sc.nextInt();
    System.out.println("enter a number3:");
    int n3=sc.nextInt();
    if (n1>n2 && n1>n3){
        System.out.println("number 1 is greater");
    }
    else if(n2>n1 && n2>n3 ){
        System.out.println("number 2 is greater");
    }

    
    else{
        System.out.println("3 is greater");
    }    
      }
    }




