package lists.supplier;

import lists.entties.Animal;

import java.util.Random;
import java.util.function.Supplier;

public class AnimalSupplier implements Supplier<Animal> {

    @Override
    public Animal get() {
        return new Animal(new Random().nextInt(15) + 1, new NickSupplier().get());
    }
}
