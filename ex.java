public class ex {
    public static void main(String[] args) {
        try {
            //risky code that may handle cause exception
            int a=10/0;//this will throw arithmeticexcetiption
            System.out.println("result :" +a);
        } catch (ArithmeticException e) {
            //handle the exception
            System.out.println("error division by zero");
        }finally{
            //code that always excutes
            
            System.out.println("hello devision done final block");
        }
        System.out.println("rest of the code ...!");

       
    }
}
  
