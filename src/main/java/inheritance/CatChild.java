package inheritance;

public class CatChild extends Animal {

    public CatChild(String name) {
        super(name);
    }

    public void introduce() {
        System.out.println("I'm cat and my name is: " + getName());
    }

    public void meow() {
        System.out.println("miau miau");
    }

    public String getType() {
        return "Cat";
    }
}
