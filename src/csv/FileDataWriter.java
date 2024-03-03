package csv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataWriter implements DataWriter {
    private BufferedWriter writer;

    public FileDataWriter(String filePath) throws IOException {
        this.writer = new BufferedWriter(new FileWriter(filePath));
    }

    @Override
    public void write(String filePath, User user) throws IOException {
        if (writer == null) {
            throw new IOException();
        } else {
            writer.write(user.toString() + "\n");
        }
    }

    @Override
    public void writeFirstString(String filePath, String str) throws IOException {
        writer.write(str);
    }

    public void close() throws IOException {
        writer.close();
    }
}
