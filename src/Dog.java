public class Dog {

    int size;

    public void bark(int i) {
        if (size > 60) {
            System.out.println(" Woof! Woof! ");
        } else if (size > 14) {
            System.out.println(" Ruff! Ruff! ");
        } else {
            System.out.println(" Yip! Yip! ");
        }
    }

    public static void main(String[] args) {
        Dog catel = new Dog();
        catel.bark(25);
    }
}




