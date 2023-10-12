import java.util.Comparator;
class WorkerComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker worker1, Worker worker2) {
        return worker1.getFullName().compareTo(worker2.getFullName());
    }
}