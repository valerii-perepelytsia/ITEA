package hw0804;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int N = 10;
        LinkedList<Integer> list = getIntegerList(N);
        System.out.println("Список: " + list);

        int min = getMinimum(list);
        System.out.println("Мінімальне число: " + min);
    }

    public static LinkedList<Integer> getIntegerList(int N) {
        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            list.add(rand.nextInt(100));
        }

        return list;
    }

    public static int getMinimum(LinkedList<Integer> list) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(list);
        return minHeap.peek();
    }
}