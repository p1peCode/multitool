package multitool2;

public class Otvertka extends Tool {

    public Otvertka() {
    }

    public Otvertka(Workable workable) {
        super(workable);
    }

    @Override
    public void work() {
        System.out.println("kruchu");
        super.work();
    }
}
