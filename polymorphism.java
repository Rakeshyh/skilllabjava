/*class poly {
  //overloding
  public int add( int a,int b){
    return a+b;
  }//overload for 3 int
  public int add(int a,int b,int c){
    return a+b+c;
  }
  //overloading method for 2 double
  public double add(double a,double b){
    return a+b;
  }
}
  public class polymorphism{
    public static void main(String[] args) {
        poly p=new poly();
        System.out.println("sum of the integer:" +p.add(20,10));
        System.out.println("sum of the integer:" +p.add(20,10,30));
        System.out.println("sum of the double:" +p.add(2.5,10.662587));

    }
  }*/
  class poly {
    //overdring
    public void sound(){
      System.out.println("animal can make a more sound like roring");
    }
  }
  class dog extends poly{
    //subclass method overding the super class method
    public void sound(){
      System.out.println("the dog makes a bark sound");
    }
  }
  class cat extends poly{
    public void sound(){
      System.out.println("the cat makes a meauuuuu sound");

    }
  }
  public class polymorphism{
    public static void main(String[] args) {
        poly p=new poly();
        p.sound();
        dog d=new dog();
        d.sound();
        cat c=new cat();
        c.sound();
    }
  }
    

    
