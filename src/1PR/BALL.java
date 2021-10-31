public class BALL {

    private final String assignment;
    private final String size;

    public BALL(String assignment, String size) {
        this.assignment = assignment;
        this.size = size;
    }

    void getInfo() {
        System.out.println("Мяч для игры в " + assignment + "\nРазмер: " + size);
    }
}