import java.util.Scanner;

public class Tile
{
    private int edge;
    private int area;
    Tile(int edge)
    {
        this.edge=edge;
        this.area=edge*edge;
    }
    int getArea()
    {
        return area;
    }
}
class Floor{
    private int length;
    private int width;
    Floor(int length, int width)
    {
        this.length=length;
        this.width=width;
    }
    void TotalTiles(Tile t)
    {
        double tileArea=t.getArea();
        double floorArea=length*width;
        double noofTile=floorArea/tileArea;
        System.out.println("Number of Tiles:"+noofTile);
    }
}
class NoOfTile
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter edge length of Tile:");
        int TileLength = sc.nextInt();
        Tile t = new Tile(TileLength);
        System.out.println("Enter the length and width of floor:");
        int flength = sc.nextInt();
        int fwidth = sc.nextInt();
        Floor f = new Floor(flength, fwidth);
        f.TotalTiles(t);
    }
}
