package conditionalsandloops;

import inheritance.Animal;

import java.util.List;

public class ForEachExample {

    public void setAge(List<Animal> animals) {

        for (Animal animal : animals) {

            animal.setAge(2);
        }
    }
}
