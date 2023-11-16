package hw1002;

@MyInheritedAnnotation("ParentClass Annotation")
public class ParentClass {
    public void deprecatedMethod() {
        System.out.println("This method is deprecated.");
    }

    @Override
    public String toString() {
        return "This is the ParentClass.";
    }
}