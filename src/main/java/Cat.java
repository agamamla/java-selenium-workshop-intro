public class Cat {

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public void catchMouse() {
        System.out.println("Mouse is my!");
    }

    public String getName() {
        return name;
    }


}
