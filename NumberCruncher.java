public class NumberCruncher
{
    private int number;

    public NumberCruncher(int number)
    {
        this.number = number;
    }

    public int getNumber()
    {
        return number;
    }

    public int getDouble()
    {
        return 2 * number;
    }

    public int getTriple()
    {
        return 3 * number;
    }

    public int getSquare()
    {
        return number * number;
    }

    public int getCube()
    {
        return number * number * number;
    }

    public static void main(String[] args)
    {
        NumberCruncher numberCruncher = new NumberCruncher(2);
        System.out.println("The Number is : " + numberCruncher.getNumber());
        System.out.println("Double of the Number is : " + numberCruncher.getDouble());
        System.out.println("Triple of the Number is : " + numberCruncher.getTriple());
        System.out.println("Square of the Number is : " + numberCruncher.getSquare());
        System.out.println("Cube of the Number is : " + numberCruncher.getCube());

    }

}
