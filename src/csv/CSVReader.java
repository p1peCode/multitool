package csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader implements DataReader {

    @Override
    public List<User> read(String filePath) throws IOException {
        List<User> users = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            String[] data = line.split("\\|");
            int id = Integer.parseInt(data[0]);
            String name = data[1];
            int waterCount = Integer.parseInt(data[2]);
            int gasCount1 = Integer.parseInt(data[3]);
            int gasCount2 = Integer.parseInt(data[4]);
            int electroCount1 = Integer.parseInt(data[5]);
            int electroCount2 = Integer.parseInt(data[6]);
            users.add(new User(id, name, waterCount, gasCount1, gasCount2, electroCount1, electroCount2));
        }
        reader.close();
        return users;
    }
}