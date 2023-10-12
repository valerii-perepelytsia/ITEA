public class Worker {
    private String fullName;
    private String jobTitle;
    private int startYear;

    public Worker(String fullName, String jobTitle, int startYear) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.startYear = startYear;
    }

    public String getFullName() {
        return fullName;
    }

    public int getStartYear() {
        return startYear;
    }
}