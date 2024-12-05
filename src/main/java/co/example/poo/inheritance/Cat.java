package co.example.poo.inheritance;

public class Cat extends Feline {

    public Cat(final int clawSize, final int fangsSize, final float weight) {
        super(clawSize, fangsSize, weight);
    }

    @Override
    public String makeSound() {
        return "miauuuuuu";
    }

    @Override
    public String hunt() {
        return "cat hunting ....";
    }
}
