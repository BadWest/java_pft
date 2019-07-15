package ru.stqa.pft.sandbox;

class Point {
  public double x;
  public double y;

  public String toString() {
    return "("+x+";"+y+")";
  }
  public Point(double a, double b) {
    x = a;
    y = b;
  }

  public double distance(Point p) {
    return Math.sqrt( Math.pow(p.x-x,2) + Math.pow(p.y-y,2) );
  }

}

