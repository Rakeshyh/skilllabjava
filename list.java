import java.util.ArrayList;
import java.util.HashSet;
public class list {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        System.out.println("first fruit:" + fruits.get(0));
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        fruits.remove("banana");
        System.out.println("after removing fruit:" +fruits);
    HashSet<Integer> number = new HashSet<>();
    number.add(10);
    number.add(20);
    number.add(30);
    number.add(40);
    number.add(50);
    }
}

    
