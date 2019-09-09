package inheritance;

public class Animal {

    protected String name;
    protected int age;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void introduce() {
        System.out.println("I'm animal and my name is Lion King");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return "Animal";
    }
}
