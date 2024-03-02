package csv;

public class User {
    private final int id;
    private final String name;
    private final int waterCount;
    private final int gasCount1;
    private final int gasCount2;
    private final int electroCount1;
    private final int electroCount2;

    public User(String line) {
        String[] data = line.split("\\|");
        this.id = Integer.parseInt(data[0]);
        this.name = data[1];
        this.waterCount = Integer.parseInt(data[2]);
        this.gasCount1 = Integer.parseInt(data[3]);
        this.gasCount2 = Integer.parseInt(data[4]);
        this.electroCount1 = Integer.parseInt(data[5]);
        this.electroCount2 = Integer.parseInt(data[6]);
    }

    public String getName() {
        return name;
    }

    public int getWaterCount() {
        return waterCount;
    }

    public int getGasCount1() {
        return gasCount1;
    }

    public int getGasCount2() {
        return gasCount2;
    }

    public int getElectroCount1() {
        return electroCount1;
    }

    public int getElectroCount2() {
        return electroCount2;
    }

    @Override
    public String toString() {
        return id + "|" + name + "|" + waterCount + "|" + gasCount1 + "|" + gasCount2 + "|" + electroCount1 + "|" + electroCount2;
    }
}