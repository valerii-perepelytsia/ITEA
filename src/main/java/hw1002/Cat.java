package hw1002;

@MyAnnotation(value = "Annotation on Cat class")
public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}