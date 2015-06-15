package course;

import com.mongodb.DBObject;

/**
 * Created by udyat on 2/06/15.
 */
public interface SessionDAO {
    public String findUserNameBySessionId(String sessionId);
    public String startSession(String username);
    public void endSession(String sessionID);
    public DBObject getSession(String sessionID);
}
