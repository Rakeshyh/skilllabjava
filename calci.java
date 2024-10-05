import java.util.Scanner;
public class calci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a :");
        int a=sc.nextInt();
        System.out.println("enter the value of b :");
        int b=sc.nextInt();
        float c;
        System.out.println("1:addition , 2:subtraction , 3: multiplication ,4 : division, 5: modulas");
        System.out.println("enter your choice:");
        int ch=sc.nextInt();
        switch (ch){
            case 1 :  c=a+b;
            System.out.println(c);
            break;
            case 2 :   c=a-b;
            System.out.println(c);
            break;  
            case 3 :   c=a*b;
            System.out.println(c);
            break;
            case 4:   c=a/b;
            System.out.println(c);
            break;
            case 5:   c=a%b;
            System.out.println(c);
            break;
            default : System.out.println("invalid choice"); 
            break;

        }

    }
    
}
