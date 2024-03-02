package csv;

public class CheckingService implements Validator {
    private final int maxConsumption;

    public CheckingService(int maxConsumption) {
        this.maxConsumption = maxConsumption;
    }

    @Override
    public boolean isValid(User user) {
        return user.getElectroCount1() + user.getElectroCount2() < maxConsumption &&
                user.getGasCount1() + user.getGasCount2() < maxConsumption &&
                user.getWaterCount() < maxConsumption;
    }
}
