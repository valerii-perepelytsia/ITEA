public enum Animals {
    CAT(3), DOG(5), ELEPHANT(10);

    private int age;

    Animals(int age) {
        this.age = age;
    }

    public String toString() {
        return name() + " (Age: " + age + ")";
    }
}