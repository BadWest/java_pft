package ru.stqa.pft.sandbox;

class Point {
  private static double x;
  private static double y;

  public String toString() {
    return "("+x+";"+y+")";
  }
  public Point() {
    x = 0.0;
    y = 0.0;
  }
  public Point(double a, double b) {
    x = a;
    y = b;
  }
  public static double distance(Point p) {
    return Math.sqrt( Math.pow(p.x-x,2) + Math.pow(p.y-y,2) );
  }
}

