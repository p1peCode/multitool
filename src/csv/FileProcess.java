package csv;

import java.io.*;

public class FileProcess {
    private final int maxConsumption;
    private final DataReader reader;
    private final DataWriter writer;
    private final Validator validator;

    public FileProcess(int maxConsumption, DataReader reader, DataWriter writer, Validator validator) {
        this.maxConsumption = maxConsumption;
        this.reader = reader;
        this.writer = writer;
        this.validator = validator;
    }

    public void processFile(String filePath, String pathToCreate) throws IOException {
        writer.writeFirstString(pathToCreate, "id|name|waterCount|gasCount1|gasCount2|electroCount1|electroCount2\n");

        User user;
        while ((user = reader.read(filePath)) != null) {
            if (validator.isValid(user, maxConsumption)) {
                writer.write(pathToCreate, user);
            }
        }
    }
}