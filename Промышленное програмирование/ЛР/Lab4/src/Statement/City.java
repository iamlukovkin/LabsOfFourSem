package Statement;
public class City extends Place
{
    private boolean _isCapital = false;
    private static int _citiesCount = 0;

    public City(String name, float square, boolean isCapital) 
    {
        super(name, square);
        _isCapital = isCapital;
        _citiesCount++;
    }

    public City(String name, float square) 
    {
        super(name, square);
        _isCapital = false;
        _citiesCount++;
    }
    
    public City(String name) 
    {
        super(name);
        _isCapital = false;
        _citiesCount++;
    }

    public boolean getIsCapital() { return _isCapital; }

    @Override
    public String getInfo() 
    {
        return "Город " + getName() + ", площадь " + getSquare() + " км2\n";
    }

    public static int getCitiesCount() { return _citiesCount; }

    public boolean equals(City city) 
    { 
        return this.getName().equals(city.getName()) && this.getSquare() == city.getSquare(); 
    }

    public int hashCode() { return this.getName().hashCode(); }
}
