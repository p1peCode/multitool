package csv;

import java.io.IOException;
import java.util.List;

public class EcoFriendly {
    public static void main(String[] args) {
        final int maxConsumption = 500;
        final String filePath = "S:\\csv\\data.csv";
        final String pathToCreate = "S:\\csv\\aa.txt";

        try {
            DataReader fileReader = new CSVReader();
            List<User> users = fileReader.read(filePath);

            Validator validator = new CheckingService(maxConsumption);
            List<User> ecoUsers = Filter.filterUsers(users, validator, maxConsumption);

            DataWriter dataWriter = new FileDataWriter();
            dataWriter.write(pathToCreate, ecoUsers);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}