public class Constructor {

    private Dog burek;

    private Cat mruczek;

    private void createDog() {
        burek = new Dog();
        burek.setDogData("Burek", "bury", 3);
    }

    private void createCat() {

        mruczek = new Cat("Mruczek", 1);
    }
}
