package course;

import com.mongodb.DBObject;

import java.util.List;

/**
 * Created by udyat on 2/06/15.
 */
public interface BlogPostDao {
    public DBObject findByPermalink(String permalink);
    public List<DBObject> findByDateDescending(int limit);
    public List<DBObject> findByTagDateDescending(final String tag);
    public String addPost(String title, String body, List tags, String username);
    public void addPostComment(final String name, final String email, final String body, final String permalink);
}
