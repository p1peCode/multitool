package csv;

import java.io.*;

public class FileProcess {
    private final Validator validator;

    public FileProcess(int maxConsumption) {
        this.validator = new CheckingService(maxConsumption);
    }

    public void processFile(FileReader fileReader, FileWriter fileWriter) throws IOException {
        BufferedReader reader = new BufferedReader(fileReader);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        reader.readLine();
        writer.write("id|name|waterCount|gasCount1|gasCount2|electroCount1|electroCount2\n");

        String line;
        while ((line = reader.readLine()) != null) {
            User user = new User(line);
            if (validator.isValid(user)) {
                writer.write(user + "\n");

            }
        }
        reader.close();
        writer.close();
    }
}
