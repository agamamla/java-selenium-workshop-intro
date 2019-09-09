package exceptions;

import inheritance.CatChild;

public class ExceptionExample {

    public void addOneToAge(CatChild cat) {

        try {
            cat.setAge(cat.getAge() + 1);
        } catch (NullPointerException e) {
            System.out.println("Something is wrong...");
        }
    }
}

