package conditionalsandloops;

import inheritance.Animal;

public class SwitchCaseExample {

    public void checkAge(Animal animal) {

        switch (animal.getAge()) {
            case 1:
                System.out.println("Age equals 1");
                break;
            case 2:
                System.out.println("Age equals 2");
                break;
            case 3:
                System.out.println("Age equals 3");
                break;
            case 4:
                System.out.println("Age equals 4");
                break;
            default:
                System.out.println("Age equals 0");
        }
    }
}
