package inheritance;

public class DogChild extends Animal{

    public DogChild(String name, int age) {
        super(name);
        this.age = age;
    }

    public void introduce() {
        System.out.println("I'm dog and my name is: " + getName());
    }

    public void introduceAsAnimal() {
        super.introduce();
    }

    public void bark() {
        System.out.println("hau hau");
    }

    public String getType() {
        return "Dog";
    }
}
