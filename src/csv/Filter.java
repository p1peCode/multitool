package csv;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static List<User> filterUsers(List<User> users, Validator validator, int maxConsumption) {
        List<User> ecoUsers = new ArrayList<>();
        for (User user : users) {
            if (validator.isValid(user, maxConsumption)) {
                ecoUsers.add(user);
            }
        }
        return ecoUsers;
    }
}
