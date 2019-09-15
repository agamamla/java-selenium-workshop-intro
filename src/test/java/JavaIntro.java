import inheritance.Animal;
import inheritance.CatChild;
import inheritance.DogChild;
import inheritance.MySecondZoo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaIntro {

    private MyZoo myZoo = new MyZoo();

    private MySecondZoo mySecondZoo = new MySecondZoo();

    @Test
    public void helloWorld() {
        System.out.println("Hello world!");
    }

    @Test
    public void createDogsTest() {

    }

    @Test
    public void shuffleCatsTest() {
        myZoo.shuffleCats();
    }

    @Test
    public void animalsNamesTest() {
        mySecondZoo.animalsGetNames();
    }

    @Test
    public void staticAndFinalTest() {

    }

    @Test
    public void checkAgeTest() {
        List<Animal> animals = createList();

    }

    private List<Animal> createList() {
        List<Animal> animals = new ArrayList<>();
        CatChild firstCat = new CatChild("Mruczek");
        CatChild secondCat = new CatChild("Miauczek");
        DogChild firstDog = new DogChild("Burek", 2);
        DogChild secondDog = new DogChild("Pimpek", 4);
        animals.addAll(Arrays.asList(firstCat, secondCat, firstDog, secondDog));
        return animals;
    }

}
