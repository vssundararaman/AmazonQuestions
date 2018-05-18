package amazon;

/**
 * How to check if given four points form a square
 * Given coordinates of four points in a plane, find if the four points form a square or not.
 * To check for square, we need to check for following.
 * a) All fours sides formed by points are same.
 * b) The angle between any two sides is 90 degree. (This condition is required as Quadrilateral also has same sides.
 */
public class FindSqure {

    public static void main(String[] args) {

        Point p1 = new Point(20, 10);
        Point p2 = new Point(10, 20);
        Point p3 = new Point(20, 20);
        Point p4 = new Point (10, 10);

        System.out.println("Is Square : " + isSquare(p1,p2,p3,p4));
    }


    static int distSquare(Point p, Point q){
        return (p.x-q.x)*(p.x-q.x) + (p.y-q.y)*(p.y - q.y);
    }

    //This function returns true if (p1,P2,P3,P4) form a square, otherwise false
    static boolean isSquare(Point p1, Point p2, Point p3, Point p4){

        int d2 = distSquare(p1,p2);
        int d3 = distSquare(p1,p3);
        int d4 = distSquare(p1,p4);

        // If lengths if (p1, p2) and (p1, p3) are same, then
        // following conditions must met to form a square.
        // 1) Square of length of (p1, p4) is same as twice
        //    the square of (p1, p2)
        // 2) p4 is at same distance from p2 and p3

        if (d2 == d3 && 2*d2 == d4)
        {
            int d = distSquare(p2, p4);
            return (d == distSquare(p3, p4) && d == d2);
        }

        // The below two cases are similar to above case
        if (d3 == d4 && 2*d3 == d2)
        {
            int d = distSquare(p2, p3);
            return (d == distSquare(p2, p4) && d == d3);
        }
        if (d2 == d4 && 2*d2 == d3)
        {
            int d = distSquare(p2, p3);
            return (d == distSquare(p3, p4) && d == d2);
        }

        return false;
    }
}

class Point{

    int x;

    int y;

    Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}