import java.util.Scanner;
public class intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principle ");
        int p=sc.nextInt();
        System.out.println("enter the intesrt");
        int r=sc.nextInt();
        System.out.println("enter the time");
        int t=sc.nextInt();
        float si=p*t*r/100;
        System.out.println("simple intesrt" + si);

        
    }
    
}
