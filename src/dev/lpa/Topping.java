package dev.lpa;

public enum Topping {
    // These are really just a class, and the constants are instnaces of the class. We can add fields, frex.
    // Can add fields, methods, even constructors.


    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    public double getPrice(){
        return switch (this){
            case BACON -> 1.5;
            case CHEDDAR -> 1.0;
            default -> 0.0;
        };
    }

}
