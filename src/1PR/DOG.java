public class DOG {

    private final String name;
    private final String color;
    private final int age;

    public DOG(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Собака по кличке " + name + "\nЛет: " + age + "\nЦвет: " + color);
    }
}