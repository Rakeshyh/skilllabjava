public class multicatch {
    public static void main(String[] args) {
        try {
            int arr[] = new int[-5];
            arr[5] = 2/0;
        
        } catch (ArithmeticException e) {
            System.out.println("airthmetic exception by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException : array index is out of bound");
        } finally  {
            System.out.println("exception some other exception occured");
        System.out.println("rest of the code ...");
        }
    }
}


