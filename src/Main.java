class Main {
    public static void main(String[] args) {
        Friends friends = new Friends();

        friends.addFriend("Ann");
        friends.addFriend("Elizabeth");
        friends.addFriend("John");
        friends.addFriend("Peter");

        System.out.println("\nСписок друзів у алфавітному порядку:");
        friends.printSortedFriends();
    }
}