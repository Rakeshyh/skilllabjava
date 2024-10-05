public class Const {
    String brand;
    int year;//constructar
    public Const(String brand, int year){
        this.brand=brand;
        this.year=year;
    }
    public void DisplayCarinfo(){
        System.out.println("car brand :" + brand);
        System.out.println("car manufactur :" + year);
    }
    public static void main(String[] args){
        Const mycar = new Const("rolls royce phantom", 2000);
        mycar.DisplayCarinfo();
        }
    }


