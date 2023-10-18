class Main {
       public static void main(String[] args) {
        MyDictionary<String, Integer> dictionary = new MyDictionary<>();

        dictionary.addElement("one", 1);
        dictionary.addElement("two", 2);
        dictionary.addElement("three", 3);

        System.out.println("Value for key 'two': " + dictionary.getElement("two"));

        System.out.println("Number of elements in the dictionary: " + dictionary.size());
    }
}