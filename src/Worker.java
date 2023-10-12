public class Worker implements Comparable<Worker> {
    private String fullName;
    private String jobTitle;
    private int hireYear;

    public Worker(String fullName, String jobTitle, int hireYear) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.hireYear = hireYear;
    }

    public String getFullName() {
        return fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getHireYear() {
        return hireYear;
    }

    public int compareTo(Worker other) {
        return this.fullName.compareToIgnoreCase(other.fullName);
    }

    public String toString() {
        return "Worker{" +
                "fullName='" + fullName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", hireYear=" + hireYear +
                '}';
    }
}