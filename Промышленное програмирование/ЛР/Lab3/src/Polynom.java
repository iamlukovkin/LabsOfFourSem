public class Polynom 
{
    private int _degree;
    private int[] _coefficients;

    public Polynom(int degree, int[] coefficients)
    {
        _degree = degree;
        _coefficients = coefficients;
    }

    public static Polynom sumPolynomals(Polynom[] polynoms)
    {
        int maxDegree = polynoms[0]._degree;
        for (Polynom polynom : polynoms)
            if (polynom._degree > maxDegree)
                maxDegree = polynom._degree;

        int[] sumCoefficients = new int[maxDegree + 1];
        for (Polynom polynom : polynoms)
            for (int i = 0; i <= polynom._degree; i++)
                sumCoefficients[i] += polynom._coefficients[i];

        return new Polynom(maxDegree, sumCoefficients);
    }

    public String toString()
    {
        String stringInfo = "";

        for (int i = _degree; i >= 0; i--)
            if (i != 0)
                stringInfo += _coefficients[i] + "x^" + i + " + ";
            else
                stringInfo += String.valueOf(_coefficients[i]);

        return stringInfo;
    }
}
