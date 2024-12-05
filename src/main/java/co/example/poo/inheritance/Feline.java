package co.example.poo.inheritance;

public abstract class Feline {

    private int clawSize;

    private int fangsSize;

    private float weight;

    public Feline(final int clawSize, final int fangsSize, final float weight) {
        this.clawSize = clawSize;
        this.fangsSize = fangsSize;
        this.weight = weight;
    }

    public abstract String makeSound();

    public abstract String hunt();

}
