public class Ball_test {
    public static void main(String[] args) {
        Ball b1 = new Ball(1.0, 3.5);

        System.out.println(b1.getX() + " " + b1.getY());

        b1.setXY(3.0, 1.0);

        System.out.println(b1.getX() + " " + b1.getY());

        b1.setX(12.0);
        System.out.println(b1.toString());
    }
}