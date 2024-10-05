import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter your age :");
    int age=sc.nextInt();
        
        if(age>18){
            System.out.println("you are able to vote for our country  ");
        }
        else{
            System.out.println("you are still not able to vote for our country");
        }
    }
}
