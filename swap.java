 import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1 number ");
        int a=sc.nextInt();
        System.out.println("enter the 2 number");
        int b=sc.nextInt();
        System.out.println("before swapping" +a +" " +b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping" +a +" "+ b);
    }
}

