public class OldPointMain {

    public static void printPoint (OldPoint aPoint) {
        System.out.println("(" + aPoint.x + "," + aPoint.y + ")");
    }

    public static void main (String[] args) {
        OldPoint a = new OldPoint();
        OldPoint b = new OldPoint();

        printPoint(a);

        a.x = 5;
        b.y = 2;
        printPoint(a);
        printPoint(b);
    }
}