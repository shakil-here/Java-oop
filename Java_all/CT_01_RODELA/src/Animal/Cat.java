package Animal;

public class Cat {

    private String name;
    private String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void makeSound() {
        System.out.println(name + " is meowing");
    }

    {
        System.out.println("This class contains cats' information");
    }
}
