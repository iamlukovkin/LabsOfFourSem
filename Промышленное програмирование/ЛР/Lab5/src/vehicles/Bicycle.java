package vehicles;

import engine.Vehicle;

public class Bicycle extends Vehicle {
    public Bicycle(String... args) { super(args); }

    @Override
    public void jetFuel() {
        String messageText = "Велосипеды не имеют двигателя, поэтому им не нужно заправляться.";
        System.out.println(messageText);
    }

    @Override
    public void uniqueAction()
    {
        String messageText = "Велосипед " + 
            getDeveloper() + ' ' + getModel() + " делает флип.";
        System.out.println(messageText);
    }
}
