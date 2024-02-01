package Statement;
public abstract class Place 
{
    private String _name;
    private float _square;

    public Place(String name, float square) 
    {
        _name = name;
        _square = square;
    }

    public Place(String name)
    {
        _name = name;
        _square = 0f;
    }

    public String getName() { return _name; }
    public void setName(String name) { _name = name; };
    public float getSquare() { return _square; }
    public void setSquare(float square) {_square = square;};
    public abstract String getInfo();
}
