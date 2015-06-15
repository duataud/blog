package course;

import com.mongodb.DBObject;

/**
 * Created by udyat on 2/06/15.
 */
public interface UserDAO {
    public boolean addUser(String username, String password, String email);
    public DBObject validateLogin(String username, String password);
}
