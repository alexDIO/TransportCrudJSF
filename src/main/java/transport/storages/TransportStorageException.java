package transport.storages;

/**
 * Created by olomakovskyi on 9/5/2014.
 */
public class TransportStorageException extends Exception {
    public String toString() {
        return "Unknown storage. Check properties file.";
    }
}
