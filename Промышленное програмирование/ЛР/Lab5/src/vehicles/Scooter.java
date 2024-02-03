package vehicles;

import engine.Vehicle;

public class Scooter extends Vehicle
{
    public Scooter(
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
        String messageText = "Скутер " + getDeveloper() + ' ' + getModel() + " не имеет двигателя.";
        System.out.println(messageText);
    }

    @Override
    public void uniqueAction()
    {
        String messageText = "Скутер " + getDeveloper() + ' ' + getModel() + " уверенно ездит по городу.";
        System.out.println(messageText);
    }
}
