package Task9;
import java.util.HashMap;
import java.util.Map;

public class DataCache {

    private static DataCache instance;

    private final Map<String, Object> cache;

    private DataCache() {
        cache = new HashMap<>();
    }

    public static synchronized DataCache getInstance() {
        if (instance == null) {
            instance = new DataCache();
        }
        return instance;
    }

    public void put(String key, Object value) {
        cache.put(key, value);
    }

    public Object get(String key) {
        return cache.get(key);
    }

    public boolean containsKey(String key) {
        return cache.containsKey(key);
    }
}
