class Bird {
    void fly() {
        System.out.println("Bird can fly");
    }
}

class Parrot extends Bird { 
    void color() {
        System.out.println("I am green in color");
    }
}

class Peacock extends Bird { 
    void role() {
        System.out.println("Peacock is the national bird");
    }
}

public class main {  
    public static void main(String[] args) {
        Parrot p = new Parrot();  
        Peacock pt = new Peacock();  
        
        p.fly();     
        p.color();   
        pt.fly();     
        pt.role();    
    }
}



