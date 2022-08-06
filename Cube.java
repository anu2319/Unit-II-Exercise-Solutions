import java.util.Scanner;

public class Cube
{
    private static int cubeSide;

    public int getCubeArea(int cubeSide)
    {
        return cubeSide * cubeSide;
    }

    public int getCubeSurfaceArea(int cubeSide)
    {
        return 6 * getCubeArea(cubeSide);
    }

    public int getvolume(int cubeSide)
    {
        return cubeSide * cubeSide * cubeSide;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Cube cube = new Cube();
        System.out.println("User Input to cube side is : ");
        cubeSide = sc.nextInt();
        System.out.println("Cube Area is : " + cube.getCubeArea(cubeSide));
        System.out.println("Cube Volume is : " + cube.getvolume(cubeSide));
        System.out.println("Cube Surface Area is : " + cube.getCubeSurfaceArea(cubeSide));
    }
}
