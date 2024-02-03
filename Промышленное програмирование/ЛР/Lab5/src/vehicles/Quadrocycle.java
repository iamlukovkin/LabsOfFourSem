package vehicles;

import engine.Vehicle;

public class Quadrocycle extends Vehicle {

    public Quadrocycle(
            String regNumber, String developer, String model,
            String numberVIN, String owner, String powerType)
    {
        super(regNumber, developer, model, numberVIN, owner, powerType);
    }

    @Override
    public void uniqueAction()
    {
        String messageText = "Квадроцикл " +
            getDeveloper() + ' ' + getModel() + " может ездить по бездорожью.";
        System.out.println(messageText);
    }
}
