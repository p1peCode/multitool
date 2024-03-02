package csv;

import java.io.IOException;

public interface DataWriter {
    void write(String filePath, User user) throws IOException;
    void writeFirstString(String filePath, String str) throws IOException;
}
