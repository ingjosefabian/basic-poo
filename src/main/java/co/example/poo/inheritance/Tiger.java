package co.example.poo.inheritance;

public class Tiger extends Feline {

    public Tiger(final int clawSize, final int fangsSize, final float weight) {
        super(clawSize, fangsSize, weight);
    }

    @Override
    public String makeSound() {
        return "gruuuuummm";
    }

    @Override
    public String hunt() {
        return "tiger hunting ....";
    }
}
