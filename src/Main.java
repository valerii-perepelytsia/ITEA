public class Main {
    public static void main(String[] args) {
        Pupil excellentPupil = new ExcelentPupil();
        Pupil goodPupil = new GoodPupil();
        Pupil badPupil = new BadPupil();
        Pupil veryGoodPupil = new GoodPupil();
        Pupil veryBadPupil = new BadPupil();

        ClassRoom class1 = new ClassRoom(excellentPupil, goodPupil, badPupil);
        ClassRoom class2 = new ClassRoom(excellentPupil, goodPupil);
        ClassRoom class3 = new ClassRoom(excellentPupil);
        ClassRoom class4 = new ClassRoom(excellentPupil, goodPupil, badPupil, veryGoodPupil, veryBadPupil);

        System.out.println("Class 1:");
        class1.showInfo();

        System.out.println("\nClass 2:");
        class2.showInfo();

        System.out.println("\nClass 3:");
        class3.showInfo();

        System.out.println("\nClass 4:");
        class4.showInfo();
    }
}