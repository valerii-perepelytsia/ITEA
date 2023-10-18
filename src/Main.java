class Main {
    public static void main(String[] args) {
        ModernUnidirectionalLinkedList<Integer> list = new ModernUnidirectionalLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Size: " + list.size());

        list.add(2, 5);
        list.remove(3);

        System.out.println("List:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.insertHead(0);

        System.out.println("List:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}