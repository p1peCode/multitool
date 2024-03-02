package csv;

import java.io.IOException;

public interface DataReader {
    User read(String path) throws IOException;
}
