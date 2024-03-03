package csv;

import java.io.IOException;
import java.util.List;

public interface DataReader {
    List<User> read(String path) throws IOException;
}
