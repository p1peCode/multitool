package csv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileDataWriter implements DataWriter {

    @Override
    public void write(String filePath, List<User> users) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("id|name|waterCount|gasCount1|gasCount2|electroCount1|electroCount2\n");
            for (User user : users) {
                writer.write(user.toString() + "\n");
            }
        }
    }
}
