class Main {
     public static void main(String[] args) {
        MyList<String> myList = new MyList<>();

        myList.add("Test 1");
        myList.add("Test 2");
        myList.add("Test 3");

        System.out.println("element 1: " + myList.get(0));
        System.out.println("element 3: " + myList.get(2));
        System.out.println("Size: " + myList.size());
    }
}