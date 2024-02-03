package vehicles;

import engine.Vehicle;

public class Auto extends Vehicle {
    
    public Auto(
        String regNumber, String developer, String model, 
        String numberVIN, String owner, String powerType)
    {
        super(
            regNumber, developer, model, 
            numberVIN, owner, powerType);
    }

    @Override
    public void jetFuel() 
    {
        String messageText = "Автомобиль " + getDeveloper() + ' ' + getModel() + " заправляется бензином.";
        System.out.println(messageText);
    }

    @Override
    public void uniqueAction()
    {
        String messageText = "Автомобиль " + 
            getDeveloper() + ' ' + getModel() + " дрифтует.";
        System.out.println(messageText);
    }
}
