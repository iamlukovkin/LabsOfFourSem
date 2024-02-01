package Statement;
public class Region extends Place
{
    private Area[] _areas;
    private static int _regionsCount = 0;
    private boolean _isPrimary = false;

    public Region(String name, Area[] areas, boolean isPrimary) 
    {
        super(name);
        _areas = areas;
        _isPrimary = isPrimary;
        for (Area area : _areas) {
            this.setSquare(this.getSquare() + area.getSquare());
        }
        _regionsCount++;
    }

    public Region(String name, Area[] areas)
    {
        super(name);
        _areas = areas;
        for (Area area : _areas) {
            this.setSquare(this.getSquare() + area.getSquare());
        }
        _regionsCount++;
    }

    public Region(String name, float square)
    {
        super(name, square);
        _isPrimary = false;
        _regionsCount++;
    }

    public Region(String name)
    {
        super(name);
        _isPrimary = false;
        _regionsCount++;
    }

    public Area[] getAreas() { return _areas; }

    public float getSquare() { return super.getSquare(); }

    public boolean getIsPrimary() { return _isPrimary; }
    public void setIsPrimary(boolean isPrimary) { _isPrimary = isPrimary; }

    public static int getRegionsCount() { return _regionsCount; }

    @Override
    public String getInfo() {
        String info = "Регион " + getName() + ", площадь " + getSquare() + " км2\\n\n";
        for (Area area : _areas)
            info += area.getInfo();
        return info;
    }

    public boolean equals(Region region) 
    {
        return this.getName().equals(region.getName()) && this.getSquare() == region.getSquare();
    }

    public int hashCode() { return this.getName().hashCode(); }
}
