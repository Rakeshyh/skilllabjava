public class hybrid {
    public static void main(String[] args) {
        D obj =new D();
        obj.Display();
    }
}
//super class
class A{
    int a=10;
}
class B extends A{
    int b=20;
}
//interface
interface C{
    int c=30;
}
//extend and implemntation together
class D extends  B implements C {
    int d=40;
    int sum=a+b+c+d;
    public void Display(){
        System.out.println("the value of a is "+ a );
        System.out.println("the value of b is "+ b );
        System.out.println("the value of c is "+ C.c );
        System.out.println("the value of d is "+ d );
        System.out.println("the sum is" +sum );
    }

}