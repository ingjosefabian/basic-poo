package co.example.poo;

import co.example.poo.inheritance.Cat;
import co.example.poo.inheritance.Lion;
import co.example.poo.inheritance.Tiger;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        final var felines = List.of(
                new Cat(1, 1, 2.5f),
                new Tiger(2, 2, 40f),
                new Cat(1, 1, 3f),
                new Lion(3, 3, 50f),
                new Tiger(2, 1, 45f)
        );

        felines.forEach(feline -> System.out.printf("\nFeline sound : %s - Feline hunting : %s", feline.makeSound(), feline.hunt())
        );

    }
}