public class Dog {

    private String name;
    private String colour;
    private int age;

    public void setDogData(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    public void bark() {
        System.out.println("hau hau!");
    }

}
