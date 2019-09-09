package inheritance;

public class MySecondZoo {

    private DogChild dog = new DogChild("pieseł", 3);
    private CatChild cat = new CatChild("koteł");

    public void animalsGetNames() {
        dog.introduce();
        cat.introduce();
        dog.introduceAsAnimal();
    }
}
