package engine;

interface VechileActions 
{
    void setRegNumber(String newNumber);
    String getRegNumber();

    void setDeveloper(String newDeveloper);
    String getDeveloper();
    
    void setModel(String newModel);
    String getModel();
    
    void setNumberVIN(String newNumber);
    String getNumberVIN();
    
    void setOwner(String newOwner);
    String getOwner();
    
    void setPowerType(String newType);
    String getPowerType();

    default void jetFuel()
    {
        System.out.println(
            getDeveloper() + 
            ' ' + 
            getModel() +
            " заправляется."
        );
    }
    
    default void makeRepair()
    {
        System.out.println(
            getDeveloper() + 
            ' ' + 
            getModel() +
            " ремонтируется."
        );
    }
    default void makeService()
    {
        System.out.println(
            getDeveloper() + 
            ' ' + 
            getModel() +
            " обслуживается."
        );
    }
    default void makeReview()
    {
        System.out.println(
            getDeveloper() + 
            ' ' + 
            getModel() +
            " проходит техосмотр."
        );
    }
}
