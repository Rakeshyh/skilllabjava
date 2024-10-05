class person {
    private String name;
    private int age;

    public String getName() {// getter method
        return name;
    }

    public void setName(String name) {// setter method
        if (name == null || name.isEmpty()) {
            System.out.println("invalid name:" + name);

        } else {
            this.name = name;

        }
    }

    public int getAge() {// getter method
        return age;
    }

    public void setAge(int age) {// setter method
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("invalid age:" + age);
        }
    }
}

public class encaps {
    public static void main(String[] args) {
        person person = new person();
        // set the name and age using seeters method
        person.setName("rakesh");
        person.setAge(20);

        System.out.println("name:" + person.getName());
        System.out.println("age:" + person.getAge());

    }
}
