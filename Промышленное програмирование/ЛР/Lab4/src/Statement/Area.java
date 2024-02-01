package Statement;
import java.util.Arrays;

public class Area extends Place 
{
    private City[] _cities;
    private static int _areasCount = 0;

    public Area(String name, City[] cities) 
    {
        super(name);
        setCities(cities);
        _areasCount++;
    }

    public Area(String name, float square) 
    {
        super(name, square);
        _areasCount++;
    }

    public Area(String name) 
    {
        super(name);
        _areasCount++;
    }

    public City[] getCities() { return _cities; }

    public void setCities(City[] cities) 
    { 
        _cities = cities; 
        for (City city : _cities)
            super.setSquare(super.getSquare() + city.getSquare());
    }

    public void setCities(City city) 
    { 
        _cities = new City[] {city}; 
        setSquare(city.getSquare());
    }
    
    public void addCity(City city) 
    { 
        _cities = Arrays.copyOf(_cities, _cities.length + 1); 
        _cities[_cities.length - 1] = city; 
        setSquare(getSquare() + city.getSquare());
    }

    public static int getAreasCount() { return _areasCount; }

    @Override
    public String getInfo() 
    {
        String info = "Область " + getName() + ", площадь " + getSquare() + " км2\\n\n";
        for (City city : _cities)
            info += city.getInfo();
        return info;
    }
    
    public boolean equals(Area area)
    {
        return this.getName().equals(area.getName()) && this.getSquare() == area.getSquare();
    }

    public int hashCode() { return this.getName().hashCode(); }
}
