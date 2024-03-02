package csv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataWriter implements DataWriter {

    @Override
    public void write(String filePath, User user) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(user.toString() + "\n");
        }
    }

    @Override
    public void writeFirstString(String filePath, String str) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filePath));
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
