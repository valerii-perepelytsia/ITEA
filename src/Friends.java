import java.util.ArrayList;
import java.util.Collections;
public class Friends {
    private ArrayList<String> friendList;

    public Friends() {
        friendList = new ArrayList<>();
    }

    public void addFriend(String name) {
        friendList.add(name);
    }

    public void printSortedFriends() {
        Collections.sort(friendList);
        for (String friend : friendList) {
            System.out.println(friend);
        }
    }
}