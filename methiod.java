
/* 
public class methiod { //instance method
    public void Display(String name){
        System.out.println("name :" +name);
    }
    public static void main(String[] args) {
        methiod a = new methiod();
        a.Display("rakesh");

   */
  public class methiod { //instance method
   // public void Display(String name){
        //System.out.println("name :" +name);
    //}
    public static int square(int number) {
        return number *number;
    }
    public static void main(String[] args) {
       int result=methiod.square(5);
       System.out.println("the square  is:" + result);
    }
}
