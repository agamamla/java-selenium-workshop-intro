package conditionalsandloops;

import inheritance.Animal;

import java.util.List;

public class ForLoopExample {

    public void setAge(List<Animal> animals) {

        for (int i = 0; i < animals.size(); i++) {

            animals.get(i).setAge(i);
        }
    }
}
