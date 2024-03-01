package multitool2;

public abstract class Tool implements Workable {
    protected Workable workable;

    public Tool() {

    }

    public Tool(Workable workable) {
        this.workable = workable;
    }

    public void work() {
        if (workable != null) {
            workable.work();
        }
    }
}