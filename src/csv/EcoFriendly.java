package csv;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EcoFriendly {
    public static void main(String[] args) {
        final int maxConsumption = 300;
        final String filePath = "S:\\csv\\data.csv";
        final String pathToCreate = "S:\\csv\\aa.txt";

        try {
            FileReader fileReader = new FileReader(filePath);
            FileWriter fileWriter = new FileWriter(pathToCreate);
            FileProcess fileProcess = new FileProcess(maxConsumption);

            fileProcess.processFile(fileReader, fileWriter);

            fileReader.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}