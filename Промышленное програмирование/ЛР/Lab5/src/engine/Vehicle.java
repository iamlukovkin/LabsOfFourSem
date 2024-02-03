package engine;

public class Vehicle implements VechileActions
{    
    private String _regNumber;
    private String _developer;
    private String _model;
    private String _numberVIN;
    private String _owner;
    private String _powerType;

    public Vehicle(
        String regNumber, String developer, String model,
        String numberVIN, String owner, String powerType)
    {
        _regNumber = regNumber;
        _developer = developer;
        _model = model;
        _numberVIN = numberVIN;
        _owner = owner;
        _powerType = powerType;
        sendInfo();
    }
    
    public Vehicle(String... args)
    {
        _regNumber = args[0];
        _developer = args[1];
        _model = args[2];
        _numberVIN = args[3];
        _owner = args[4];
        _powerType = args[5];
        sendInfo();
    }

    private void sendInfo()
    {
        String messageText = "\nИнициализирован объект:" +
            "\nРег. номер: " + getRegNumber() + 
            "\nПроизводитель: " + getDeveloper() +
            "\nМодель: " + getModel() + 
            "\nVIN: " + getNumberVIN() +
            "\nВладелец: " + getOwner() +
            "\nТип движущей силы: " + getPowerType();
        System.out.println(messageText);
    }


    @Override
    public void setRegNumber(String newNumber)
    { _regNumber = newNumber; }
    
    @Override
    public String getRegNumber() { return _regNumber; }

    @Override
    public void setDeveloper(String newDeveloper)
    { _developer = newDeveloper; }
    
    @Override
    public String getDeveloper() { return _developer; }

    @Override
    public void setModel(String newModel) {_model = newModel; }
    
    @Override
    public String getModel() { return _model; }
    
    @Override
    public void setNumberVIN(String newNumber) 
    { _numberVIN = newNumber; }
    
    @Override
    public String getNumberVIN() { return _numberVIN; }
    
    @Override
    public void setOwner(String newOwner) { _owner = newOwner; }
    
    @Override
    public String getOwner() { return _owner; }
    
    @Override
    public void setPowerType(String newType) 
    { _powerType = newType; }
    
    @Override
    public String getPowerType() { return _powerType; }

    public void uniqueAction() {}
}
