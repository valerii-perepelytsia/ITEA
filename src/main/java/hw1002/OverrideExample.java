package hw1002;


public class OverrideExample {
    public class Animal {
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    public class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Cat meows");
        }
    }
}