public class Exercise09_09 {
  public static void main(String[] args) {
    RegularPolygon polygon1 = new RegularPolygon();
    RegularPolygon polygon2 = new RegularPolygon(6, 4);
    RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

    System.out.println("Polygon 1:");
    System.out.println("Number of sides: " + polygon1.getNumberOfSides());
    System.out.println("Perimeter: " + polygon1.getPerimeter());
    System.out.println("Area: " + polygon1.getArea());

    System.out.println("\nPolygon 2:");
    System.out.println("Number of sides: " + polygon2.getNumberOfSides());
    System.out.println("Perimeter: " + polygon2.getPerimeter());
    System.out.println("Area: " + polygon2.getArea());

    System.out.println("\nPolygon 3:");
    System.out.println("Number of sides: " + polygon3.getNumberOfSides());
    System.out.println("Perimeter: " + polygon3.getPerimeter());
    System.out.println("Area: " + polygon3.getArea());
  }
}

class RegularPolygon {
  private int numberOfSides = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
    
    public RegularPolygon() {
        this.numberOfSides = numberOfSides;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public RegularPolygon(int numberOfSides, double side) {
        this.numberOfSides = numberOfSides;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int numberOfSides, double side, double x, double y) {
        this.numberOfSides = numberOfSides;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public int getPerimeter() {
        return (int) (numberOfSides * side);
    }

    public int getArea() {
        return (int) ((numberOfSides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / numberOfSides)));
    }
}