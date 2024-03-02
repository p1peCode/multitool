package csv;

import java.io.IOException;

public class EcoFriendly {
    public static void main(String[] args) {
        final int maxConsumption = 300;
        final String filePath = "S:\\csv\\data.csv";
        final String pathToCreate = "S:\\csv\\aa.txt";

        try {
            DataReader fileReader = new CSVReader();
            DataWriter dataWriter = new FileDataWriter();
            Validator validator = new CheckingService(maxConsumption);

            FileProcess fileProcess = new FileProcess(maxConsumption, fileReader, dataWriter, validator);
            fileProcess.processFile(filePath, pathToCreate);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}