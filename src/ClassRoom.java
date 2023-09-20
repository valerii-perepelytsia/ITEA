public class ClassRoom {
    private Pupil[] pupils;

    public ClassRoom(Pupil... pupils) {
        this.pupils = pupils;
    }

    public void showInfo() {
        for (Pupil pupil : pupils) {
            System.out.println("Учень:");
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
            System.out.println();
        }
    }
}
