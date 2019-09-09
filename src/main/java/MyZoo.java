public class MyZoo {

    Cat mruczek = new Cat("Mruczek", 2);

    Cat miauczek = new Cat("Miauczek", 4);

    Cat theOlderCat = miauczek;

    public void shuffleCats() {
        System.out.println(mruczek.getName());
        System.out.println(miauczek.getName());
        System.out.println(theOlderCat.getName());

        mruczek = miauczek;

        System.out.println(mruczek.getName());
        System.out.println(miauczek.getName());
        System.out.println(theOlderCat.getName());
    }
}
