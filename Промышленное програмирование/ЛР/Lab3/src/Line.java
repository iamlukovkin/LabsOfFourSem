import java.util.ArrayList;

public class Line 
{
    private float _kValue;
    private float _bValue;

    public Line(float kValue, float bValue)
    {
        _kValue = kValue;
        _bValue = bValue;
    }

    public float getKValue()
    {
        return _kValue;
    }

    public float[] getXAxisIntersect()
    {
        float x = -_bValue / _kValue;
        return new float[] {x, 0f};
    }

    public float[] getYAxisIntersect()
    {
        return new float[]{0f, _bValue};
    }

    public static float[] getIntersect(Line line1, Line line2)
    {
        float x = (line2._bValue - line1._bValue) / (line1._kValue - line2._kValue);
        float y = line1._kValue * x + line1._bValue;
        return new float[] {x, y};
    }

    public static ArrayList<ArrayList<Line>> getParallelLines(Line[] lines)
    {
        ArrayList<ArrayList<Line>> parallelLines = new ArrayList<ArrayList<Line>>();
        ArrayList<Float> kValues = new ArrayList<Float>();
        for (int i = 0; i < lines.length - 1; i++)
        {   
            if (!kValues.contains(lines[i].getKValue()))
                kValues.add(lines[i].getKValue());
            else
                continue;
            ArrayList<Line> temp = new ArrayList<Line>();
            temp.add(lines[i]);
            for (int j = i + 1; j < lines.length; j++)
            {
                if (lines[i].getKValue() == lines[j].getKValue())
                {
                    temp.add(lines[j]);   
                }
            }
            parallelLines.add(temp);
        }
        return parallelLines;
    }

    public String toString()
    {
        return "y = " + _kValue + "x + " + _bValue;
    }
}
