package hw1002;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.makeSound();

        MyAnnotation annotation = Cat.class.getAnnotation(MyAnnotation.class);
        System.out.println("Annotation value: " + annotation.value());

        DeprecatedExample deprecatedExample = new DeprecatedExample();
        deprecatedExample.oldMethod();

        SuppressWarningsExample suppressWarningsExample = new SuppressWarningsExample();
        suppressWarningsExample.getStrings();

        SafeVarargsExample safeVarargsExample = new SafeVarargsExample();
        safeVarargsExample.process("Item1", "Item2");

        OverrideExample overrideExample = new OverrideExample();
        OverrideExample.Cat catFromOverrideExample = overrideExample.new Cat();
        catFromOverrideExample.makeSound();

        methodWithCustomAnnotation();
    }

    @CustomAnnotation(value = "Custom annotation on method")
    public static void methodWithCustomAnnotation() {
        System.out.println("Method with custom annotation");
    }
}