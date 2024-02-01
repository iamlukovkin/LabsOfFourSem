package Statement;
import java.util.Arrays;

public final class State extends Place
{
    private Region[] _regions;

    public State(String name) { super(name); }

    public void setRegions(Region[] regions) 
    {
        _regions = regions;
        for (Region region : _regions) {
            this.setSquare(this.getSquare() + region.getSquare());
        }
    }

    public Region[] getRegions() { return _regions; }

    public void addRegion(Region region) 
    {
        _regions = Arrays.copyOf(_regions, _regions.length + 1);
        _regions[_regions.length - 1] = region;
        setSquare(getSquare() + region.getSquare());
    }

    public void addRegions(Region[] regions) 
    {
        for (Region region : regions)
            addRegion(region);
    }

    public City getCapital()
    {
        for (Region region : _regions)
            for (Area area : region.getAreas())
                for (City city : area.getCities())
                    if (city.getIsCapital())
                        return city;
        return null;
    }

    public int getRegionsCount() { return _regions.length; }

    public Region[] getPrimaryRegions()
    {
        Region[] primaryRegions = new Region[_regions.length];
        for (int i = 0; i < _regions.length; i++)
            if (_regions[i].getIsPrimary())
                primaryRegions[i] = _regions[i];
        return primaryRegions;
    }

    @Override
    public String getInfo() 
    {
        String info = "Государство " + getName() + ", площадь " + getSquare() + " км2\\n\n";
        for (Region region : _regions)
            info += region.getInfo();
        return info;
    }

    public boolean equals(State state)
    {
        return this.getName().equals(state.getName()) && this.getSquare() == state.getSquare();
    }

    public int hashCode() { return this.getName().hashCode(); }
}
