package csv;

import java.io.IOException;
import java.util.List;

public interface DataWriter {
    void write(String filePath, List<User> users) throws IOException;
}
