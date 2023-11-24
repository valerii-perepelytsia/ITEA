package hw1105;

class Deadlock {
    public synchronized void lockA(Deadlock other) {
        System.out.println(Thread.currentThread().getName() + " заблокував об'єкт A");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " намагаємось заблокувати об'єкт B");
        other.lockB(this);
    }

    public synchronized void lockB(Deadlock other) {
        System.out.println(Thread.currentThread().getName() + " заблокував об'єкт B");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " намагаємось заблокувати об'єкт A");
        other.lockA(this);
    }
}