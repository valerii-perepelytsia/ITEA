class ClassRoom {
    private Pupil[] pupils;

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupils = new Pupil[]{pupil1, pupil2, pupil3, new BadPupil()};
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupils = new Pupil[]{pupil1, pupil2, new BadPupil(), new GoodPupil()};
    }

    public ClassRoom(Pupil pupil1) {
        this.pupils = new Pupil[]{pupil1, new BadPupil(), new BadPupil(), new GoodPupil()};
    }
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