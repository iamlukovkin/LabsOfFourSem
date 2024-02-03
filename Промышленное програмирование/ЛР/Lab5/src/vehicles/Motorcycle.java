package vehicles;

import engine.Vehicle;

public class Motorcycle extends Vehicle {
    
    public Motorcycle(
        String regNumber, String developer, String model, 
        String numberVIN, String owner, String powerType)
    {
        super(
            regNumber, developer, model, 
            numberVIN, owner, powerType);
    }

    @Override
    public void jetFuel() {
        String messageText = "Мотоцикл " + getDeveloper() + ' ' + getModel() + " заправляется бензином.";
        System.out.println(messageText);
    }

    @Override
    public void uniqueAction()
    {
        String messageText = "Мотоцикл " + 
            getDeveloper() + ' ' + getModel() + " может ехать на одном колесе.";
        System.out.println(messageText);
    }
}
