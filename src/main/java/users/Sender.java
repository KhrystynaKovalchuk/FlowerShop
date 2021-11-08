package users;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Sender implements User{
    public int id;

    @Override
    public String update(String status){
        return "User's status is: " + status;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
