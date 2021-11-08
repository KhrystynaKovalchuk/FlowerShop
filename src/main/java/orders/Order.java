package orders;

import users.User;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<User> users = new ArrayList<>();
    private int currentID = 0;

    public void addUser(User user){
        user.setId(currentID++);
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
        currentID--;
    }

    public void notifyUsers(){
        for (User user: users){
            user.update("Updated user!");
        }
    }
    public void order(){
        notifyUsers();
    }
}
