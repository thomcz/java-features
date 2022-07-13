package java17;

public class SealedClasses {
    // sealed – meaning they must define what classes are permitted to inherit from it using the permits keyword.
    public sealed interface JungleAnimal permits Monkey, Snake {
    }

    // final – preventing any further subclasses
    public final class Monkey implements JungleAnimal {
    }

    // non-sealed – allowing any class to be able to inherit from it.
    public non-sealed class Snake implements JungleAnimal {
    }

}
