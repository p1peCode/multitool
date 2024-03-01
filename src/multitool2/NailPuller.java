package multitool2;

public class NailPuller extends Tool {
    public NailPuller() {
    }

    public NailPuller(Workable workable) {
        super(workable);
    }

    @Override
    public void work() {
        System.out.println("deru");
        super.work();
    }
}
