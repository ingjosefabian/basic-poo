package co.example.poo.inheritance;

public class Lion extends Feline {

    public Lion(final int clawSize, final int fangsSize, final float weight) {
        super(clawSize, fangsSize, weight);
    }

    @Override
    public String makeSound() {
        return "Graaaaaa";
    }

    @Override
    public String hunt() {
        return "lion hunting ....";
    }
}
