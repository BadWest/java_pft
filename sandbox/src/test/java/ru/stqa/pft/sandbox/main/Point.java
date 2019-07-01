package ru.stqa.pft.sandbox.main;

import org.testng.Assert;
import org.testng.annotations.Test;
@Test
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

  public double distance(Point p) {
    return Math.sqrt( Math.pow(p.x-x,2) + Math.pow(p.y-y,2) );
  }

  public static void main(String[] args) {
    Point p1 = new Point();
    Point p2 = new Point(1,1);
    String result = "Растстояние между точками "+p1+" и "+p2+" равно "+p1.distance(p2);
    System.out.println(result);

    Assert.assertEquals(result, "Растстояние между точками (1.0;1.0) и (1.0;1.0) равно 0.0");
  }
}

