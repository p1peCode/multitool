package multitool2;

public class Main {
    public static void main(String[] args) {
        Tool multitool = new Otvertka(new Knife());
        multitool.work();
    }
}