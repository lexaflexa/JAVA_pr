public class MAIN {
    public static void main(String[] args) {
        DOG dog = new DOG("Тиша", "Чёрный", 3);
        BOOK book = new BOOK("Ведьмак", 400);
        BALL ball = new BALL("Баскетбол", "Большой");

        dog.getInfo();
        System.out.println("\n");
        book.getInfo();
        System.out.println("\n");
        ball.getInfo();
    }
}