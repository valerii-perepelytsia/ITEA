package hw1002;

public class Main {
    public static void main(String[] args) {
        Class<ChildClass> childClass = ChildClass.class;

        MyInheritedAnnotation inheritedAnnotation = childClass.getAnnotation(MyInheritedAnnotation.class);

        if (inheritedAnnotation != null) {
            System.out.println("Inherited Annotation: " + inheritedAnnotation.value());
        } else {
            System.out.println("No Inherited Annotation");
        }

        ChildClass child = new ChildClass();

        child.deprecatedMethod();

        System.out.println(child);
    }
}