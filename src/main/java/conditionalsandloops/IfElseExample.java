package conditionalsandloops;

import inheritance.Animal;
import inheritance.CatChild;
import inheritance.DogChild;

public class IfElseExample {


    public void checkAnimal(DogChild dog) {

        if(dog.getName().equals("Burek")) {

            System.out.println("It's my dog!");

        } else {

            System.out.println("It's not my dog :( ");
        }
    }
}
