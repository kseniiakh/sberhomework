package homework1;

public class Cat {

    private void sleep() {
        System.out.println("Sleep");
    }

    private void meow() {
        System.out.println("Meow");
    }

    private void eat() {
        System.out.println("Eat");
    }

    public void status() {
        int result = (int) (1 + Math.random() * 3);
        switch (result) {
            case 1 -> sleep();
            case 2 -> meow();
            case 3 -> eat();
        }
    }
}
